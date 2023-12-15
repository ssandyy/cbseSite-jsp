package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entities.Student;


public class StudnetDaoImp implements StudentDAO {
	
	private Connection conn;
	
	
	public StudnetDaoImp(Connection conn) {
		super();
		this.conn = conn;
	}
	

	@Override
	public boolean studentRegister(Student std) {
		boolean f = false;
		try {
			String sql = "insert into student(fname, lname, fathername, phone, address, password) values(?,?,?,?,?,?)";
			PreparedStatement ps =conn.prepareStatement(sql);
			ps.setNString(1, std.getFname());
			ps.setString(2, std.getLname());
//			ps.setInt(3, std.getAge());
//			ps.setInt(4, std.getClassId());
			ps.setString(3, std.getFathername());
			ps.setString(4, std.getPhone());
			ps.setString(5, std.getAddress());
//			ps.setInt(8, std.getRollno());
			ps.setString(6, std.getPassword());
			
			
			int i = ps.executeUpdate();
			if(i==1) {
				f=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return f;
	}

}
