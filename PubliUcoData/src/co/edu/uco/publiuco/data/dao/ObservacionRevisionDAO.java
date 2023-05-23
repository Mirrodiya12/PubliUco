package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.ObservacionRevisionEntities;

public interface ObservacionRevisionDAO {
	
	void create(ObservacionRevisionEntities entities);

	List<ObservacionRevisionEntities> read(ObservacionRevisionEntities entities);

	void update(ObservacionRevisionEntities entities);

	void delete(ObservacionRevisionEntities entities);

}
