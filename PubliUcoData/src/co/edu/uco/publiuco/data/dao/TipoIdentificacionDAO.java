package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.TipoIdentificacionEntities;

public interface TipoIdentificacionDAO {
	
	List<TipoIdentificacionEntities> read(TipoIdentificacionEntities entities);
	
	void update(TipoIdentificacionEntities entities);

}