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
			adm.setClassId(rs.getInt(2));
			adm.setStudentId(rs.getInt(3));
			adm.setSubjectId(rs.getInt(4));
			adm.setMarks(rs.getInt(5));
		}
		
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return adm;
	}
}
