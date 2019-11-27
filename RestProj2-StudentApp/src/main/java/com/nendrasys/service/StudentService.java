package com.nendrasys.service;


import java.io.FileNotFoundException;
import java.io.StringWriter;

import com.nendrasys.dto.StudentDtoss;


public interface StudentService {

	public StudentDtoss getAllStudet() throws FileNotFoundException;
	
	
}
