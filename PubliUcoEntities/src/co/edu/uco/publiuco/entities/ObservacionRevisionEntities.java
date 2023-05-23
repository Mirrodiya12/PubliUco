package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ObservacionRevisionEntities {
	
	private static final ObservacionRevisionEntities DEFAULT_OBJECT = new ObservacionRevisionEntities();
	private UUID identificador;
	private EscritorPublicacionEntities escritorPublicacion;
	private ComentarioRevisorEntities comentarioRevisor;
	private LocalDate fechaReporteObservacion;
	private LocalDate fechaRevisionObservacion;
	private EstadoObservacionRevisorEntities estado;
	private String observacion;

	private ObservacionRevisionEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setEscritorPublicacion(EscritorPublicacionEntities.getDefaultObject());
		setComentarioRevisor(ComentarioRevisorEntities.getDefaultObject());
		setFechaReporteObservacion(UtilDate.DEFAULT_DATE);
		setFechaRevisionObservacion(UtilDate.DEFAULT_DATE);
		setEstado(EstadoObservacionRevisorEntities.getDefaultObject());
		setObservacion(UtilText.EMPTY);
	}

	public ObservacionRevisionEntities(UUID identificador, EscritorPublicacionEntities escritorPublicacion,
			ComentarioRevisorEntities comentarioRevisor, LocalDate fechaReporteObservacion,
			LocalDate fechaRevisionObservacion, EstadoObservacionRevisorEntities estado, String observacion) {
		super();
		setIdentificador(identificador);
		setEscritorPublicacion(escritorPublicacion);
		setComentarioRevisor(comentarioRevisor);
		setFechaReporteObservacion(fechaReporteObservacion);
		setFechaRevisionObservacion(fechaRevisionObservacion);
		setEstado(estado);
		setObservacion(observacion);
	}

	public static ObservacionRevisionEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final EscritorPublicacionEntities getEscritorPublicacion() {
		return escritorPublicacion;
	}

	private final void setEscritorPublicacion(EscritorPublicacionEntities escritorPublicacion) {
		this.escritorPublicacion = UtilObject.getDefault(escritorPublicacion, EscritorPublicacionEntities.getDefaultObject());
	}

	public final ComentarioRevisorEntities getComentarioRevisor() {
		return comentarioRevisor;
	}

	private final void setComentarioRevisor(ComentarioRevisorEntities comentarioRevisor) {
		this.comentarioRevisor = UtilObject.getDefault(comentarioRevisor, ComentarioRevisorEntities.getDefaultObject());
	}

	public final LocalDate getFechaReporteObservacion() {
		return fechaReporteObservacion;
	}

	private final void setFechaReporteObservacion(LocalDate fechaReporteObservacion) {
		this.fechaReporteObservacion = UtilDate.getDefault(fechaReporteObservacion);
	}

	public final LocalDate getFechaRevisionObservacion() {
		return fechaRevisionObservacion;
	}

	private final void setFechaRevisionObservacion(LocalDate fechaRevisionObservacion) {
		this.fechaRevisionObservacion = UtilDate.getDefault(fechaRevisionObservacion);
	}

	public final EstadoObservacionRevisorEntities getEstado() {
		return estado;
	}

	private final void setEstado(EstadoObservacionRevisorEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoObservacionRevisorEntities.getDefaultObject());
	}

	public final String getObservacion() {
		return observacion;
	}

	private final void setObservacion(String observacion) {
		this.observacion = UtilText.getUtilText().applyTrim(observacion);
	}
}
