package br.com.cursoweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Principal")
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Principal() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
	    String idade = request.getParameter("idade");
	    String sexo = request.getParameter("sexo");
	    String email = request.getParameter("email");
	    String melhorias = request.getParameter("melhorias");
	    
	    out.println("");
        out.println(""); 
        out.println("Bem Vindo " + nome);
	}

}
