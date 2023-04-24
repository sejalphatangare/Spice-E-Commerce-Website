package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Model.User;

public class LoginDao {
	public int insertUser(User u) {
		Connection con=MyConnection.getConnection();
		int i=0;
		try {
<<<<<<< HEAD
<<<<<<< HEAD
			PreparedStatement ps=con.prepareStatement("INSERT INTO user() VALUES(?,?,?)");
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPassword());
			
			i=ps.executeUpdate();
=======
=======
>>>>>>> 8a774f8c22274af4ff5d8105df46c4372f979e79
			PreparedStatement ps=con.prepareStatement("INSERT INTO user() VALUES(?,?,?,?)");
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getName());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPassword());
			
			i=ps.executeUpdate();
			
<<<<<<< HEAD
>>>>>>> 2c8e4ea5c63bf2d3981c2e9270c169af1ab3771d
=======
>>>>>>> 8a774f8c22274af4ff5d8105df46c4372f979e79
			if(i>0) {
				System.out.println("User Registered");
			}
			else {
				System.out.println("User Not Registered");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 8a774f8c22274af4ff5d8105df46c4372f979e79
public int checkRegister(User u) {
	Connection con=MyConnection.getConnection();
	int i=0;
	try {
		PreparedStatement ps=con.prepareStatement("SELECT * FROM user WHERE username=?");
		ps.setString(1,u.getUsername());
		System.out.println("Username: "+u.getUsername());
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			System.out.println("User already registered!");
			System.out.println(u.getUsername()+" "+rs.getString(1));
			if(u.getUsername().equals(rs.getString(1))) {
				i=1;
			}
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	try {
		con.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return i;
	
}
<<<<<<< HEAD
>>>>>>> 2c8e4ea5c63bf2d3981c2e9270c169af1ab3771d
=======
>>>>>>> 8a774f8c22274af4ff5d8105df46c4372f979e79

public int validateUser(User u) {
	Connection con=MyConnection.getConnection();
	int i=0;
	try {
		PreparedStatement ps=con.prepareStatement("SELECT * FROM user WHERE username=?");
		ps.setString(1,u.getUsername());
		System.out.println("Username: "+u.getUsername());
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
<<<<<<< HEAD
<<<<<<< HEAD
			System.out.println(u.getPassword()+" "+rs.getString(3));
			if(u.getPassword().equals(rs.getString(3))) {
=======
			System.out.println(u.getPassword()+" "+rs.getString(4));
			if(u.getPassword().equals(rs.getString(4))) {
>>>>>>> 2c8e4ea5c63bf2d3981c2e9270c169af1ab3771d
=======
			System.out.println(u.getPassword()+" "+rs.getString(4));
			if(u.getPassword().equals(rs.getString(4))) {
>>>>>>> 8a774f8c22274af4ff5d8105df46c4372f979e79
				i=1;
			}
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	try {
		con.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return i;
}
}