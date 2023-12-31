package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.DB.DbConnect;
import com.entities.AddMarks;

public class AddMarkDaoImp implements AddMarkDao{
private Connection conn;
	
	
	public AddMarkDaoImp() {
		super();
		this.conn = DbConnect.getConn();
	}
	public boolean AddStudentMarks(AddMarks adm) {
		boolean f = false;
		try {
			String sql = "insert into result(classid, subjectid, studentid, marks) values(?,?,?,?)";
			PreparedStatement ps =conn.prepareStatement(sql);
			ps.setString(1, adm.getClassId());
			ps.setString(2, adm.getStudentId());
			ps.setString(3, adm.getSubjectId());
			
			int i = ps.executeUpdate();
			if(i==1) {
				f=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	
	public AddMarks getAddMarksById(int id) {
		AddMarks adm =null;
		try {
		String sql = "select * from result where resultid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			adm = new AddMarks();
			adm.setResultId(rs.getInt(1));
			adm.setClassId(rs.getString(2));
			adm.setStudentId(rs.getString(3));
			adm.setSubjectId(rs.getString(4));
			adm.setMarks(rs.getInt(5));
		}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return adm;
	}
}
