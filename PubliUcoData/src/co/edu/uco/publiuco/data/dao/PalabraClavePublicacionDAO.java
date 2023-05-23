package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.PalabraClavePublicacionEntities;

public interface PalabraClavePublicacionDAO {
	
	void create(PalabraClavePublicacionEntities entities);

	List<PalabraClavePublicacionEntities> read(PalabraClavePublicacionEntities entities);

	void update(PalabraClavePublicacionEntities entities);

	void delete(PalabraClavePublicacionEntities entities);

}
