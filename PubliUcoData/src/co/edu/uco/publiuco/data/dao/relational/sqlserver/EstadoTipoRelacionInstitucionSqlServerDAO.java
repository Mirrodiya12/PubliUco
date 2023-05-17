package co.edu.uco.publiuco.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoDataException;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilSql;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;
import co.edu.uco.publiuco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.relational.SqlDAO;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntities;

public class EstadoTipoRelacionInstitucionSqlServerDAO extends SqlDAO<EstadoTipoRelacionInstitucionEntities> implements EstadoTipoRelacionInstitucionDAO {
	
	public EstadoTipoRelacionInstitucionSqlServerDAO(final Connection connection) {
		super(connection);
		
	}

	@Override
	public final void create(final EstadoTipoRelacionInstitucionEntities entities) {
		var sqlStatement = "INSERT INTO EstadoTipoRelacionInstitucion(identificador, nombre, descripcion) VALUES (?, ?, ?)	";
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entities.getIdentificador());
			preparedStatement.setString(2, entities.getNombre());
			preparedStatement.setString(3, entities.getDescripcion());
			
			preparedStatement.executeUpdate();
		
		}catch (final SQLException exception) {
			var userMessage="Se registro un problema registrando el nuevo estado";
			var technicalMessage="Se ha presentado un problema dentro del metodo create en la clase";
			
			throw PubliucoDataException.create(technicalMessage, userMessage, exception );
			
		}catch (final Exception exception) {
			var userMessage="Se registro un problema inesperado en el nuevo estado";
			var technicalMessage="Se ha presentado un problema inesperado dentro del metodo create en la clase";
			
			throw PubliucoDataException.create(technicalMessage, userMessage, exception );
			
		}
		
	}

	@Override
	public final List<EstadoTipoRelacionInstitucionEntities> read(final EstadoTipoRelacionInstitucionEntities entities) {
		var sqlStatement = new StringBuilder();
		
		sqlStatement.append(prepareSelect());
		sqlStatement.append(prepareFrom());
		sqlStatement.append(prepareWhere(entities, parameters));
		sqlStatement.append(prepareOrderBy());
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement.toString())){
			
		}catch(SQLException exception) {
			
		}catch(Exception exception) {
			
		}
		return null;
	}

	@Override
	public final void update(final EstadoTipoRelacionInstitucionEntities entities) {
		var sqlStatement = "UPDATE EstadoTipoRelacionInstitucion SET nombre=? , descripcion = ? WHERE identificador = ?	";
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			

			preparedStatement.setString(1, entities.getNombre());
			preparedStatement.setString(2, entities.getDescripcion());
			
			preparedStatement.executeUpdate();
		
		}catch (final SQLException exception) {
			var userMessage="Se registro un problema actualizando el nuevo estado";
			var technicalMessage="Se ha presentado un problema dentro del metodo update en la clase";
			
			throw PubliucoDataException.create(technicalMessage, userMessage, exception );
			
		}catch (final Exception exception) {
			var userMessage="Se registro un problema inesperado actualizando en el nuevo estado";
			var technicalMessage="Se ha presentado un problema inesperado dentro del metodo update en la clase";
			
			throw PubliucoDataException.create(technicalMessage, userMessage, exception );
			
		}
		
	}

	@Override
	public final void delete(final EstadoTipoRelacionInstitucionEntities entities) {
		var sqlStatement = "DELETE EstadoTipoRelacionInstitucion WHERE identificador = ?	";
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entities.getIdentificador());
			
			
			preparedStatement.executeUpdate();
		
		}catch (final SQLException exception) {
			var userMessage="Se registro un problema eliminando el nuevo estado";
			var technicalMessage="Se ha presentado un problema dentro del metodo delete en la clase";
			
			throw PubliucoDataException.create(technicalMessage, userMessage, exception );
			
		}catch (final Exception exception) {
			var userMessage="Se registro un problema inesperado eliminando en el nuevo estado";
			var technicalMessage="Se ha presentado un problema inesperado dentro del metodo delete en la clase";
			
			throw PubliucoDataException.create(technicalMessage, userMessage, exception );
			
		}
		
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, nombre, descripcion ";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM EstadoTipoRelacionInstitucion";
	}

	@Override
	protected final String prepareWhere(final EstadoTipoRelacionInstitucionEntities entities, List<Object> parameters) {
		final var where = new StringBuilder("");
		parameters = UtilObject.getDefault(parameters, new ArrayList<>());
		var setWhere = true;
		if(!UtilObject.isNull(entities)) {
			if(!UtilUUID.isDefault(entities.getIdentificador())) {
				parameters.add(entities.getIdentificador());
				where.append("WHERE identificador = ?");
				setWhere = false;
			}
			
			if(!UtilText.getUtilText().isEmpty(entities.getNombre())) {
				parameters.add(entities.getNombre());
				where.append(setWhere ? "WHERE ": "AND ").append ("nombre = ? ");
				setWhere = false;
			}
			if(!UtilText.getUtilText().isEmpty(entities.getDescripcion())) {
				parameters.add(entities.getDescripcion());
				where.append(setWhere ? "WHERE ": "AND ").append("descripcion LIKE  %?% ");
			}
		}
		
		return where.toString();
	}

	@Override
	protected final String prepareOrderBy() {
		return "ORDER BY nombre ASC";
	}

}
