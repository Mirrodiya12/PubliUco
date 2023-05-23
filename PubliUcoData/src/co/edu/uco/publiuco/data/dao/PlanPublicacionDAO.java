package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.PlanPublicacionEntities;

public interface PlanPublicacionDAO {
	
	void create(PlanPublicacionEntities entities);

	List<PlanPublicacionEntities> read(PlanPublicacionEntities entities);

	void update(PlanPublicacionEntities entities);

	void delete(PlanPublicacionEntities entities);

}