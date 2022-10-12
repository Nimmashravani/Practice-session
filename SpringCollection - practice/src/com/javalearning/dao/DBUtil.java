package com.javalearning.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	private Properties dbProperties;

	public Properties getDbProperties() {
		return dbProperties;
	}

	public void setDbProperties(Properties dbProperties) {
		this.dbProperties = dbProperties;
	}

	public Connection createConnection() throws ClassNotFoundException,
			SQLException {
		Connection connStudent;
				
		String url = dbProperties.getProperty("url");
		String username = dbProperties.getProperty("username");
		String password = dbProperties.getProperty("password");
		String driver = dbProperties.getProperty("driver");
		
		Class.forName(driver);

		connStudent = DriverManager.getConnection(url, username, password);

		System.out.println("Connection established");
		return connStudent;
	}

	
}