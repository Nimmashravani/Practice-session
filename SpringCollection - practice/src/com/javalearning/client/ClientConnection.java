package com.javalearning.client;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javalearning.dao.DBUtil;

public class ClientConnection {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DBUtil db = (DBUtil) appContext.getBean("conn");
		
		try {
			Connection conn = db.createConnection();
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}