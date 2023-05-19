package co.edu.uco.publiuco.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.business.domain.assembler.concreate.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntities;

public final class EstadoTipoRelacionInstitucionBusinessImpl implements EstadoTipoRelacionInstitucionBusiness{
	
	private DAOFactory daoFactory;
	
	public EstadoTipoRelacionInstitucionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoTipoRelacionInstitucionDomain domain) {
		UUID identificador;
		EstadoTipoRelacionInstitucionEntities entitiesTmp;
		List<EstadoTipoRelacionInstitucionEntities> result;
		
		
		do {
			
			identificador = UtilUUID.generateNewUUID();
			entitiesTmp = new EstadoTipoRelacionInstitucionEntities(identificador);
			result = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entitiesTmp);			
		}while(!result.isEmpty());
		
		entitiesTmp = new EstadoTipoRelacionInstitucionEntities(nombre);
		
		
		
		final EstadoTipoRelacionInstitucionEntities entity = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntitiesFromDomain(domain);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().create(entity);
		
	}

	@Override
	public final List<EstadoTipoRelacionInstitucionDomain> list(final EstadoTipoRelacionInstitucionDomain domain) {
		final EstadoTipoRelacionInstitucionEntities entity = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntitiesFromDomain(domain);
		final List<EstadoTipoRelacionInstitucionEntities> result = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entity);
		return null;
	}

	@Override
	public final void modify(final EstadoTipoRelacionInstitucionDomain domain) {
		final EstadoTipoRelacionInstitucionEntities entity = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntitiesFromDomain(domain);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().update(entity);
		
	}

	@Override
	public final void drop(final EstadoTipoRelacionInstitucionDomain domain) {
		final EstadoTipoRelacionInstitucionEntities entity = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntitiesFromDomain(domain);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().delete(entity);
	}

}
