package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class SuscripcionCategoriaEntities {

	private static final SuscripcionCategoriaEntities DEFAULT_OBJECT = new SuscripcionCategoriaEntities();
	private UUID identificador;
	private PerfilEntities perfil;
	private PlanCategoriaEntities planCategoria;
	private EstadoSuscripcionEntities estado;

	private SuscripcionCategoriaEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilEntities.getDefaultObject());
		setPlanCategoria(PlanCategoriaEntities.getDefaultObject());
		setEstado(EstadoSuscripcionEntities.getDefaultObject());
	}

	public SuscripcionCategoriaEntities(UUID identificador, PerfilEntities perfil, PlanCategoriaEntities planCategoria,
			EstadoSuscripcionEntities estado) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setPlanCategoria(planCategoria);
		setEstado(estado);
	}

	public static SuscripcionCategoriaEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final PerfilEntities getPerfil() {
		return perfil;
	}

	private final void setPerfil(final PerfilEntities perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilEntities.getDefaultObject());
	}

	public final PlanCategoriaEntities getPlanCategoria() {
		return planCategoria;
	}

	private final void setPlanCategoria(final PlanCategoriaEntities planCategoria) {
		this.planCategoria = UtilObject.getDefault(planCategoria, PlanCategoriaEntities.getDefaultObject());
	}

	public final EstadoSuscripcionEntities getEstado() {
		return estado;
	}

	private final void setEstado(EstadoSuscripcionEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoSuscripcionEntities.getDefaultObject());
	}
	
}