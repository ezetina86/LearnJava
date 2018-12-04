package com.amazon.db;

import java.sql.DriverManager;
import java.sql.Connection;
import static com.amazon.db.DataBase.*;

public interface IDBConnection { 
	
	default Connection connectToDB() {
		Connection connection= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL+DB,USER,PASS);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
		   return connection;
			
		}
	}

}
