package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concreate.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntities;

public final class EstadoTipoRelacionInstitucionBusinessImpl implements EstadoTipoRelacionInstitucionBusiness {
	
	private DAOFactory daoFactory;
	
	public EstadoTipoRelacionInstitucionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoTipoRelacionInstitucionDomain domain) {
		
		EstadoTipoRelacionInstitucionEntities entities = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntitiesFromDomain(domain)	;	
		daoFactory.getEstadoTipoRelacionInstitucionDAO().create(null);
		
	}

	@Override
	public final List<EstadoTipoRelacionInstitucionDomain> list(final EstadoTipoRelacionInstitucionDomain domain) {
		final EstadoTipoRelacionInstitucionEntities entities = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntitiesFromDomain(domain);		
		final List<EstadoTipoRelacionInstitucionEntities> result = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entities);
		return null;
	}

	@Override
	public final void modify(final EstadoTipoRelacionInstitucionDomain domain) {
		EstadoTipoRelacionInstitucionEntities entities = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntitiesFromDomain(domain);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().update(entities);	
		}

	@Override
	public final void drop(final EstadoTipoRelacionInstitucionDomain domain) {
		EstadoTipoRelacionInstitucionEntities entities = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntitiesFromDomain(domain);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().delete(entities);
		
	}

}
