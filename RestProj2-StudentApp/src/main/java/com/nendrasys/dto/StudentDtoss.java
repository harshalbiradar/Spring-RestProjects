package com.nendrasys.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "studentDtoss")
public class StudentDtoss {
	
	private List<StudentDto> dtosss;

	public List<StudentDto> getDtosss() {
		return dtosss;
	}

	public void setDtosss(List<StudentDto> dtosss) {
		this.dtosss = dtosss;
	}

	

	

}
