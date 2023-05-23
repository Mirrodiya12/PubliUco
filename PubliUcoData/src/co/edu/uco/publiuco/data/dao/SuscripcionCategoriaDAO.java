package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.SuscripcionCategoriaEntities;

public interface SuscripcionCategoriaDAO {
	
	void create(SuscripcionCategoriaEntities entities);

	List<SuscripcionCategoriaEntities> read(SuscripcionCategoriaEntities entities);

	void update(SuscripcionCategoriaEntities entities);

	void delete(SuscripcionCategoriaEntities entities);

}
