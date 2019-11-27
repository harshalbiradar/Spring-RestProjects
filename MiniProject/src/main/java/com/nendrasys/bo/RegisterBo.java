package com.nendrasys.bo;

public class RegisterBo {
	
	private int id;
	private String role;
	private String class_Id;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private String email_Id;
	private String  contact_No;
	private String address;
	private String username;
	private String password;
	private String conformPassword;
	private int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConformPassword() {
		return conformPassword;
	}
	public void setConformPassword(String conformPassword) {
		this.conformPassword = conformPassword;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "RegisterBo [id=" + id + ", role=" + role + ", class_Id=" + class_Id + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", age=" + age + ", email_Id=" + email_Id
				+ ", contact_No=" + contact_No + ", address=" + address + ", username=" + username + ", password="
				+ password + ", conformPassword=" + conformPassword + ", status=" + status + ", getId()=" + getId()
				+ ", getRole()=" + getRole() + ", getClass_Id()=" + getClass_Id() + ", getFirstName()=" + getFirstName()
				+ ", getMiddleName()=" + getMiddleName() + ", getLastName()=" + getLastName() + ", getAge()=" + getAge()
				+ ", getEmail_Id()=" + getEmail_Id() + ", getContact_No()=" + getContact_No() + ", getAddress()="
				+ getAddress() + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword()
				+ ", getConformPassword()=" + getConformPassword() + ", getStatus()=" + getStatus() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
