package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.DB.DbConnect;
import com.entities.Results;

public class ResultsDaoImp implements ResultDao{
	private Connection conn;


    public ResultsDaoImp() {
        super();
        this.conn = DbConnect.getConn();
    }

	@Override
	public boolean AddResultMarks(Results results) {
		boolean f = false;
        try {
            String sql = "insert into results(registrationNo, hindi, english, maths, science, socialscience) values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, results.getRegistrationNo());
            ps.setInt(2, results.getHindi());
            ps.setInt(3, results.getEnglish());
            ps.setInt(4, results.getMaths());
            ps.setInt(5, results.getScience());
            ps.setInt(6, results.getSocialScience());
            
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