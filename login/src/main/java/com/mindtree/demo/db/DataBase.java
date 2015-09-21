package com.mindtree.demo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DataBase {

	private static DataBase db;
	private Connection conn = null;

	private DataBase() {
		//db = new DataBase();
	}

	public Connection getDbCon() {
		try {
			
			System.out.println("Init Connection");
			Class.forName("com.mysql.jdbc.Driver");
			//Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","admin", "admin123");

			// Do something with the Connection
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static DataBase getObj()
	{
		if(db==null){
			db = new DataBase();
		} 
		
		return db;
	}

}
