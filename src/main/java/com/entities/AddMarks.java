package com.entities;

public class AddMarks {
	private int ResultId;
	private int ClassId;
	private int SubjectId;
	private int StudentId;
	private int Marks;
	
	
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public int getResultId() {
		return ResultId;
	}
	public void setResultId(int resultId) {
		ResultId = resultId;
	}
	public int getClassId() {
		return ClassId;
	}
	public void setClassId(int classId) {
		ClassId = classId;
	}
	public int getSubjectId() {
		return SubjectId;
	}
	public void setSubjectId(int subjectId) {
		SubjectId = subjectId;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	
	public AddMarks() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddMarks [ResultId=" + ResultId + ", ClassId=" + ClassId + ", SubjectId=" + SubjectId + ", StudentId="
				+ StudentId + ", Marks=" + Marks + "]";
	}
	
	
}
