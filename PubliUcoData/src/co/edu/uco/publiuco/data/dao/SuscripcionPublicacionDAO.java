package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.SuscripcionPublicacionEntities;

public interface SuscripcionPublicacionDAO {
	
	void create(SuscripcionPublicacionEntities entities);

	List<SuscripcionPublicacionEntities> read(SuscripcionPublicacionEntities entities);

	void update(SuscripcionPublicacionEntities entities);

	void delete(SuscripcionPublicacionEntities entities);

}
