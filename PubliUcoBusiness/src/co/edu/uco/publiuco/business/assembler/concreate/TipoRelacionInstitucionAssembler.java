package co.edu.uco.publiuco.business.assembler.concreate;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.TipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.dto.TipoRelacionInstitucionDTO;
import co.edu.uco.publiuco.entities.TipoRelacionInstitucionEntities;

public final class TipoRelacionInstitucionAssembler implements 
Assembler<TipoRelacionInstitucionDomain, TipoRelacionInstitucionDTO, TipoRelacionInstitucionEntities>{

	@Override
	public TipoRelacionInstitucionDTO toDTOFromDomain(TipoRelacionInstitucionDomain domain) {
		return TipoRelacionInstitucionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion()).setEstado(EstadoTipoRelacionInstitucionAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}//(EstadoTipoRelacionInstitucionAssembler.getInstance()).toDtoFromDomain(domain.getEstado())

	@Override
	public TipoRelacionInstitucionDomain toDomainFromDto(TipoRelacionInstitucionDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoRelacionInstitucionEntities toEntitiesFromDomain(TipoRelacionInstitucionDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoRelacionInstitucionDomain toDomainFromEntities(TipoRelacionInstitucionEntities entities) {
		// TODO Auto-generated method stub
		return null;
	}

}
