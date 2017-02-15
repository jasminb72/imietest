package factory;

import dao.IDao;
import dto.UtilisateurDto;

public abstract class Factory {

	private static final Factory factory = new FactoryDAO();

	public static Factory getInstance() {
		return factory;
	}

	public abstract IDao<UtilisateurDto> getUtilisateurDAO();
}
