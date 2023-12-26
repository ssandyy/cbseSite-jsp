package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.AddMarkDaoImp;
import com.DAO.StudentDaoImp;
import com.entities.AddMarks;

@WebServlet("/addmarks")
public class AddStudentMarkServlet extends HttpServlet {
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int ResultId = Integer.parseInt(req.getParameter("resultid"));
			int StudentId = Integer.parseInt(req.getParameter("studentid"));
			int Marks = Integer.parseInt(req.getParameter("marks"));
			int ClassId = Integer.parseInt(req.getParameter("classid"));
			int SubjectId = Integer.parseInt(req.getParameter("subjectid"));
			
			System.out.println(ResultId+" "+StudentId+" "+Marks+" "+ClassId+" "+SubjectId);
			
			AddMarks adm = new AddMarks();
			adm.setClassId(ClassId);
			adm.setSubjectId(SubjectId);
			adm.setResultId(ResultId);
			adm.setStudentId(StudentId);
			
			HttpSession session = req.getSession();
			 
			
			 
			 
			AddMarkDaoImp admi = new AddMarkDaoImp();
		
			
			
			if(admi !=null) {
				//System.out.println("Student Registered Success..!");
				session.setAttribute("SucessMsg", "Student registration sucessfully:"+StudentId+" "+ClassId);
				resp.sendRedirect("addMarks.jsp");
			}else {
//				System.out.println("something went wrong on server ..!");
				session.setAttribute("FailedMsg", "Something went wrong, please try again after sometime..!");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		}
}
