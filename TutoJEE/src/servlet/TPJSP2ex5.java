package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TPJSPex5
 */
@WebServlet("/TPJSP2ex5")
public class TPJSP2ex5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TPJSP2ex5() {
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

		Boolean boolEmailValide;
		// test si l'email saisi est valide

		// Si pas encore renseigné: valide
		if (request.getParameter("email") == null) {
			boolEmailValide = true;

			// Si renseigné et format ok: valide
		} else if (request.getParameter("email").matches(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {

			boolEmailValide = true;
		}
		// Si renseigné et format ko invalide
		else {
			boolEmailValide = false;
		}

		request.setAttribute("boolEmailValide", boolEmailValide);

		if (boolEmailValide && request.getParameter("email") != null) {
			// image qui dit bravo
			response.sendRedirect("http://petitemimine.p.e.pic.centerblog.net/0i4m1ag3.gif");
		} else {
			// Sinon saisie nouveau compte
			request.getRequestDispatcher("/TPJSP2ex5.jsp").forward(request, response);
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
