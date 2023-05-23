package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.PlanCategoriaEntities;

public interface PlanCategoriaDAO {
	
	void create(PlanCategoriaEntities entities);

	List<PlanCategoriaEntities> read(PlanCategoriaEntities entities);

	void update(PlanCategoriaEntities entities);

	void delete(PlanCategoriaEntities entities);

}
