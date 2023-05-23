package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoTipoIdentificacionEntities;

public interface EstadoTipoIdentificacionDAO {
	
	List<EstadoTipoIdentificacionEntities> read(EstadoTipoIdentificacionEntities entities);

}