package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.PreferenciaCategoriaEntities;

public interface PreferenciaCategoriaDAO {
	
	void create(PreferenciaCategoriaEntities entities);

	List<PreferenciaCategoriaEntities> read(PreferenciaCategoriaEntities entities);

	void update(PreferenciaCategoriaEntities entities);

	void delete(PreferenciaCategoriaEntities entities);

}