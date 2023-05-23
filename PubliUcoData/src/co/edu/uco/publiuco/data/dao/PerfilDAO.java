package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.PerfilEntities;

public interface PerfilDAO {
	
	void create(PerfilEntities entities);

	List<PerfilEntities> read(PerfilEntities entities);

	void update(PerfilEntities entities);

	void delete(PerfilEntities entities);

}
