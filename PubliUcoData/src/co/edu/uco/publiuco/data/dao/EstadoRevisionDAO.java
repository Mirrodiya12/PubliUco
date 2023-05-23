package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoRevisionEntities;

public interface EstadoRevisionDAO {
	
	List<EstadoRevisionEntities> read(EstadoRevisionEntities entities);

}