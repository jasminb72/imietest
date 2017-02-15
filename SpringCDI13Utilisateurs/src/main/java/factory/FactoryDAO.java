package factory;

import dao.IDao;
import dao.UtilisateurDao;
import dto.UtilisateurDto;

public class FactoryDAO extends Factory{

	@Override
	public IDao<UtilisateurDto> getUtilisateurDAO() {
		return new UtilisateurDao();
	}
}
