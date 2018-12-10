package com.amazon.db;

import java.sql.DriverManager;
import java.sql.Connection;
import static com.amazon.db.DataBase.*;

public interface IDBConnection { 
	
	default Connection connectToDB() {
		Connection connection= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL+DB+PARAM,USER,PASS);
			if (connection !=null) {
				System.out.println("Conexion establecida!!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
		   return connection;
			
		}
	}

}
