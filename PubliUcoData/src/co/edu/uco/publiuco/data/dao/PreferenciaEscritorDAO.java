package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.PreferenciaEscritorEntities;

public interface PreferenciaEscritorDAO {
	
	void create(PreferenciaEscritorEntities entities);

	List<PreferenciaEscritorEntities> read(PreferenciaEscritorEntities entities);

	void update(PreferenciaEscritorEntities entities);

	void delete(PreferenciaEscritorEntities entities);

}
