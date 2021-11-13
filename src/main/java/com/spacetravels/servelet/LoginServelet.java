package com.spacetravels.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.spacetravels.travels.ws.usuarios.Usuarios;
import com.spacetravels.travels.ws.usuarios.UsuariosWS;
import com.spacetravels.travels.ws.usuarios.UsuariosWSImplService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginServelet")
public class LoginServelet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 547302838440531916L;
	
	Gson gson = new Gson();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UsuariosWS wsClient = new UsuariosWSImplService().getUsuariosWSImplPort();

		String usuario = req.getParameter("usuario");
		String contrasena = req.getParameter("contrasena");
		
	    Usuarios usuarioResult = wsClient.login(usuario, contrasena);
	    
	    String nombre = usuarioResult.getNombre();
	    String apellidos = usuarioResult.getApellidos();
	    int id = usuarioResult.getId();
	    System.out.println(nombre + apellidos + id);
	    
	    resp.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = resp.getWriter();
	    out.println(gson.toJson(usuarioResult));
	    out.flush();
	    out.close();
	}

}
