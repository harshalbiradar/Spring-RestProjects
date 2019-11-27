package com.nendrasys.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nendrasys.command.RegisterCommand;
import com.nendrasys.dto.RegisterDto;
import com.nendrasys.service.RegisterService;

@Controller
public class RegistrationController {


	@Autowired 
	private RegisterService service;

	@GetMapping("/about_us.htm")
	public String about_usPage() {
		
		return "about_us";
	}
	
	@GetMapping("/contact_us.htm")
	public String contact_usPage() {
		return "contact_us";
	}

	@GetMapping("/home.htm")
	public String homePage(){
		return "home";
	}

	//for initial phase request
	@GetMapping("/register.htm")
	public String registrationPage(@ModelAttribute("registerCommand") RegisterCommand regCmd,Model model){

		model.addAttribute("rolesList", getRoles());
		model.addAttribute("classId", getClassId());
		regCmd.setFirstName("harshal");

		return "registration_form";
	}


	@ModelAttribute("rolesList")
	public List<String> getRoles() {
		List<String> rolesList = new ArrayList<String>();
		rolesList.add("---Select---");
		rolesList.add("ROLE_teacher");
		rolesList.add("ROLE_student");

		return rolesList;
	}

	@ModelAttribute("classId")
	public List<String> getClassId() {
		List<String> classId = new ArrayList<String>();
		classId.add("---Select---");
		classId.add("Teacher_FE");
		classId.add("Teacher_SE");
		classId.add("Teacher_TE");
		classId.add("Teacher_BE");
		classId.add("Student_FE");
		classId.add("Student_SE");
		classId.add("Student_TE");
		classId.add("Student_BE");

		return classId;
	}




	//postback request
	@RequestMapping(value ="/register",method = RequestMethod.POST)
	public String loginProcess(Map<String,Object> map,
			@ModelAttribute("registerCommand") RegisterCommand cmd) {
		System.out.println("--------------");
		System.out.println(  cmd.toString());


		RegisterDto dto=null;
		String result=null;
		//copy cmd to dto
		dto=new RegisterDto();
		BeanUtils.copyProperties(cmd, dto);
		//use service
		result=service.register(dto);
		map.put("registerResult", result);

		return "result";
	}





}
