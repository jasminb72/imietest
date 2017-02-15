package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;

import dto.UtilisateurDto;

public class UtilisateurDao implements IDao<UtilisateurDto> {

	public Connection getConnection() throws SQLException {

		String driverClass = "com.mysql.jdbc.Driver";
		try {
			DriverManager.registerDriver((Driver) Class.forName(driverClass).newInstance());
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/jeeexercice", "root", "");
		} catch (ReflectiveOperationException e) {
			// TODO Auto-generated catch block
			throw new SQLException(e);
		}

	}

	@Override
	public List<UtilisateurDto> findAll() {
		List<UtilisateurDto> utilisateurs = new ArrayList<>();
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement("select id, nom, email from utilisateur");
				ResultSet rs = statement.executeQuery()) {
			while (rs.next()) {
				UtilisateurDto utilisateurDto = new UtilisateurDto();
				utilisateurDto.setId(rs.getInt("id"));
				utilisateurDto.setNom(rs.getString("nom"));
				utilisateurDto.setEmail(rs.getString("email"));
				utilisateurs.add(utilisateurDto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		return utilisateurs;
	}

	@Override
	public UtilisateurDto findOne(UtilisateurDto data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UtilisateurDto findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(UtilisateurDto data) {
		String strReq = "INSERT INTO utilisateur (nom, email) VALUES (?, ?)";
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(strReq);) {
			Integer index = 1;
			statement.setString(index++, data.getNom());
			statement.setString(index++, data.getEmail());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public void update(UtilisateurDto data) {
	}

	@Override
	public void update(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(UtilisateurDto data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
