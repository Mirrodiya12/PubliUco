package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.PublicacionEntities;

public interface PublicacionDAO {
	
	void create(PublicacionEntities entities);

	List<PublicacionEntities> read(PublicacionEntities entities);

	void update(PublicacionEntities entities);

	void delete(PublicacionEntities entities);

}
