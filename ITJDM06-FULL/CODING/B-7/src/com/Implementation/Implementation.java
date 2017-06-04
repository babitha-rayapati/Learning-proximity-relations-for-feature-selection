package com.Implementation;

import java.sql.Connection;
import java.sql.ResultSet;

import com.Bean.Bean;
import com.Bean.Uploadbean;
import com.Dbconnection.Dbconnection;
import com.Interface.Interface;
import com.mysql.jdbc.PreparedStatement;

public class Implementation implements Interface {

 static Connection con;
 int k=0;

	public int register(Bean b) {
		
		try
		{
		
		con= Dbconnection.createConnection();
		PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO itjdm06.register VALUES(?,?,?,?,?,?,?)");
		ps.setString(1,b.getUsername());
		ps.setString(2,b.getEmail());
		ps.setString(3,b.getPassword());
		ps.setString(4,b.getConfirmpassword());
		ps.setString(5,b.getGender());
		ps.setString(6,b.getMobile());
		ps.setString(7,b.getAddress());
		k=ps.executeUpdate();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return k;
	}

	@Override
	public boolean login(Bean b) {
		
		boolean m=false;
		try
		{
			con= Dbconnection.createConnection();
			
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("SELECT * FROM itjdm06.register r where username=? and password=?");
			ps.setString(1, b.getUsername());
			ps.setString(2, b.getPassword());
			
			ResultSet rs;
			rs=ps.executeQuery();
			m=rs.next();
		
		}
		catch(Exception e)
		
		{
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public int upload(Uploadbean be,String username) {
		
		int j=0;
		try
		{
			con=Dbconnection.createConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("INSERT INTO itjdm06.upload VALUES(?,?,?,?,?)");
			ps.setString(1, be.getUsername());
			ps.setString(2,be.getFilename());
			ps.setString(3,be.getFiletype());
			ps.setString(4,be.getFilesize());
			ps.setString(5,be.getFilecontent());
			
			System.out.println("filecontent======================="+be.getFilecontent());
			System.out.println("ps======================="+ps);
			j=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return j;
	}

	

}
