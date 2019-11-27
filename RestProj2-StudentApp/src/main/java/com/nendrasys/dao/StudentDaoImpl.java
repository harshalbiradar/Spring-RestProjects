package com.nendrasys.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nendrasys.bo.StudentBo;
import com.nendrasys.dto.StudentDto;


@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{
	
	private static final String GET_ALL_STUDENT="SELECT ID,NAME,AGE,COURSE,FEE FROM STUDENT";

	@Autowired
	private JdbcTemplate jt;
	
	
	public List<StudentDto> fetchAllStudent() {
		
		//in BeanPropertyRowMapper only one condition is property name and database column name 
				//should be same required
				
				BeanPropertyRowMapper<StudentDto> bprm=null;
				List<StudentDto> listDtO=null;
				bprm=new BeanPropertyRowMapper<StudentDto>(StudentDto.class);
				listDtO=(List<StudentDto>) jt.query(GET_ALL_STUDENT, new RowMapperResultSetExtractor(bprm));
				
				return listDtO;
		
		
	}

}
