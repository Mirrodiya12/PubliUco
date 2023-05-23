package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoPreferenciaEntities;

public interface EstadoPreferenciaDAO {
	
	List<EstadoPreferenciaEntities> read(EstadoPreferenciaEntities entities);

}