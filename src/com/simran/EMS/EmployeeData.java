package com.simran.EMS;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class EmployeeData {
	public static Connection connectDB() {
	 try {
		 Class.forName("`com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb,root,root");
			JOptionPane.showMessageDialog(null, "Connection Made");
			return connection;
	 }
	 catch(Exception e) {
		 JOptionPane.showMessageDialog(null, "Connection Error");
			return null;
		
	 }
	
		
	}

}
