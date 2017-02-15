package controlleur;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.IDao;
import dto.UtilisateurDto;
import factory.Factory;

@Controller
public class UtilisateurControleur {

	
    
	@RequestMapping(value = "/TPJSP2ex6ListerTousUtilisateurs", method = RequestMethod.GET)
	public String listerTousUtilisateurs(ModelMap model) {
		// model.addAttribute("list", dao.findAll);
		// Instanciation de DAO qui accèdera la couche "DAO (C'est à dire Les
		// Datas de la base de données)"
		IDao<UtilisateurDto> utilisateurDao = Factory.getInstance().getUtilisateurDAO();

		// Récupération de la liste des utilisateurs
		List<UtilisateurDto> utilisateurs = utilisateurDao.findAll();
		model.addAttribute("utilisateurs", utilisateurs);

		return "/TPJSP2ex6ListerTousUtilisateurs";
		//return new ModelAndView("/TPJSP2ex6ListerTousUtilisateurs", "utilisateur", new UtilisateurDto());
	}

	@RequestMapping(value = "/AjouterUtilisateur", method = RequestMethod.POST)
	public String AjouterUtilisateur(UtilisateurDto utilisateurDto,
			ModelMap model){

		// Instanciation de DAO qui accèdera la couche "DAO (C'est à dire Les
		// Datas de la base de données)"
		IDao<UtilisateurDto> utilisateurDao = Factory.getInstance().getUtilisateurDAO();

		if (utilisateurDto.getNom() != null) {
			utilisateurDao.insert(utilisateurDto);
		}

		return listerTousUtilisateurs(model);
	}

}
