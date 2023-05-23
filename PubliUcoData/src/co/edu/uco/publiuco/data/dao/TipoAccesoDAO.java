package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.TipoAccesoEntities;

public interface TipoAccesoDAO {
	
	void create(TipoAccesoEntities entities);

	List<TipoAccesoEntities> read(TipoAccesoEntities entities);
	
	void update(TipoAccesoEntities entities);

	void delete(TipoAccesoEntities entities);

}