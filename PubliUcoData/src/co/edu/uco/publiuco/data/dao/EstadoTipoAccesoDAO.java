package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoTipoAccesoEntities;

public interface EstadoTipoAccesoDAO {
	
	List<EstadoTipoAccesoEntities> read(EstadoTipoAccesoEntities entities);

}