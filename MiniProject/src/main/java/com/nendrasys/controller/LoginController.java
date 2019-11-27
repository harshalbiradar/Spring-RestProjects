/**
 * 
 */
package com.nendrasys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author user
 *
 */
@Controller
public class LoginController {
	
	/*
	 * @RequestMapping("/login") public String loginPage() { return "login"; }
	 * 
	 * @RequestMapping("/logout") public String logOut() { return "logout"; }
	 */
	
	
	
	
	
	  
    @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "home";
    }
    
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String studentPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "student";
    }
 
    @RequestMapping(value = "/teacher", method = RequestMethod.GET)
    public String teacherPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "teacher";
    }
     
    @RequestMapping(value = "/principal.htm", method = RequestMethod.GET)
    public String principalPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "principal";
    }
 
    @RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "accessDenied";
    }
 
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }
 
    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }
 
    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication();
 
        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        // get user from DB using userName
        return userName;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
