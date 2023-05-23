package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoCategoriaEntities;

public interface EstadoCategoriaDAO {

	List<EstadoCategoriaEntities> read(EstadoCategoriaEntities entities);

}
