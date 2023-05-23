package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class EscritorPublicacionEntities {
	
	private static final EscritorPublicacionEntities DEFAULT_OBJECT = new EscritorPublicacionEntities();
	private UUID identificador;
	private EscritorEntities escritor;
	private PublicacionEntities publicacion;
	private TipoEscritorEntities tipoEscritor;
	
	
	private EscritorPublicacionEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setEscritor(EscritorEntities.getDefaultObject());
		setPublicacion(PublicacionEntities.getDefaultObject());
		setTipoEscritor(TipoEscritorEntities.getDefaultObject());
	}

	public EscritorPublicacionEntities(UUID identificador, EscritorEntities escritor, PublicacionEntities publicacion,
			TipoEscritorEntities tipoEscritor) {
		super();
		setIdentificador(identificador);
		setEscritor(escritor);
		setPublicacion(publicacion);
		setTipoEscritor(tipoEscritor);
	}
	
	public static EscritorPublicacionEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final EscritorEntities getEscritor() {
		return escritor;
	}

	private final void setEscritor(final EscritorEntities escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorEntities.getDefaultObject());
	}

	public final PublicacionEntities getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionEntities publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntities.getDefaultObject());
	}

	public final TipoEscritorEntities getTipoEscritor() {
		return tipoEscritor;
	}

	private final void setTipoEscritor(final TipoEscritorEntities tipoEscritor) {
		this.tipoEscritor = UtilObject.getDefault(tipoEscritor, TipoEscritorEntities.getDefaultObject());
	}
}
