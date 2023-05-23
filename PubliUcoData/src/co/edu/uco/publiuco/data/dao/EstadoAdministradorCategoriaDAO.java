package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoAdministradorCategoriaEntities;

public interface EstadoAdministradorCategoriaDAO {
	
	List<EstadoAdministradorCategoriaEntities> read(EstadoAdministradorCategoriaEntities entities);

}