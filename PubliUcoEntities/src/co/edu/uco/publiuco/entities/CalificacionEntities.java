package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class CalificacionEntities {
	
	private static final CalificacionEntities DEFAULT_OBJECT = new CalificacionEntities();
	private UUID identificador;
	private LectorEntities lector;
	private PublicacionEntities publicacion;
	private LocalDate fechaCalificacion;
	private double calificacion;
	
	private CalificacionEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntities.getDefaultObject());
		setPublicacion(PublicacionEntities.getDefaultObject());
		setFechaCalificacion(UtilDate.DEFAULT_DATE);
		setCalificacion(UtilNumber.ZERO.doubleValue());
	}
	public CalificacionEntities(UUID identificador, LectorEntities lector, PublicacionEntities publicacion,
			LocalDate fechaCalificacion, double calificacion) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaCalificacion(fechaCalificacion);
		setCalificacion(calificacion);
	}
	public static CalificacionEntities getDefaultObject() {
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

	public final void setLector(final LectorEntities lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntities.getDefaultObject());
	}

	public final PublicacionEntities getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionEntities publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntities.getDefaultObject());
	}

	public final LocalDate getFechaCalificacion() {
		return fechaCalificacion;
	}

	private final void setFechaCalificacion(final LocalDate fechaCalificacion) {
		this.fechaCalificacion = UtilDate.getDefault(fechaCalificacion);
	}

	public final double getCalificacion() {
		return calificacion;
	}

	private final void setCalificacion(final double calificacion) {
		this.calificacion = UtilNumber.getUtilNumber().getDefault(calificacion).doubleValue();
	}
}
