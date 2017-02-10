package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IDao;
import dao.UtilisateurDao;
import dto.UtilisateurDto;

/**
 * Servlet implementation class TPJSP2ex6
 */
@WebServlet("/TPJSP2ex6ListerTousUtilisateurs")
public class TPJSP2ex6ListerTousUtilisateurs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TPJSP2ex6ListerTousUtilisateurs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		IDao<UtilisateurDto> utilisateurDao=new UtilisateurDao();
		
		List<UtilisateurDto> utilisateurs= utilisateurDao.findAll();
		request.setAttribute("utilisateurs", utilisateurs);
		
		request.getRequestDispatcher("/TPJSP2ex6ListerTousUtilisateurs.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
