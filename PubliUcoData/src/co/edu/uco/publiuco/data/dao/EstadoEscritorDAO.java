package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoEscritorEntities;

public interface EstadoEscritorDAO {

	List<EstadoEscritorEntities> read(EstadoEscritorEntities entities);

}