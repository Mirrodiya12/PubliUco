package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class VersionEntities {

	private static final VersionEntities DEFAULT_OBJECT = new VersionEntities();
	private UUID identificador;
	private PublicacionEntities publicacion;
	private VersionEntities versionAnterior;
	private byte numeroVersion;
	private LocalDate fechaCreacion;
	private LocalDate fechaUltimaModificacion;
	private String titulo;
	private String resumen;
	private String cuerpo;
	private EstadoPublicacionEntities estado;

	private VersionEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionEntities.getDefaultObject());
		setVersionAnterior(VersionEntities.getDefaultObject());
		setNumeroVersion(UtilNumber.ZERO.byteValue());
		setFechaCreacion(UtilDate.DEFAULT_DATE);
		setFechaUltimaModificacion(UtilDate.DEFAULT_DATE);
		setTitulo(UtilText.EMPTY);
		setResumen(UtilText.EMPTY);
		setCuerpo(UtilText.EMPTY);
		setEstado(EstadoPublicacionEntities.getDefaultObject());
	}

	public VersionEntities(UUID identificador, PublicacionEntities publicacion, VersionEntities versionAnterior,
			byte numeroVersion, LocalDate fechaCreacion, LocalDate fechaUltimaModificacion, String titulo,
			String resumen, String cuerpo, EstadoPublicacionEntities estado) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setVersionAnterior(versionAnterior);
		setNumeroVersion(numeroVersion);
		setFechaCreacion(fechaCreacion);
		setFechaUltimaModificacion(fechaUltimaModificacion);
		setTitulo(titulo);
		setResumen(resumen);
		setCuerpo(cuerpo);
		setEstado(estado);
	}

	public static VersionEntities getDefaultObject() {
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

	public final VersionEntities getVersionAnterior() {
		return versionAnterior;
	}

	private final void setVersionAnterior(final VersionEntities versionAnterior) {
		this.versionAnterior = UtilObject.getDefault(versionAnterior, VersionEntities.getDefaultObject());
	}

	public final byte getNumeroVersion() {
		return numeroVersion;
	}

	private final void setNumeroVersion(final byte numeroVersion) {
		this.numeroVersion = UtilNumber.getUtilNumber().getDefault(numeroVersion).byteValue();
	}

	public final LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	private final void setFechaCreacion(final LocalDate fechaCreacion) {
		this.fechaCreacion = UtilDate.getDefault(fechaCreacion);
	}

	public final LocalDate getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}

	private final void setFechaUltimaModificacion(final LocalDate fechaUltimaModificacion) {
		this.fechaUltimaModificacion = UtilDate.getDefault(fechaUltimaModificacion);
	}

	public final String getTitulo() {
		return titulo;
	}

	private final void setTitulo(final String titulo) {
		this.titulo = UtilText.getUtilText().applyTrim(titulo);
	}

	public final String getResumen() {
		return resumen;
	}

	private final void setResumen(final String resumen) {
		this.resumen = UtilText.getUtilText().applyTrim(resumen);
	}

	public final String getCuerpo() {
		return cuerpo;
	}

	private final void setCuerpo(final String cuerpo) {
		this.cuerpo = UtilText.getUtilText().applyTrim(cuerpo);
	}

	public final EstadoPublicacionEntities getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoPublicacionEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPublicacionEntities.getDefaultObject());
	}

}
