package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.ReporteEntities;

public interface ReporteDAO {
	
	void create(ReporteEntities entities);

	List<ReporteEntities> read(ReporteEntities entities);

	void update(ReporteEntities entities);

	void delete(ReporteEntities entities);

}
