/**
 * 
 */
package com.nendrasys.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nendrasys.bo.RegisterBo;
import com.nendrasys.dao.RegisterDao;
import com.nendrasys.dto.RegisterDto;


/**
 * @author user
 *
 */
@Service("registerservice")
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterDao dao;
	
	
	public String register(RegisterDto dto) {
		/* int status=1; */
		RegisterBo bo=null;
		//convert dto to bo
		bo=new RegisterBo();
		/*
		 * dto.setStatus(status); System.out.println(dto.getStatus());
		 */
		BeanUtils.copyProperties(dto, bo);
		//use dao
		int count=dao.insert(bo);
		if(count==0) 
			return bo.getFirstName()+" your Registration is not successful";
		else 
			return bo.getFirstName()+" your Registration is  successful";
		
	}


	@Override
	public List<RegisterDto> fetchTeacherDetailsByRole(String role) {
		List<RegisterBo> listBo=null;
		List<RegisterDto> listDto=null;
		RegisterDto dto=null;
		//use DAO
		listBo=dao.getTeacherDetailsByRole(role);
		//copy listBO to listDTO
			listDto=new ArrayList();
		for(RegisterBo bo:listBo) {
			dto=new RegisterDto();
			BeanUtils.copyProperties(bo, dto);
			listDto.add(dto);
		}
		
		return listDto;
	}//method 

	//for edit Teacher data
	@Override
	public RegisterDto fetchTeacherById(int id) {
	
		
		RegisterBo bo=null;
		RegisterDto dto=new RegisterDto();
		//use DAO
		bo=dao.getTeacherById(id);
		//copy BO  to DTO
		
		BeanUtils.copyProperties(bo,dto);
		return dto;
		
	
	}


	@Override
	public String modifyTeacherById(RegisterDto dto) {
		RegisterBo bo=null;
		int count=0;
		//convert DTO to BO
		bo=new RegisterBo();
	   BeanUtils.copyProperties(dto,bo);
	   //use DAO
	   count=dao.updateTeacherById(bo);
		if(count==0)
			return "Record not found for updation";
		else
			return "Record  found and updated";
	}


	@Override
	public String removeTeacherById(int id) {
		int count=0;
		//use DAO
		count=dao.deleteTeacherById(id);
		if(count==0)
			return "Teacher not found for Deletion";
		else
			return "Teacher found and Deleted";
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

}
