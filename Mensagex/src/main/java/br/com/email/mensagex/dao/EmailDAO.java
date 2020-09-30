package br.com.email.mensagex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.email.mensagex.entity.Email;
import br.com.email.mensagex.factory.ConnectionFactory;

public class EmailDAO {

	private Connection connection;

	@SuppressWarnings("static-access")
	public EmailDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Email email) {

		try {
			PreparedStatement stmt = this.connection.prepareStatement("insert into emails (descricao) values (?)");

			stmt.setString(1, email.getDescricao());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}