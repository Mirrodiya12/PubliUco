package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.publiuco.business.business.impl.EstadoTipoRelacionInstitucionBusinessImpl;
import co.edu.uco.publiuco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.business.domain.assembler.concreate.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.business.facade.EstadoTipoRelacionInstitucionFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;


public final class EstadoTipoRelacionInstitucionFacadeImpl  implements EstadoTipoRelacionInstitucionFacade{
	
	
	private final DAOFactory daoFactory;
	private final EstadoTipoRelacionInstitucionBusiness business; 
	
	public EstadoTipoRelacionInstitucionFacadeImpl(){
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new EstadoTipoRelacionInstitucionBusinessImpl(daoFactory);
	}
	

	@Override
	public void register(EstadoTipoRelacionInstitucionDTO dto) {
		try {
			
			daoFactory.iniciarTransaccion();
			final EstadoTipoRelacionInstitucionDomain domain = EstadoTipoRelacionInstitucionAssembler.getInstance().toDomainFromDto(dto);
			//////
			
			business.register(domain);
			
			
			daoFactory.confirmarTransaccion();
		}catch (PubliucoException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado del tipo de relacion para una institucion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicacion...";
			var technicalMessage = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo EstadoTipoRelacionDTO. por favor valide la traza completa de la excepcion presentada";
			
			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public List<EstadoTipoRelacionInstitucionDTO> list(EstadoTipoRelacionInstitucionDTO dto) {
		return null;
	}

	
	@Override
	public void modify(EstadoTipoRelacionInstitucionDTO dto) {
		
	}
	
	@Override
	public void drop(EstadoTipoRelacionInstitucionDTO dto) {
		
	}

}