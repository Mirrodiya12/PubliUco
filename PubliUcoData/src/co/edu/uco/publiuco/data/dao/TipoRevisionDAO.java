package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.TipoRevisionEntities;

public interface TipoRevisionDAO {
	
	List<TipoRevisionEntities> read(TipoRevisionEntities entities);

}