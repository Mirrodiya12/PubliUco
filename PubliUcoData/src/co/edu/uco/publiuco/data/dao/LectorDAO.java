package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.LectorEntities;

public interface LectorDAO {
	
	void create(LectorEntities entities);

	List<LectorEntities> read(LectorEntities entities);

	void update(LectorEntities entities);

	void delete(LectorEntities entities);

}
