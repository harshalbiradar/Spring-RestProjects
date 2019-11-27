package com.nendrasys.service;

import java.util.List;

import com.nendrasys.dto.RegisterDto;



public interface RegisterService {

	
	public String register(RegisterDto dto);
	public List<RegisterDto> fetchTeacherDetailsByRole(String role);

	public RegisterDto fetchTeacherById(int id);
	public  String modifyTeacherById(RegisterDto dto);
	public  String  removeTeacherById(int id);
	
	
	
}
