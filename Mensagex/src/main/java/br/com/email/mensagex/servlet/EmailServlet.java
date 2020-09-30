package br.com.email.mensagex.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.email.mensagex.dao.EmailDAO;
import br.com.email.mensagex.entity.Email;

//@WebServlet("/enviaEmail")
@SuppressWarnings("serial")
public class EmailServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String emailReq = req.getParameter("email");

		Email email = new Email();

		email.setDescricao(emailReq);

		EmailDAO emailDAO = new EmailDAO();
		emailDAO.adiciona(email);

		
		RequestDispatcher r = req.getRequestDispatcher( "ok.html" ); r.forward( req, resp );
		
	}

}