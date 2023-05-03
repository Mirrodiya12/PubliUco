package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.TipoRelacionInstitucionEntities;

public interface TipoRelacionInstitucionDAO {
	
	void create(TipoRelacionInstitucionEntities entities);
	
	List<TipoRelacionInstitucionEntities> read(TipoRelacionInstitucionEntities entities);
	
	void update(TipoRelacionInstitucionEntities entities);
	
	void delete(TipoRelacionInstitucionEntities entities);

}

