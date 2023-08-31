package org.onlinebookstore.books;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connect {
	static Connection connect = null;
	public static Connection connect()
	{
		try {
			String url = "jdbc:mysql://localhost:3306/books";
			String user = "root";
			String pwd = "root";
			
			//Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection(url,user,pwd);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return connect;
	}
}

