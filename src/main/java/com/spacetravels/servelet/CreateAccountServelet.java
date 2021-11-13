package com.spacetravels.servelet;

import java.io.IOException;

import com.spacetravels.travels.email.MailSpaceTravels;
import com.spacetravels.travels.ws.usuarios.Usuarios;
import com.spacetravels.travels.ws.usuarios.UsuariosWS;
import com.spacetravels.travels.ws.usuarios.UsuariosWSImplService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CreateAccountServelet")
public class CreateAccountServelet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 420038382057560014L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UsuariosWS wsClient = new UsuariosWSImplService().getUsuariosWSImplPort();
		
		Usuarios usuarios = new Usuarios();
		
		usuarios.setNombre(req.getParameter("nombre"));
		usuarios.setApellidos(req.getParameter("apellidos"));
		usuarios.setUsuario(req.getParameter("user"));
		usuarios.setPassword(req.getParameter("pass"));
		usuarios.setEmail(req.getParameter("email"));
		usuarios.setTelefono(req.getParameter("telefono"));
		
		wsClient.registerUser(usuarios);
		
		String email = req.getParameter("email");
		
		MailSpaceTravels mailSpaceTravels = new MailSpaceTravels();
		mailSpaceTravels.sendMail(email);
		
	    

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

}
