package com.dao;

import java.sql.Connection;	
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.bean.UserBean;
import com.util.DbConnection;

public class UserDao {

	public static ArrayList<UserBean> users = new ArrayList<UserBean>();
//	public static int userCount = 1;

	static {
		UserBean bean = new UserBean();
//		bean.setUserId(userCount++);
		bean.setAccNumber(12345);
		bean.setUserId(207021);
		bean.setFirstName("Sahdev");
		bean.setLastName("Patel");
		bean.setEmail("sahdev@gmail.com");
		bean.setPassword("sahdev@2112");

		users.add(bean);
	}

	public int signupUser(UserBean bean) {
		try (Connection con = DbConnection.getConnection();
				PreparedStatement ptsmt = con.prepareStatement(
						"insert into userInfo (accNumber,firstName,lastName,email,contact,password,userId,dob) values (?,?,?,?,?,?,?,?)");) {

			ptsmt.setInt(1, bean.getAccNumber());
			ptsmt.setString(2, bean.getFirstName());
			ptsmt.setString(3, bean.getLastName());
			ptsmt.setString(4, bean.getEmail());
			ptsmt.setInt(5, bean.getContact());
			ptsmt.setString(6, bean.getPassword());
			ptsmt.setInt(7, bean.getUserId());
			ptsmt.setString(8, bean.getDob());

			int records = ptsmt.executeUpdate(); 
//			int i = ptsmt.executeUpdate();
			System.out.println(records + " Record successfully inserted......");
			con.close();
			ptsmt.close();
			return records;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public UserBean authenticate(int userId, String password) {
		for (UserBean user : users) {
			if (user.getUserId() == userId && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

	public UserBean getDataById(int userId) {
		UserBean bean = new UserBean();
		try (Connection con = DbConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement("select * from userInfo where userId =  ?");) {

			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();// student--cursor
			if (rs.next()) {
				// true
				// jump to 1st record
				bean.setUserId(rs.getInt("userId"));
				bean.setPassword(rs.getString("password"));
//				bean.setEmail(rs.getString("email"));
//				bean.setFirstName(rs.getString("firstName"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
}
