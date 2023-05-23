package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoPublicacionEntities;

public interface EstadoPublicacionDAO {

	List<EstadoPublicacionEntities> read(EstadoPublicacionEntities entities);

}
