package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PreferenciaEscritorEntities {
	
	private static final PreferenciaEscritorEntities DEFAULT_OBJECT = new PreferenciaEscritorEntities();
	private UUID identificador;
	private PerfilEntities perfil;
	private EscritorEntities escritor;
	
	private PreferenciaEscritorEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilEntities.getDefaultObject());
		setEscritor(EscritorEntities.getDefaultObject());
	}

	public PreferenciaEscritorEntities(UUID identificador, PerfilEntities perfil, EscritorEntities escritor) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setEscritor(escritor);
	}
	
	public static PreferenciaEscritorEntities getDefaultObject() {
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

	public final EscritorEntities getEscritor() {
		return escritor;
	}

	private final void setEscritor(final EscritorEntities escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorEntities.getDefaultObject());
	}
}
