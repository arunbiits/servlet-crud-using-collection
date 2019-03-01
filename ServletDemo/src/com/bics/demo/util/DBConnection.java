/**
 * 
 */
package com.bics.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author bosco
 *
 */
public class DBConnection {
	static Connection con  = null;
	public static Connection getDatabaseConnection() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arun");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}	
