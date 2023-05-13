package co.edu.uco.publiuco.business.domain.assembler.concreate;

import java.util.ArrayList;
import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.business.domain.assembler.Assembler;
import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntities;


public final class EstadoTipoRelacionInstitucionAssembler 
		implements Assembler<EstadoTipoRelacionInstitucionDomain,
	    EstadoTipoRelacionInstitucionDTO, EstadoTipoRelacionInstitucionEntities>{

	private static final Assembler<EstadoTipoRelacionInstitucionDomain,EstadoTipoRelacionInstitucionDTO,EstadoTipoRelacionInstitucionEntities> INSTANCE = new EstadoTipoRelacionInstitucionAssembler();
	
	private EstadoTipoRelacionInstitucionAssembler() {
		super();
	}
	
	public static final Assembler<EstadoTipoRelacionInstitucionDomain,EstadoTipoRelacionInstitucionDTO,EstadoTipoRelacionInstitucionEntities> getInstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoTipoRelacionInstitucionDTO toDTOFromDomain(EstadoTipoRelacionInstitucionDomain domain) {
		return EstadoTipoRelacionInstitucionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoTipoRelacionInstitucionDomain toDomainFromDto(EstadoTipoRelacionInstitucionDTO dto) {
		return new EstadoTipoRelacionInstitucionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoTipoRelacionInstitucionEntities toEntitiesFromDomain(EstadoTipoRelacionInstitucionDomain domain) {
		return new EstadoTipoRelacionInstitucionEntities(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	
	
	@Override
	public EstadoTipoRelacionInstitucionDomain toDomainFromEntities(EstadoTipoRelacionInstitucionEntities entity) {
		return new EstadoTipoRelacionInstitucionDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}
	

	@Override
	public List<EstadoTipoRelacionInstitucionDomain> toDomainListFromEntities(
			List<EstadoTipoRelacionInstitucionEntities> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntities(entity)).toList();
	}

}
