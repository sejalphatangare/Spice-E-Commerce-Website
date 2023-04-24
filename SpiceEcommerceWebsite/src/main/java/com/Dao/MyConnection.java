package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
<<<<<<< HEAD
import java.sql.SQLException;

public class MyConnection {
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final  String url = "jdbc:mysql://localhost:3306/employees";
=======
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Model.User;

public class MyConnection {
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/user_spice";
>>>>>>> 2c8e4ea5c63bf2d3981c2e9270c169af1ab3771d
	private static final String uname = "root";
	private static final String pass="Sejal@2003";
	
	public static Connection getConnection() {		
		Connection con = null;
		try {
			Class.forName(driver);//load driver
			con = DriverManager.getConnection(url,uname,pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}//connection to database
         catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Connection : "+con);
		 return con;
	 }
<<<<<<< HEAD
	
=======
	public int validateUser(User u) {
		Connection con=MyConnection.getConnection();
		int i=0;
		try {
			PreparedStatement ps=con.prepareStatement("SELECT * FROM user WHERE username=?");
			ps.setString(1,u.getUsername());
			System.out.println("Username: "+u.getUsername());
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				System.out.println(u.getPassword()+" "+rs.getString(3));
				if(u.getPassword().equals(rs.getString(3))) {
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
>>>>>>> 2c8e4ea5c63bf2d3981c2e9270c169af1ab3771d
	public static void main(String[] args) {
		Connection con=getConnection();
		System.out.println(con);
	}
}
