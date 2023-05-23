package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.RevisorRevisionEntities;

public interface RevisorRevisionDAO {

	void create(RevisorRevisionEntities entities);

	List<RevisorRevisionEntities> read(RevisorRevisionEntities entities);

	void update(RevisorRevisionEntities entities);

	void delete(RevisorRevisionEntities entities);

}