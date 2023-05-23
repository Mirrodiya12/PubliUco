package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.RevisorEntities;

public interface RevisorDAO {
	
	void create(RevisorEntities entities);

	List<RevisorEntities> read(RevisorEntities entities);

	void update(RevisorEntities entities);

	void delete(RevisorEntities entities);

}
