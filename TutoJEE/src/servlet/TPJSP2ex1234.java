package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Personne;

@WebServlet("/TPJSP2ex1234")
public class TPJSP2ex1234 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Personne personne1=new Personne();
		personne1.setNom("Bansard");
		personne1.setPrenom("Jasmin");
		request.setAttribute("personne1", personne1);
		
		List<String> loisirs=new ArrayList<>();
		loisirs.add("guitare");
		loisirs.add("natation");
		loisirs.add("lecture");
		loisirs.add("sculpture");
		request.setAttribute("loisirs", loisirs);
		
		request.getRequestDispatcher("/TPJSP2ex1234.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
