package com.nendrasys.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nendrasys.dto.RegisterDto;
import com.nendrasys.service.RegisterService;

@Controller
public class StudentController {

	
	  @Autowired
	  private RegisterService service;
	  
	  
	  @RequestMapping("/studentList.htm")
		public String search(@RequestParam String role,Map<String, Object> map) {
			List<RegisterDto> listDto=null;
			//read additional req param values
			System.out.println(role);
			//use service class
			listDto=service.fetchTeacherDetailsByRole(role);
			map.put("studentList",listDto);
			
		return "show_students";
	  }
	
	  @RequestMapping("/studentList1.htm")
		public String search1(@RequestParam String role,Map<String, Object> map) {
			List<RegisterDto> listDto=null;
			//read additional req param values
			System.out.println(role);
			//use service class
			listDto=service.fetchTeacherDetailsByRole(role);
			map.put("studentList",listDto);
			
		return "show_students1";
	  }
	  @RequestMapping("/studentList2.htm")
			public String search2(@RequestParam String role,Map<String, Object> map) {
				List<RegisterDto> listDto=null;
				//read additional req param values
				System.out.println(role);
				//use service class
				listDto=service.fetchTeacherDetailsByRole(role);
				map.put("studentList",listDto);
				
			return "show_students2";
		  }
	
}
