package co.edu.uco.publiuco.data.dao.factory.relational.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoCrossCuttingException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoDataException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.UtilSql;
import co.edu.uco.publiuco.crosscutting.utils.Messages.UtilSqlMessages;
import co.edu.uco.publiuco.data.dao.AdministradorCategoriaDAO;
import co.edu.uco.publiuco.data.dao.CalificacionDAO;
import co.edu.uco.publiuco.data.dao.CategoriaAdministradorCategoriaDAO;
import co.edu.uco.publiuco.data.dao.CategoriaDAO;
import co.edu.uco.publiuco.data.dao.ComentarioLectorDAO;
import co.edu.uco.publiuco.data.dao.ComentarioRevisorDAO;
import co.edu.uco.publiuco.data.dao.EscritorDAO;
import co.edu.uco.publiuco.data.dao.EscritorPublicacionDAO;
import co.edu.uco.publiuco.data.dao.EstadoAdministradorCategoriaDAO;
import co.edu.uco.publiuco.data.dao.EstadoCategoriaDAO;
import co.edu.uco.publiuco.data.dao.EstadoComentarioLectorDAO;
import co.edu.uco.publiuco.data.dao.EstadoEscritorDAO;
import co.edu.uco.publiuco.data.dao.EstadoLectorDAO;
import co.edu.uco.publiuco.data.dao.EstadoObservacionRevisorDAO;
import co.edu.uco.publiuco.data.dao.EstadoPlanDAO;
import co.edu.uco.publiuco.data.dao.EstadoPreferenciaDAO;
import co.edu.uco.publiuco.data.dao.EstadoPublicacionDAO;
import co.edu.uco.publiuco.data.dao.EstadoRevisionDAO;
import co.edu.uco.publiuco.data.dao.EstadoRevisorDAO;
import co.edu.uco.publiuco.data.dao.EstadoSuscripcionDAO;
import co.edu.uco.publiuco.data.dao.EstadoTipoAccesoDAO;
import co.edu.uco.publiuco.data.dao.EstadoTipoEscritorDAO;
import co.edu.uco.publiuco.data.dao.EstadoTipoIdentificacionDAO;
import co.edu.uco.publiuco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.EstadoVersionDAO;
import co.edu.uco.publiuco.data.dao.HistorialAccesoPublicacionDAO;
import co.edu.uco.publiuco.data.dao.LectorDAO;
import co.edu.uco.publiuco.data.dao.ObservacionRevisionDAO;
import co.edu.uco.publiuco.data.dao.PalabraClavePublicacionDAO;
import co.edu.uco.publiuco.data.dao.PerfilDAO;
import co.edu.uco.publiuco.data.dao.PlanCategoriaDAO;
import co.edu.uco.publiuco.data.dao.PlanPublicacionDAO;
import co.edu.uco.publiuco.data.dao.PreferenciaCategoriaDAO;
import co.edu.uco.publiuco.data.dao.PreferenciaEscritorDAO;
import co.edu.uco.publiuco.data.dao.PublicacionDAO;
import co.edu.uco.publiuco.data.dao.ReporteDAO;
import co.edu.uco.publiuco.data.dao.RespuestaDAO;
import co.edu.uco.publiuco.data.dao.RevisionDAO;
import co.edu.uco.publiuco.data.dao.RevisorDAO;
import co.edu.uco.publiuco.data.dao.RevisorRevisionDAO;
import co.edu.uco.publiuco.data.dao.SuscripcionCategoriaDAO;
import co.edu.uco.publiuco.data.dao.SuscripcionPublicacionDAO;
import co.edu.uco.publiuco.data.dao.TipoAccesoDAO;
import co.edu.uco.publiuco.data.dao.TipoComentarioRevisorDAO;
import co.edu.uco.publiuco.data.dao.TipoEscritorDAO;
import co.edu.uco.publiuco.data.dao.TipoIdentificacionDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.TipoReporteDAO;
import co.edu.uco.publiuco.data.dao.TipoRevisionDAO;
import co.edu.uco.publiuco.data.dao.VersionDAO;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;

public class PostgreSqlDAOFactory extends DAOFactory{
	
	private Connection conexion;
	
	public PostgreSqlDAOFactory() {
		abrirConexion();
	}
	
	@Override
	protected void abrirConexion() {
		try { 
			conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/publiuco", "postgres", "admin123");
			UtilSql.connectionIsOpen(conexion);
			System.out.println("Connected");
		}catch (final PubliucoException exception) {
			throw exception;
		}catch (IllegalArgumentException exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_ILEGAL_ARGUMENT_EXCEPTION;
			
			throw PubliucoDataException.create(userMessage, technicalMessage, exception);
		}
		catch (final NullPointerException exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_NULL_POINTER_EXCEPTION;
			
			throw PubliucoDataException.create(userMessage, technicalMessage, exception);
		}catch (final Exception exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION;
			
			throw PubliucoDataException.create(userMessage, technicalMessage, exception);
		}
	}

	@Override
	public void cerrarConexion() {
		try {
			UtilSql.closeConnection(conexion);
		}catch (final PubliucoException exception) {	
			throw exception;
		}
	}
	
	@Override
	public void iniciarTransaccion() {
		try {
			UtilSql.connectionIsOpen(conexion);
			conexion.setAutoCommit(false);
		}catch (final PubliucoException exception) {
				throw exception;
		}catch(final SQLException exception) {
			var userMessage = UtilSqlMessages.COMMIT_IS_STARTING_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.COMMIT_TECHNICAL_SQL_EXCEPTION;
			
			throw PubliucoCrossCuttingException.create(userMessage, technicalMessage, exception);
		}
	}

	@Override
	public void confirmarTransaccion() {
		try {
			UtilSql.initCommitIsReady(conexion);
			conexion.commit();
		}catch(PubliucoException exception){
			throw exception;
		}catch(SQLException exception){
			var userMessage = UtilSqlMessages.CONFIRM_COMMIT_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.COMMIT_TECHNICAL_SQL_EXCEPTION;
			
			throw PubliucoCrossCuttingException.create(userMessage, technicalMessage, exception);
		}
	}

	@Override
	public void cancelarTransaccion() {
		try {
			UtilSql.initCommitIsReady(conexion);
			conexion.rollback();
		}catch(PubliucoException exception){
			throw exception;
		}catch(SQLException exception){
			var userMessage = UtilSqlMessages.CANCEL_COMMIT_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.COMMIT_TECHNICAL_SQL_EXCEPTION;
			
			throw PubliucoCrossCuttingException.create(userMessage, technicalMessage, exception);
		}
	}

	@Override
	public EstadoTipoRelacionInstitucionDAO getEstadoTipoRelacionInstitucionDAO() {
		return null;
	}

	@Override
	public TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO() {
		return null;
	}

	@Override
	public EstadoAdministradorCategoriaDAO getEstadoAdministradorCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoCategoriaDAO getEstadoCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoComentarioLectorDAO getEstadoComentarioLectorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoEscritorDAO getEstadoEscritorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoLectorDAO getEstadoLectorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoObservacionRevisorDAO getEstadoObservacionRevisorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoPlanDAO getEstadoPlanDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoPreferenciaDAO getEstadoPreferenciaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoPublicacionDAO getEstadoPublicacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoRevisionDAO getEstadoRevisionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoRevisorDAO getEstadoRevisorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoSuscripcionDAO getEstadoSuscripcionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoTipoAccesoDAO getEstadoTipoAccesoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoTipoEscritorDAO getEstadoTipoEscritorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoTipoIdentificacionDAO getEstadoTipoIdentificacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoVersionDAO getEstadoVersionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RespuestaDAO getRespuestaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoComentarioRevisorDAO getTipoComentarioRevisorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoReporteDAO getTipoReporteDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoRevisionDAO getTipoRevisionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoAccesoDAO getTipoAccesoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoEscritorDAO getTipoEscritorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoIdentificacionDAO getTipoIdentificacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdministradorCategoriaDAO getAdministradorCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoriaDAO getCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EscritorDAO getEscritorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LectorDAO getLectorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RevisorDAO getRevisorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoriaAdministradorCategoriaDAO getCategoriaAdministradorCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PerfilDAO getPerfilDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanCategoriaDAO getPlanCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PublicacionDAO getPublicacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CalificacionDAO getCalificacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComentarioLectorDAO getComentarioLectorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EscritorPublicacionDAO getEscritorPublicacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HistorialAccesoPublicacionDAO getHistorialAccesoPublicacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PalabraClavePublicacionDAO getPalabraClavePublicacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanPublicacionDAO getPlanPublicacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreferenciaCategoriaDAO getPreferenciaCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreferenciaEscritorDAO getPreferenciaEscritorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SuscripcionCategoriaDAO getSuscripcionCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VersionDAO getVersionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReporteDAO getReporteDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RevisionDAO getRevisionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SuscripcionPublicacionDAO getSuscripcionPublicacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RevisorRevisionDAO getRevisorRevisionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComentarioRevisorDAO getComentarioRevisorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObservacionRevisionDAO getObservacionRevisionDAO() {
		// TODO Auto-generated method stub
		return null;
	}
}