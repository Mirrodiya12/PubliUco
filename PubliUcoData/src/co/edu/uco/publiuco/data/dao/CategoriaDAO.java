package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.CategoriaEntities;

public interface CategoriaDAO {
	
	void create(CategoriaEntities entities);

	List<CategoriaEntities> read(CategoriaEntities entities);

	void update(CategoriaEntities entities);

	void delete(CategoriaEntities entities);

}
