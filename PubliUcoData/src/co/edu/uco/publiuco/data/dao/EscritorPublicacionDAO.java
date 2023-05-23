package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EscritorPublicacionEntities;

public interface EscritorPublicacionDAO {
	
	void create(EscritorPublicacionEntities entities);

	List<EscritorPublicacionEntities> read(EscritorPublicacionEntities entities);

	void update(EscritorPublicacionEntities entities);

	void delete(EscritorPublicacionEntities entities);

}