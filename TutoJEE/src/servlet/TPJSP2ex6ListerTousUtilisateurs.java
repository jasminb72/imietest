package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IDao;
import dto.UtilisateurDao;
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
		
		//Instanciation de DAO qui accèdera la couche "DAO (C'est à dire Les Datas de la base de données)"
		IDao<UtilisateurDto> utilisateurDao=new UtilisateurDao();
		
		//Si le nom est renseigné: création d'un utilisateur DTO
		if (request.getParameter("nom")!=null){
			UtilisateurDto utilisateurDto = new UtilisateurDto();
			utilisateurDto.setNom(request.getParameter("nom"));
			utilisateurDto.setEmail(request.getParameter("email"));
			utilisateurDao.insert(utilisateurDto);
		}
		
		//Récupération de la liste des utilisateurs
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
