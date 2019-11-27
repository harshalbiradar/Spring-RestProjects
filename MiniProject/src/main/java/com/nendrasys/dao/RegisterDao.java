/**
 * 
 */
package com.nendrasys.dao;

import java.util.List;

import com.nendrasys.bo.RegisterBo;


/**
 * @author user
 *
 */
public interface RegisterDao {

	public int insert(RegisterBo bo);
	public List<RegisterBo> getTeacherDetailsByRole(String role);
	
	public RegisterBo  getTeacherById(int id);
	public   int  updateTeacherById(RegisterBo bo);
	public   int  deleteTeacherById(int id);
}
