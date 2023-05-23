package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.HistorialAccesoPublicacionEntities;

public interface HistorialAccesoPublicacionDAO {
	
	void create(HistorialAccesoPublicacionEntities entities);

	List<HistorialAccesoPublicacionEntities> read(HistorialAccesoPublicacionEntities entities);

	void update(HistorialAccesoPublicacionEntities entities);

	void delete(HistorialAccesoPublicacionEntities entities);

}