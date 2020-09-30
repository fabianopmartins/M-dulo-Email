package br.com.email.mensagex.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {

		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/email?serverTimezone=UTC", "root", "fp305305");

			return connection;

		} catch (ClassNotFoundException e) {
			System.out.println("O driver expecificado não foi encontrado.");
			return null;

		} catch (SQLException e) {
			System.out.println("Nao foi possivel conectar ao banco de dados.");
			return null;
		}

	}

}