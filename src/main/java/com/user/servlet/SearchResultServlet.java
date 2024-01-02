package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.ResultsDaoImp;
import com.DAO.StudentDaoImp;
import com.entities.Results;

@WebServlet("/serachresult")
public class SearchResultServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		ResultsDaoImp rdao = new ResultsDaoImp();
		HttpSession session = req.getSession();
		
		String regno = req.getParameter("regno");
		
		String rsl = rdao.getStudentResult(regno);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}