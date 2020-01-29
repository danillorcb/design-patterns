package br.com.danillorcb.pattern.factory.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			String tipoBanco = System.getenv("tipoBanco");
			
			return DriverManager.getConnection("jdbc:" + tipoBanco + "://localhost:3306/banco", "root", "1234");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
