package br.ufc.quixada;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection(
			String host, String bdName, 
			String user, String password) {
		try {
			return DriverManager.getConnection(
					"jdbc:postgresql://" + host+ "/" + bdName, 
					user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
