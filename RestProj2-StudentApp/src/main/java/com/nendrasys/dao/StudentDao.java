package com.nendrasys.dao;

import java.util.List;

import com.nendrasys.bo.StudentBo;
import com.nendrasys.dto.StudentDto;

public interface StudentDao {

	public List<StudentDto> fetchAllStudent();
	
	
}
