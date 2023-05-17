package co.edu.uco.publiuco.data.dao.relational;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoDataException;
import co.edu.uco.publiuco.crosscutting.utils.UtilSql;

public abstract class SqlDAO<E> {
	
	private Connection connection; 
	
	protected SqlDAO(final Connection connection) {
		setConnection(connection);
	}
	
	protected Connection getConnection() {
		return connection;
	}
	
	private final void setConnection(final Connection connection) {
		if (!UtilSql.connectionIsOpen(connection)) {
			var userMesagge = "Problemas al crear el uusario";
			var technicalMessage = "problemas de conexion, no esta abierta";
			
			throw PubliucoDataException.create(technicalMessage, userMesagge);
			
			}
		this.connection = connection;
	}
	
	protected abstract String prepareSelect();
	
	protected abstract String prepareFrom();
	
	protected abstract String prepareWhere(E entities, List<Object> parameters);
	
	protected abstract String prepareOrderBy();
		
	

}
