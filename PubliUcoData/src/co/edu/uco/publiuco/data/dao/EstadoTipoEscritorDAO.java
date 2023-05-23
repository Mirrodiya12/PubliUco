package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoTipoEscritorEntities;

public interface EstadoTipoEscritorDAO {
	
	List<EstadoTipoEscritorEntities> read(EstadoTipoEscritorEntities entities);

}
