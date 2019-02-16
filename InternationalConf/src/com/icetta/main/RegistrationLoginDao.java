package com.icetta.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class RegistrationLoginDao {

	Dbconnection connector = new Dbconnection();
	PreparedStatement pstm;
	ResultSet rs;
	public boolean insertUser(RegistrationLogin registrationLogin){
		Connection mySQLConnection = connector.getSQLConnection();
		
		String insert = "insert into USERREGISTRATION values(?,?,?,?,?,?,?,?,?,?)";
		try {

			pstm = (PreparedStatement) mySQLConnection.prepareStatement(insert);
			pstm.setString(1,registrationLogin.getFirstName() );
			pstm.setString(2, registrationLogin.getLastName());
			pstm.setString(3, registrationLogin.getAbstractNo());
			pstm.setString(4, registrationLogin.getPaperTitle());
			pstm.setString(5, registrationLogin.getInstituteName());
			pstm.setString(6, registrationLogin.getAddress());
			pstm.setString(7, registrationLogin.getCity());
			pstm.setString(8, registrationLogin.getCountry());
			pstm.setString(9, registrationLogin.getEmail());
			pstm.setString(10, registrationLogin.getPassword());
			pstm.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public String isvalid(String email, String password) {
		Connection mySQLConnection = connector.getSQLConnection();

		String select = "select FIRSTNAME from USERREGISTRATION where EMAIL='"
				+ email + "'and password='" + password + "'";
		String firstName = "";
		 System.out.println(select);
		try {
			pstm = (PreparedStatement) mySQLConnection.prepareStatement(select);
			rs = pstm.executeQuery();
			while (rs.next()) {
				firstName = rs.getString("FIRSTNAME");

				if (firstName.length() < 0) {
					firstName = "";

			}
			}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return firstName;
	}
}
