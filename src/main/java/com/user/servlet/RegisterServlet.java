package com.user.servlet;

import java.io.IOException;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.DAO.StudnetDaoImp;
import com.DB.DbConnect;
import com.entities.Student;

@WebServlet("/studentreg")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String fname = req.getParameter("fname");
			String lname = req.getParameter("lname");
			String password = req.getParameter("password");
//			int age =Integer.parseInt(req.getParameter("age"));
//			int ClassId = Integer.parseInt(req.getParameter("ClassId"));
			String phone = req.getParameter("phone");
			String address = req.getParameter("address");
			String fatherName = req.getParameter("fathername");
//			int rollno = Integer.parseInt(req.getParameter("rollno"));
			
			 
//			System.out.println(fname+" "+lname+" "+password+" "+phone+" "+address+" "+fatherName);
			
			 Student std = new Student(); 
			 std.setFname(fname); 
			 std.setLname(lname);
			 std.setAddress(address); 
//			 std.setAge(age); 
			 std.setFathername(fatherName);
			 std.setPassword(password); 
//			 std.setClassId(ClassId);; 
			 std.setPhone(phone);
//			 std.setRollno(rollno);
//			 
			
			StudnetDaoImp dImp = new StudnetDaoImp(DbConnect.getConn());
			boolean f=dImp.studentRegister(std);
			
			if(f) {
				System.out.println("Student Registered Success..!");
			}else {
				System.out.println("something went wrong on server ..!");
			}
//			
//			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		

}
