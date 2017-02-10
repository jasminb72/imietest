package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TPServlet2ex3
 */
@WebServlet("/TPServlet2ex3")
public class TPServlet2ex3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TPServlet2ex3() {
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
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());

		/*
		 * System.out.println("on rentre dans le doGet");
		 * System.out.println(request.getParameter("testForward1"));
		 * System.out.println(request.getParameterValues("testForward1"));
		 * System.out.println(request.getParameter("testInclude2"));
		 * System.out.println(request.getParameterValues("testInclude2"));
		 */

		if (request.getParameter("testForward1") != null) {
			response.sendRedirect(
					"https://www.google.fr/search?rlz=1C1CHBF_frFR720FR720&espv=2&q=forward+java&oq=forward+java&gs_l=serp.3..0l4j0i22i30k1l6.1740121.1742125.0.1742258.12.9.0.3.3.0.196.811.0j5.5.0....0...1c.1.64.serp..4.8.827...0i67k1j0i131k1.mKP2rE1Gimc");
		} else if (request.getParameter("testInclude2") != null) {
			request.getRequestDispatcher("/TPServlet2ex3include").include(request, response);
			response.getWriter()
			.append("include de la servlet TPServlet3ex3 première partie")
			.append("\n")
			//Inclusion de l'attribut user ajouté dans la servlet "include" 
			.append((String) request.getAttribute("user"))
			.append("\ninclude de la servlet TPServlet3ex3 dernière partie");
		} else {
			request.getRequestDispatcher("/TPServlet2ex3.jsp").forward(request, response);
		}

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
