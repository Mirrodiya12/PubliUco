package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisorRevisionEntities {
	
	private static final RevisorRevisionEntities DEFAULT_OBJECT = new RevisorRevisionEntities();
	private UUID identificador;
	private RevisionEntities revision;
	private RevisorEntities revisor;
	private LocalDate fechaAsignacionRevision;
	private LocalDate fechaCompletitudRevision;
	private EstadoRevisionEntities estadoRevision;
	
	private RevisorRevisionEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setRevision(RevisionEntities.getDefaultObject());
		setRevisor(RevisorEntities.getDefaultObject());
		setFechaAsignacionRevision(UtilDate.DEFAULT_DATE);
		setFechaCompletitudRevision(UtilDate.DEFAULT_DATE);
		setEstadoRevision(EstadoRevisionEntities.getDefaultObject());
	}

	public RevisorRevisionEntities(UUID identificador, RevisionEntities revision, RevisorEntities revisor,
			LocalDate fechaAsignacionRevision, LocalDate fechaCompletitudRevision, EstadoRevisionEntities estadoRevision) {
		super();
		setIdentificador(identificador);
		setRevision(revision);
		setRevisor(revisor);
		setFechaAsignacionRevision(fechaAsignacionRevision);
		setFechaCompletitudRevision(fechaCompletitudRevision);
		setEstadoRevision(estadoRevision);
	}
	
	public static RevisorRevisionEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final RevisionEntities getRevision() {
		return revision;
	}

	private final void setRevision(final RevisionEntities revision) {
		this.revision = UtilObject.getDefault(revision, RevisionEntities.getDefaultObject());
	}

	public final RevisorEntities getRevisor() {
		return revisor;
	}

	private final void setRevisor(final RevisorEntities revisor) {
		this.revisor = UtilObject.getDefault(revisor, RevisorEntities.getDefaultObject());
	}

	public final LocalDate getFechaAsignacionRevision() {
		return fechaAsignacionRevision;
	}

	private final void setFechaAsignacionRevision(final LocalDate fechaAsignacionRevision) {
		this.fechaAsignacionRevision = UtilDate.getDefault(fechaAsignacionRevision);
	}

	public final LocalDate getFechaCompletitudRevision() {
		return fechaCompletitudRevision;
	}

	private final void setFechaCompletitudRevision(final LocalDate fechaCompletitudRevision) {
		this.fechaCompletitudRevision = UtilDate.getDefault(fechaCompletitudRevision);
	}

	public final EstadoRevisionEntities getEstadoRevision() {
		return estadoRevision;
	}

	private final void setEstadoRevision(final EstadoRevisionEntities estadoRevision) {
		this.estadoRevision = UtilObject.getDefault(estadoRevision, EstadoRevisionEntities.getDefaultObject());
	}

}
