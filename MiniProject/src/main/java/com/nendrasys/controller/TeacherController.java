/**
 * 
 */
package com.nendrasys.controller;





import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nendrasys.command.RegisterCommand;
import com.nendrasys.command.TeacherCommand;
import com.nendrasys.dto.RegisterDto;
import com.nendrasys.service.RegisterService;


/**
 * @author user
 *
 */
@Controller
public class TeacherController {

	
	  @Autowired
	  private RegisterService service;
	  
	  
	  @RequestMapping("/teacherList.htm")
		public String search(@RequestParam String role,Map<String, Object> map) {
			List<RegisterDto> listDto=null;
			//read additional req param values
			System.out.println(role);
			//use service class
			listDto=service.fetchTeacherDetailsByRole(role);
			map.put("teacherList",listDto);
			
		return "show_teachers";
	}
	  
	  
	// for InitialPahse request and formBackingObject(-,-)
		@GetMapping("/updateTeacher.htm")
		public String showUpdateForm(@RequestParam int id, Map<String, Object> map) {
			
			
			
			RegisterDto dto = null;
			// create and RegisterC class obj having dynamic initial values
			TeacherCommand cmd=new TeacherCommand();
			// read customer number from hyperlink
			
			// use service
			dto = service.fetchTeacherById(id);
			BeanUtils.copyProperties(dto, cmd);
			// keep Command class obj as model attribute
			map.put("teacherCmd", cmd);
			// return form page as lvn
			return "update_teacher";

		} 
	  
		// for Postback request
		@RequestMapping(value = "/updateTeacher.htm", method = RequestMethod.POST)
		public String updateCustomer(Map<String, Object> map, @ModelAttribute("teacherCmd") TeacherCommand cmd) {
			RegisterDto dto = null;
			String resultMsg = null;
			List<RegisterDto> listDTO = null;
			ModelAndView mav = null;
			// Convert Command class obj to DTO class obj
			dto = new RegisterDto();
			System.out.println("id-----------"+cmd.getId());
			BeanUtils.copyProperties(cmd, dto);
			// use service
			resultMsg = service.modifyTeacherById(dto);
			System.out.println("------------"+resultMsg);
		/*
		 * listDTO = service.fetchTeacherDetailsByRole(role); // create and return MAV
		 * obj
		 * 
		 * map.put("teacherList",listDto);
		 */
			map.put("resMsg", resultMsg);
			return "update_teacher";
		}// method
	  
	  
		@RequestMapping(value = "/deleteTeacher.htm")
		public String deleteCustomer(HttpServletRequest req, Map<String, Object> map) {
			int id = 0;
			String resMsg = null;
			List<RegisterDto> listDTO = null;
			// read additonal req param values
			
			id = Integer.parseInt(req.getParameter("id"));
			System.out.println(id);
			// use Service class
			resMsg = service.removeTeacherById(id);
			
			map.put("resMsg", resMsg);
			// return logical View name
			return "show_teachers";
		}// method
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
