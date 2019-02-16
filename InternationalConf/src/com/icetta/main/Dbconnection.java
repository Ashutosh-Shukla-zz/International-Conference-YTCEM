package com.icetta.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {

	public static String DATABASE_HOST = "db4free.net";;
    public static String DATABASE_PORT = "3306";
    public static String DATABASE_USERNAME = "hashonedb";
    public static String DATABASE_PASSWORD = "hashonedb";
    public static String DATABASE_NAME = "hashone";
    
    public Connection getSQLConnection() {
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
	    System.out.println("Could not find MySQL JDBC Driver");
	    e.printStackTrace();
	}
	Connection connection = null;
	try {
	    connection = DriverManager.getConnection("jdbc:mysql://" + DATABASE_HOST + ":" + DATABASE_PORT + "/"
		    + DATABASE_NAME, DATABASE_USERNAME, DATABASE_PASSWORD);
	} catch (SQLException e) {
	    System.out.println("Connection Failed! Check output console");
	    e.printStackTrace();
	}
	if (connection != null) {
	    System.out.println("Connection successful");
	}
	return connection;
    }
	 /*public static void main(String[] argv) {
			getSQLConnection();
		    }*/

}
