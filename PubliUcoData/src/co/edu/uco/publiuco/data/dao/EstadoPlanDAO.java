package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoPlanEntities;

public interface EstadoPlanDAO {

	List<EstadoPlanEntities> read(EstadoPlanEntities entities);

}