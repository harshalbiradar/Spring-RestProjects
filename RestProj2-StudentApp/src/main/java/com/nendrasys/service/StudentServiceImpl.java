package com.nendrasys.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringWriter;
import java.util.List;

import javax.xml.transform.stream.StreamResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;

import com.nendrasys.dao.StudentDao;
import com.nendrasys.dto.StudentDto;
import com.nendrasys.dto.StudentDtoss;



@Service("/studentService")
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private Jaxb2Marshaller jaxMarshaller;
	
	
	public Jaxb2Marshaller getJaxMarshaller() {
		return jaxMarshaller;
	}


	public void setJaxMarshaller(Jaxb2Marshaller jaxMarshaller) {
		this.jaxMarshaller = jaxMarshaller;
	}
	
	
	
	@Autowired
	private StudentDao dao;
	
	public StudentDtoss getAllStudet() throws FileNotFoundException {
		List<StudentDto> listdto=dao.fetchAllStudent();
		StringWriter wr=new StringWriter();
		FileOutputStream file = new FileOutputStream("D:\\SpringWorkspace\\RestProj2-StudentApp\\student1.xml");
		//copy all bo to dto
		
		StudentDtoss lidto=new StudentDtoss();	
		lidto.setDtosss(listdto);
		System.out.println(listdto.size());
		getJaxMarshaller().marshal(lidto, new StreamResult(wr));;
	
		return lidto;
	}

	
	
	
	

}
