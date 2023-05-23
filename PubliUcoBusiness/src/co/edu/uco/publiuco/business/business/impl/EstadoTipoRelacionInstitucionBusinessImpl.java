package co.edu.uco.publiuco.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.business.domain.assembler.concreate.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntities;

public final class EstadoTipoRelacionInstitucionBusinessImpl implements EstadoTipoRelacionInstitucionBusiness{
	
	private DAOFactory daoFactory;
	
	public EstadoTipoRelacionInstitucionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(final EstadoTipoRelacionInstitucionDomain domain) {
		
		UUID identificador;
		EstadoTipoRelacionInstitucionEntities entityTmp;
		List<EstadoTipoRelacionInstitucionEntities> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = EstadoTipoRelacionInstitucionEntities.createWithIdentificador(identificador);
			result = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entityTmp);
		}while(!result.isEmpty());
		
		entityTmp = EstadoTipoRelacionInstitucionEntities.createWithNombre(domain.getNombre());
		result = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			throw PubliucoBusinessException.create("El estado de tipo relacion institucion que intenta crear ya existe, por favor verifique los datos y de ser necesario proceda a actualizarlo");
		}
		
		final var domainToCreate = new EstadoTipoRelacionInstitucionDomain(identificador, domain.getNombre(), domain.getDescripcion());
		
		
		final EstadoTipoRelacionInstitucionEntities entity = EstadoTipoRelacionInstitucionAssembler.getInstance().
				toEntitiesFromDomain(domainToCreate);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().create(entity);
	}

	@Override
	public final List<EstadoTipoRelacionInstitucionDomain> list(final EstadoTipoRelacionInstitucionDomain domain) {

        final EstadoTipoRelacionInstitucionEntities entity = EstadoTipoRelacionInstitucionAssembler.getInstance()
                .toEntitiesFromDomain(domain);

        List<EstadoTipoRelacionInstitucionEntities> resultEntityList = daoFactory.getEstadoTipoRelacionInstitucionDAO()
                .read(entity);

        return EstadoTipoRelacionInstitucionAssembler.getInstance().toDomainListFromEntities(resultEntityList);
    }

	@Override
	public void modify(final EstadoTipoRelacionInstitucionDomain domain) {
		final EstadoTipoRelacionInstitucionEntities entity = EstadoTipoRelacionInstitucionAssembler.getInstance().
				toEntitiesFromDomain(domain);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().update(entity);

	}

	@Override
	public void drop(final EstadoTipoRelacionInstitucionDomain domain) {
		final EstadoTipoRelacionInstitucionEntities entity = EstadoTipoRelacionInstitucionAssembler.getInstance().
				toEntitiesFromDomain(domain);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().delete(entity);
	}
}