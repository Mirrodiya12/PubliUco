package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PalabraClavePublicacionEntities {
	
	private static final PalabraClavePublicacionEntities DEFAULT_OBJECT = new PalabraClavePublicacionEntities();
	private UUID identificador;
	private PublicacionEntities publicacion;
	private String palabraClave;
	
	private PalabraClavePublicacionEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionEntities.getDefaultObject());
		setPalabraClave(UtilText.EMPTY);
	}

	public PalabraClavePublicacionEntities(UUID identificador, PublicacionEntities publicacion, String palabraClave) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPalabraClave(palabraClave);
	}
	
	public static PalabraClavePublicacionEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final PublicacionEntities getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionEntities publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntities.getDefaultObject());
	}

	public final String getPalabraClave() {
		return palabraClave;
	}

	private final void setPalabraClave(final String palabraClave) {
		this.palabraClave = UtilText.getUtilText().applyTrim(palabraClave);
	}
}
