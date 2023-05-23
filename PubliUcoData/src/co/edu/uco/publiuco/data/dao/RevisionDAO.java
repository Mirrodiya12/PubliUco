package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.RevisionEntities;

public interface RevisionDAO {
	
	void create(RevisionEntities entities);

	List<RevisionEntities> read(RevisionEntities entities);

	void update(RevisionEntities entities);

	void delete(RevisionEntities entities);

}