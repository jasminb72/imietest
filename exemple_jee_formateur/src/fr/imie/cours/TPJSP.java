package fr.imie.cours;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/tpjsp")
public class TPJSP extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Person person = new Person();
		person.setFirstName("<form action='pirate.com'><input type='submit'/></form>");
		person.setLastName("joli");
		session.setAttribute("p2", person);

		request.setAttribute("nbMax", request.getParameter("nbMax"));
		// request.setAttribute("listeSaisons", Arrays.asList("printemps", "�t�", "automne",
		// "hiver"));
		request.setAttribute("toto", "");
		request.setAttribute("listeSaisons", Arrays.asList());

		request.getRequestDispatcher("/tpjsp.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
