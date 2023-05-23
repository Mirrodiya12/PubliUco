package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoLectorEntities;

public interface EstadoLectorDAO {

	List<EstadoLectorEntities> read(EstadoLectorEntities entities);

}