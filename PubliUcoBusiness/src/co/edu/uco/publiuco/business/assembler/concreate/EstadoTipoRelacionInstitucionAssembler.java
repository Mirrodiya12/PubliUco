package co.edu.uco.publiuco.business.assembler.concreate;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntities;

public final class EstadoTipoRelacionInstitucionAssembler implements Assembler<EstadoTipoRelacionInstitucionDomain, EstadoTipoRelacionInstitucionDTO, EstadoTipoRelacionInstitucionEntities>{

	private static final Assembler<EstadoTipoRelacionInstitucionDomain, EstadoTipoRelacionInstitucionDTO, EstadoTipoRelacionInstitucionEntities> INSTANCE = new EstadoTipoRelacionInstitucionAssembler();
	
	private EstadoTipoRelacionInstitucionAssembler() {
		super();
		
	}
	
	public static final Assembler<EstadoTipoRelacionInstitucionDomain, EstadoTipoRelacionInstitucionDTO, EstadoTipoRelacionInstitucionEntities>	getInstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoTipoRelacionInstitucionDTO toDTOFromDomain(EstadoTipoRelacionInstitucionDomain domain) {
		return EstadoTipoRelacionInstitucionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoTipoRelacionInstitucionDomain toDomainFromDto(EstadoTipoRelacionInstitucionDTO dto) {
		return  new EstadoTipoRelacionInstitucionDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoTipoRelacionInstitucionEntities toEntitiesFromDomain(EstadoTipoRelacionInstitucionDomain domain) {
		return  new EstadoTipoRelacionInstitucionEntities(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public EstadoTipoRelacionInstitucionDomain toDomainFromEntities(EstadoTipoRelacionInstitucionEntities entities) {
		return  new EstadoTipoRelacionInstitucionDomain(entities.getIdentificador(),entities.getNombre(),entities.getDescripcion());
	}
	


}
