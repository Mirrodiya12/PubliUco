package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisionEntities {

	private static final RevisionEntities DEFAULT_OBJECT = new RevisionEntities();
	private UUID identificador;
	private VersionEntities version;
	private TipoRevisionEntities tipoRevision;
	private LocalDate fechaSolicitudRevision;
	private LocalDate fechaLimiteRevision;
	private LocalDate fechaCompletitudRevision;
	private EstadoRevisionEntities estado;

	private RevisionEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setVersion(VersionEntities.getDefaultObject());
		setTipoRevision(TipoRevisionEntities.getDefaultObject());
		setFechaSolicitudRevision(UtilDate.DEFAULT_DATE);
		setFechaLimiteRevision(UtilDate.DEFAULT_DATE);
		setFechaCompletitudRevision(UtilDate.DEFAULT_DATE);
		setEstado(EstadoRevisionEntities.getDefaultObject());
	}

	public RevisionEntities(UUID identificador, VersionEntities version, TipoRevisionEntities tipoRevision,
			LocalDate fechaSolicitudRevision, LocalDate fechaLimiteRevision, LocalDate fechaCompletitudRevision,
			EstadoRevisionEntities estado) {
		super();
		setIdentificador(identificador);
		setVersion(version);
		setTipoRevision(tipoRevision);
		setFechaSolicitudRevision(fechaSolicitudRevision);
		setFechaLimiteRevision(fechaLimiteRevision);
		setFechaCompletitudRevision(fechaCompletitudRevision);
		setEstado(estado);
	}

	public static RevisionEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final VersionEntities getVersion() {
		return version;
	}

	private final void setVersion(final VersionEntities version) {
		this.version = UtilObject.getDefault(version, VersionEntities.getDefaultObject());
	}

	public final TipoRevisionEntities getTipoRevision() {
		return tipoRevision;
	}

	private final void setTipoRevision(final TipoRevisionEntities tipoRevision) {
		this.tipoRevision = UtilObject.getDefault(tipoRevision, TipoRevisionEntities.getDefaultObject());
	}

	public final LocalDate getFechaSolicitudRevision() {
		return fechaSolicitudRevision;
	}

	private final void setFechaSolicitudRevision(final LocalDate fechaSolicitudRevision) {
		this.fechaSolicitudRevision = UtilDate.getDefault(fechaSolicitudRevision);
	}

	public final LocalDate getFechaLimiteRevision() {
		return fechaLimiteRevision;
	}

	private final void setFechaLimiteRevision(final LocalDate fechaLimiteRevision) {
		this.fechaLimiteRevision = UtilDate.getDefault(fechaLimiteRevision);
	}

	public final LocalDate getFechaCompletitudRevision() {
		return fechaCompletitudRevision;
	}

	private final void setFechaCompletitudRevision(final LocalDate fechaCompletitudRevision) {
		this.fechaCompletitudRevision = UtilDate.getDefault(fechaCompletitudRevision);
	}

	public final EstadoRevisionEntities getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoRevisionEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisionEntities.getDefaultObject());
	}
}