package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.VersionEntities;

public interface VersionDAO {

	void create(VersionEntities entities);

	List<VersionEntities> read(VersionEntities entities);

	void update(VersionEntities entities);

	void delete(VersionEntities entities);

}