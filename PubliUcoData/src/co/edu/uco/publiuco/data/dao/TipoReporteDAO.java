package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.TipoReporteEntities;

public interface TipoReporteDAO {
	
	List<TipoReporteEntities> read(TipoReporteEntities entities);

}
