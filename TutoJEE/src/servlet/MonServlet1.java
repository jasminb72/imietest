package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.websocket.WsHandshakeResponse;

/**
 * Servlet implementation class MonServlet
 */
@WebServlet("/MonServlet1")

/*
 * 
 * Requete exemple
 * http://localhost:8080/TutoJEE/MonServlet1?nom=parker&prenom=tony
 * 
 */
public class MonServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MonServlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.getWriter()
					.append("<strong>Réponse</strong>")
					.append("<br/>\nProtocole: ")
					.append(request.getProtocol())
					.append("<br/>\nIP client: ")
					.append(request.getRemoteAddr())
					.append("<br/>\n Port: ")
					.append(String.valueOf(request.getRemotePort()))
					.append("<br/>\n Nom: ")
					.append(request.getParameter("nom"))
					.append("<br/>\n Prénom: ")
					.append(request.getParameter("prenom"))
					;
		
		
	//	request.getRequestDispatcher("/index.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
