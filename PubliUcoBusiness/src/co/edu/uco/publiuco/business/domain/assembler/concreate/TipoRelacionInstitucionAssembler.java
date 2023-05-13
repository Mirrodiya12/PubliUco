package co.edu.uco.publiuco.business.domain.assembler.concreate;

import java.util.List;

import co.edu.uco.publiuco.business.domain.TipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.business.domain.assembler.Assembler;
import co.edu.uco.publiuco.dto.TipoRelacionInstitucionDTO;
import co.edu.uco.publiuco.entities.TipoRelacionInstitucionEntities;


public final class TipoRelacionInstitucionAssembler
        implements Assembler<TipoRelacionInstitucionDomain, TipoRelacionInstitucionDTO, TipoRelacionInstitucionEntities> {

    private static final TipoRelacionInstitucionAssembler INSTANCE = new TipoRelacionInstitucionAssembler();

    private TipoRelacionInstitucionAssembler() {
        super();
    }

    public static TipoRelacionInstitucionAssembler getInstance() {
        return INSTANCE;
    }

    @Override
    public TipoRelacionInstitucionDTO toDTOFromDomain(TipoRelacionInstitucionDomain domain) {
        return TipoRelacionInstitucionDTO.create()
                .setIdentificador(domain.getIdentificador())
                .setNombre(domain.getNombre())
                .setDescripcion(domain.getDescripcion());
    }

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
	public TipoRelacionInstitucionDomain toDomainFromEntities(TipoRelacionInstitucionEntities entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoRelacionInstitucionDomain> toDomainListFromEntities(
			List<TipoRelacionInstitucionEntities> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

}
