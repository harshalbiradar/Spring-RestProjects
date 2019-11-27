/**
 * 
 */
package com.nendrasys.command;

/**
 * @author user
 *
 */
public class TeacherCommand {
	
	private int id;
	private String class_Id;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private String email_Id;
	private String contact_No;
	private String address;
	private String role;
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClass_Id() {
		return class_Id;
	}
	public void setClass_Id(String class_Id) {
		this.class_Id = class_Id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public String getContact_No() {
		return contact_No;
	}
	public void setContact_No(String contact_No) {
		this.contact_No = contact_No;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "TeacherCommand [id=" + id + ", class_Id=" + class_Id + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", age=" + age + ", email_Id=" + email_Id + ", contact_No="
				+ contact_No + ", address=" + address + ", role=" + role + ", username=" + username + "]";
	}
	
	
	
	
	
	
	

}
