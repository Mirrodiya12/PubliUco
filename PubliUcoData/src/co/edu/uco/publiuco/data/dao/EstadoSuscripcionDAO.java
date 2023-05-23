package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoSuscripcionEntities;

public interface EstadoSuscripcionDAO {
	
	List<EstadoSuscripcionEntities> read(EstadoSuscripcionEntities entities);

}
