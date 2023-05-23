package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoComentarioLectorEntities;

public interface EstadoComentarioLectorDAO {

	List<EstadoComentarioLectorEntities> read(EstadoComentarioLectorEntities entities);

}
