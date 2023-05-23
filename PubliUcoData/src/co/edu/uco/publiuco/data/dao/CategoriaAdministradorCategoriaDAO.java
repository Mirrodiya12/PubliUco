package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.CategoriaAdministradorCategoriaEntities;

public interface CategoriaAdministradorCategoriaDAO {
	
	void create(CategoriaAdministradorCategoriaEntities entity);

	List<CategoriaAdministradorCategoriaEntities> read(CategoriaAdministradorCategoriaEntities entities);

	void update(CategoriaAdministradorCategoriaEntities entities);

	void delete(CategoriaAdministradorCategoriaEntities entities);

}
