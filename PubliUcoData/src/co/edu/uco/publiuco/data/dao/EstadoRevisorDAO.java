package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoRevisorEntities;

public interface EstadoRevisorDAO {
	
	List<EstadoRevisorEntities> read(EstadoRevisorEntities entities);

}
