package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static String url = "jdbc:mysql://localhost:3306/bankApp";
	public static String userName = "root";
	public static String password = "sahdev2112";
	public static String driver = "com.mysql.jdbc.Driver";

	public static Connection getConnection() {

		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println(con);
			return con;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		getConnection();
	}
}
