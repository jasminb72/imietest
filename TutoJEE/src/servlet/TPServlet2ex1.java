package servlet;

import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TPServlet2ex1
 */
@WebServlet("/TPServlet2ex1")
public class TPServlet2ex1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TPServlet2ex1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String reponse = "";
		Integer nbVisite;
		Boolean newSession = true;

		// Si la session n'a jamais été créée
		if (request.getSession(false) == null) {
			request.getSession();

			nbVisite = 0;
			request.getSession().setAttribute("nbVisite", nbVisite);
		}
		// si on n'est pas à la première visite
		else {
			newSession = false;
			// obtention du nombre de visite
			nbVisite = (Integer) request.getSession().getAttribute("nbVisite");

		}

		// Affichage de l'ID
		reponse = reponse.concat("ID:");
		reponse = reponse.concat(String.valueOf(request.getSession().getId()));

		// Affichage de la date de création
		reponse = reponse.concat("\ndate de création:");
		Date dateCreation = new Date(request.getSession().getCreationTime());
		reponse = reponse.concat(String.valueOf(dateCreation));

		// Affichage à l'écran du dernier accès
		if (newSession == false) {
			reponse = reponse.concat("\nDernier accès:");
			Date dateLastAccess = new Date(request.getSession().getLastAccessedTime());
			reponse = reponse.concat(String.valueOf(dateLastAccess));
		}

		// Incrémentation du nombre de visite
		nbVisite++;
		request.getSession().setAttribute("nbVisite", nbVisite);

		// Affichage du nombre de visite
		reponse = reponse.concat("\nNombre de visite: ");
		reponse = reponse.concat(String.valueOf(request.getSession().getAttribute("nbVisite")));

		// Afficher la réponse
		response.getWriter().append(reponse);
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
