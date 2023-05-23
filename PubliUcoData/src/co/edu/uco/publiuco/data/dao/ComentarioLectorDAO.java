package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.ComentarioLectorEntities;

public interface ComentarioLectorDAO {
	
	void create(ComentarioLectorEntities entities);

	List<ComentarioLectorEntities> read(ComentarioLectorEntities entities);

	void update(ComentarioLectorEntities entities);

	void delete(ComentarioLectorEntities entities);

}