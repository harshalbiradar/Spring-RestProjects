package com.nendrasys.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class CustomSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler{
	 @Override
	    protected String determineTargetUrl(HttpServletRequest request, HttpServletResponse response) {
	        // Get the role of logged in user
	        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	        String role = auth.getAuthorities().toString();
	        System.out.println(role);
	        String targetUrl = "";
	        if(role.contains("principal")) {
	            targetUrl = "/principal.htm";
	        }else if(role.contains("teacher")) {
	        	targetUrl="/teacher.htm";
	        }else if(role.contains("student")) {
	        	targetUrl="/student.htm";
	        } else {
	        	targetUrl = "/accessDenied";
	        }
	        //TODO studetend mapping 
	        //TODO teacher mapping
	        return targetUrl;
	    }
}
