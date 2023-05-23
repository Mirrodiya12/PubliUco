package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.CalificacionEntities;

public interface CalificacionDAO {
	
	void create(CalificacionEntities entities);

	List<CalificacionEntities> read(CalificacionEntities entities);

	void update(CalificacionEntities entities);

	void delete(CalificacionEntities entities);

}
