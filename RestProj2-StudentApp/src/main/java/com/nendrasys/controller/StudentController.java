/**
 * 
 */
package com.nendrasys.controller;

import java.io.FileNotFoundException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nendrasys.bo.StudentBo;
import com.nendrasys.dto.StudentDto;
import com.nendrasys.dto.StudentDtoss;
import com.nendrasys.service.StudentService;


/**
 * @author user
 *
 */										//@RestController = @Controller + @ResponseBody
@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	public StudentController() {
		System.out.println("StudentController::Constructor");
	}
	
	
	@GetMapping("/studentList")
	@ResponseBody
	public StudentDtoss getStudents() throws FileNotFoundException {
		
		
		//copy cmd to dto
		//StringWriter swrr=service.getAllStudet();
		StudentDtoss sdo=service.getAllStudet();
		//String str=swrr.toString();
		return sdo;
	}

	
	/*
		@RequestMapping("/list_emps")
		public String empSearch(Map<String, Object> map) {
			List<EmployeeDTO> listDTO=null;
			//use service
			listDTO=service.fetchEmpDetails();
			//keep listDTO obj in Map object
			System.out.println(listDTO);
			map.put("Login_List", listDTO);
		return "show_emps";*/
	
	
	
	
	
}
