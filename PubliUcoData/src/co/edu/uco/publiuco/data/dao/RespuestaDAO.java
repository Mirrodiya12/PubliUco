package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.RespuestaEntities;

public interface RespuestaDAO {
	
	List<RespuestaEntities> read(RespuestaEntities entities);

}
