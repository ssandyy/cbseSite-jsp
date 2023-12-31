package com.user.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.AddMarkDaoImp;

import com.entities.AddMarks;

@WebServlet("/addmarks")
public class AddStudentMarkServlet extends HttpServlet {
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//int ResultId = Integer.parseInt(req.getParameter("resultid"));
			String StudentId = req.getParameter("studentid");
			String ClassId = req.getParameter("classid");
//			String SubjectId = req.getParameter("subjectid");
			int Marks1 = Integer.parseInt(req.getParameter("marks1"));
			int Marks2 = Integer.parseInt(req.getParameter("marks2"));
			int Marks3 = Integer.parseInt(req.getParameter("marks3"));
			int Marks4 = Integer.parseInt(req.getParameter("marks4"));
			int Marks5 = Integer.parseInt(req.getParameter("marks5"));
			
			System.out.print(StudentId+" "+ClassId+" ");
			
			AddMarks am = new AddMarks();
			am.setClassId(ClassId);
			am.setStudentId(StudentId);
//			am.setSubjectId(SubjectId);
			am.setMarks(Marks1);

			System.out.println();

			HttpSession session = req.getSession();
			
			AddMarkDaoImp admi = new AddMarkDaoImp();
			
		
			if(admi !=null) {
				//System.out.println("Student Registered Success..!");
				session.setAttribute("SucessMsg2", "Student Marks added sucessfully:"+StudentId+" "+ClassId);
				resp.sendRedirect("addMarks.jsp");
			}else {
				session.setAttribute("FailedMsg2", "Something went wrong, please try again after sometime..!");
			}
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		}
}
