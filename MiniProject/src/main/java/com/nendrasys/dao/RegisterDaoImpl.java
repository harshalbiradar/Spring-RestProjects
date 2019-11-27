/**
 * 
 */
package com.nendrasys.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Repository;

import com.nendrasys.bo.RegisterBo;

/**
 * @author user
 *
 */
@Repository("registerDao")
public class RegisterDaoImpl implements RegisterDao {

	private static final String REGISTRATION_QUERY="INSERT INTO REGI VALUES(REG_SEQ1.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String GET_TEACHER_BY_ROLE="SELECT ID,CLASS_ID,FIRSTNAME,MIDDLENAME,LASTNAME,AGE,EMAIL_ID,CONTACT_NO,ADDRESS,ROLE,USERNAME,PASSWORD FROM REGI WHERE ROLE=?"; 
	private static final String GET_TEACHER_BY_ID="SELECT ID,CLASS_ID,FIRSTNAME,MIDDLENAME,LASTNAME,AGE,EMAIL_ID,CONTACT_NO,ADDRESS,ROLE,USERNAME,PASSWORD FROM REGI WHERE id=?";
	private static final  String  UPDATE_TEACHER_BY_ID="UPDATE REGI SET CLASS_ID=?,FIRSTNAME=?,MIDDLENAME=?,LASTNAME=?,AGE=?,EMAIL_ID=?,CONTACT_NO=?,ADDRESS=?,ROLE=?,USERNAME=? WHERE ID=?";
	private static final  String  DELETE_TEACHER_BY_ID="DELETE FROM REGI  WHERE ID=?";
	
	
	
	
	
	@Autowired
	private JdbcTemplate jt;


	public int insert(RegisterBo bo) {
		
		int status=1;
		bo.setStatus(status);
		System.out.println(bo.toString());
		int count=0;
		count=jt.update(REGISTRATION_QUERY,bo.getClass_Id(),bo.getFirstName(),
				bo.getMiddleName(),bo.getLastName(),bo.getAge(),bo.getEmail_Id(),
				bo.getContact_No(),bo.getAddress(),bo.getRole(),bo.getUsername(),bo.getPassword(),bo.getStatus());

		return count;
	}


	@Override
	public List<RegisterBo> getTeacherDetailsByRole(String role) {

		List<RegisterBo> listBo=jt.query(GET_TEACHER_BY_ROLE, new
				ResultSetExtractor<List<RegisterBo>>() {

			@Override public List<RegisterBo> extractData(ResultSet rs) throws
			SQLException, DataAccessException {

				List<RegisterBo> list = new ArrayList<RegisterBo>();
				while(rs.next()){
					RegisterBo bo=new RegisterBo(); 
					bo.setId(rs.getInt(1));
					bo.setClass_Id(rs.getString(2));
					bo.setFirstName(rs.getString(3));
					bo.setMiddleName(rs.getString(4));
					bo.setLastName(rs.getString(5));
					bo.setAge(rs.getInt(6));
					bo.setEmail_Id(rs.getString(7));;
					bo.setContact_No(rs.getString(8));
					bo.setAddress(rs.getString(9));
					bo.setRole(rs.getString(10));
					bo.setUsername(rs.getString(11));
					bo.setPassword(rs.getString(12)); 
					list.add(bo);
	
				}
				return list;
			}
		},role );

			System.out.println("---------------"+listBo.toString());
		return listBo;
	}


	
	
	
	@Override
	public RegisterBo getTeacherById(int id) {
		
		RegisterBo bo=null;
		bo=jt.queryForObject(GET_TEACHER_BY_ID,
				                                (rs,index)->{
				                                	RegisterBo bo1=new RegisterBo(); 
				                					bo1.setId(rs.getInt(1));
				                					bo1.setClass_Id(rs.getString(2));
				                					bo1.setFirstName(rs.getString(3));
				                					bo1.setMiddleName(rs.getString(4));
				                					bo1.setLastName(rs.getString(5));
				                					bo1.setAge(rs.getInt(6));
				                					bo1.setEmail_Id(rs.getString(7));;
				                					bo1.setContact_No(rs.getString(8));
				                					bo1.setAddress(rs.getString(9));
				                					bo1.setRole(rs.getString(10));
				                					bo1.setUsername(rs.getString(11));
				                					bo1.setPassword(rs.getString(12)); 
				                                	return bo1;
				                                },
				                                id);
				              System.out.println("for teacher edit:: "+bo.toString());                 
		
		return bo;
		
	
	}


	@Override
	public int updateTeacherById(RegisterBo bo) {
		
		
		int count=0;
		count=jt.update(UPDATE_TEACHER_BY_ID,bo.getClass_Id(),bo.getFirstName(),bo.getMiddleName(),bo.getLastName(),bo.getAge(),bo.getEmail_Id(),bo.getContact_No(),bo.getAddress(),bo.getRole(),bo.getUsername(),bo.getId());
		return count;
		
	
		
	}


	@Override
	public int deleteTeacherById(int id) {
		int  count=0;
		count=jt.update(DELETE_TEACHER_BY_ID,id);
		return count;
	}
	
	
	
	
	
	
	
	
	
	

	}
