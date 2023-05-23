package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoVersionEntities;

public interface EstadoVersionDAO {
	
	List<EstadoVersionEntities> read(EstadoVersionEntities entities);

}