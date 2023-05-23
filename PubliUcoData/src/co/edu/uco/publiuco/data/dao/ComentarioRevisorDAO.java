package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.ComentarioRevisorEntities;

public interface ComentarioRevisorDAO {
	
	void create(ComentarioRevisorEntities entities);

	List<ComentarioRevisorEntities> read(ComentarioRevisorEntities entities);

	void update(ComentarioRevisorEntities entities);

	void delete(ComentarioRevisorEntities entities);

}