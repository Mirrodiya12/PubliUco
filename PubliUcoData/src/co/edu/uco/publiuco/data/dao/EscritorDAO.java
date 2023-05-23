package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EscritorEntities;

public interface EscritorDAO {
	
	void create(EscritorEntities entities);

	List<EscritorEntities> read(EscritorEntities entities);

	void update(EscritorEntities entities);

	void delete(EscritorEntities entities);

}
