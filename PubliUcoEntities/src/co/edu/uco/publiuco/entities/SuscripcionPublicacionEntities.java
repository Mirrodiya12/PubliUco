package co.edu.uco.publiuco.entities;

import java.util.UUID;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class SuscripcionPublicacionEntities {
	
	private static final SuscripcionPublicacionEntities DEFAULT_OBJECT = new SuscripcionPublicacionEntities();
	private UUID identificador;
	private PerfilEntities perfil;
	private PlanPublicacionEntities planPublicacion;

	private SuscripcionPublicacionEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilEntities.getDefaultObject());
		setPlanPublicacion(PlanPublicacionEntities.getDefaultObject());
	}

	public SuscripcionPublicacionEntities(UUID identificador, PerfilEntities perfil, PlanPublicacionEntities publicacion) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setPlanPublicacion(publicacion);
	}

	public static SuscripcionPublicacionEntities getDefaultObject() {
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

	public final PlanPublicacionEntities getPlanPublicacion() {
		return planPublicacion;
	}

	private final void setPlanPublicacion(final PlanPublicacionEntities planPublicacion) {
		this.planPublicacion = UtilObject.getDefault(planPublicacion, PlanPublicacionEntities.getDefaultObject());
	}
	
}
