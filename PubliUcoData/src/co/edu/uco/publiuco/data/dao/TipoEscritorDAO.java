package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.TipoEscritorEntities;

public interface TipoEscritorDAO {
	
	List<TipoEscritorEntities> read(TipoEscritorEntities entities);
	
	void update(TipoEscritorEntities entities);

}