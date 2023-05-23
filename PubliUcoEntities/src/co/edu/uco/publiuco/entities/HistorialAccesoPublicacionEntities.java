package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class HistorialAccesoPublicacionEntities {

	private static final HistorialAccesoPublicacionEntities DEFAULT_OBJECT = new HistorialAccesoPublicacionEntities();
	private UUID identificador;
	private LectorEntities lector;
	private PublicacionEntities publicacion;
	private LocalDate fechaAcceso;

	private HistorialAccesoPublicacionEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntities.getDefaultObject());
		setPublicacion(PublicacionEntities.getDefaultObject());
		setFechaAcceso(UtilDate.DEFAULT_DATE);
	}

	public HistorialAccesoPublicacionEntities(UUID identificador, LectorEntities lector, PublicacionEntities publicacion,
			LocalDate fechaAcceso) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaAcceso(fechaAcceso);
	}

	public static HistorialAccesoPublicacionEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final LectorEntities getLector() {
		return lector;
	}

	private final void setLector(final LectorEntities lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntities.getDefaultObject());
	}

	public final PublicacionEntities getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionEntities publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntities.getDefaultObject());
	}

	public final LocalDate getFechaAcceso() {
		return fechaAcceso;
	}

	private final void setFechaAcceso(final LocalDate fechaAcceso) {
		this.fechaAcceso = UtilDate.getDefault(fechaAcceso);
	}

}
