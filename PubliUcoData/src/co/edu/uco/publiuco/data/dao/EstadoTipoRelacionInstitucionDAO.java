package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntities;

public interface EstadoTipoRelacionInstitucionDAO {
	
	void create(EstadoTipoRelacionInstitucionEntities entities);
	
	List<EstadoTipoRelacionInstitucionEntities> read(EstadoTipoRelacionInstitucionEntities entities);
	
	void update(EstadoTipoRelacionInstitucionEntities entities);
	
	void delete(EstadoTipoRelacionInstitucionEntities entities);

}
