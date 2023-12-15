package com.entities;
// StudentId	fname	lname	age	gender	fathername	phone	address	ClassId	rollno	password
/**
 * 
 */
public class Student {
	private int StudentId;
	private String fname;
	private String lname;
//	private int age;
//	private enum gender{Male, Female, Transgender};
	private String fathername;
	private String phone;
	private String address;
//	private int ClassId;
//	private int rollno;
	private String password;
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	public int getClassId() {
//		return ClassId;
//	}
//	public void setClassId(int classId) {
//		ClassId = classId;
//	}
//	public int getRollno() {
//		return rollno;
//	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public void setRollno(int rollno) {
//		this.rollno = rollno;
//	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", fname=" + fname + ", lname=" + lname + ", fathername=" + fathername + ", phone=" + phone + ", address=" + address + ", password=" + password + "]";
	}
	
	
	
	
	
}
