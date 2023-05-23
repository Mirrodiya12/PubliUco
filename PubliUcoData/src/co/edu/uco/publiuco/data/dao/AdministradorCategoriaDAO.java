package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.AdministradorCategoriaEntities;

public interface AdministradorCategoriaDAO {

	void create(AdministradorCategoriaEntities entities);

	List<AdministradorCategoriaEntities> read(AdministradorCategoriaEntities entities);

	void update(AdministradorCategoriaEntities entities);

	void delete(AdministradorCategoriaEntities entities);

}