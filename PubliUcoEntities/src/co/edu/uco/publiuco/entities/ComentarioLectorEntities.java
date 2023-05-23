package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ComentarioLectorEntities {

	private static final ComentarioLectorEntities DEFAULT_OBJECT = new ComentarioLectorEntities();
	private UUID identificador;
	private LectorEntities lector;
	private PublicacionEntities publicacion;
	private ComentarioLectorEntities comentarioPadre;
	private String comentario;
	private LocalDate fechaCalificacion;
	private EstadoComentarioLectorEntities estado;

	private ComentarioLectorEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntities.getDefaultObject());
		setPublicacion(PublicacionEntities.getDefaultObject());
		setComentarioPadre(ComentarioLectorEntities.getDefaultObject());
		setComentario(UtilText.EMPTY);
		setFechaCalificacion(UtilDate.DEFAULT_DATE);
		setEstado(EstadoComentarioLectorEntities.getDefaultObject());
	}

	public ComentarioLectorEntities(UUID identificador, LectorEntities lector, PublicacionEntities publicacion,
			ComentarioLectorEntities comentarioPadre, String comentario, LocalDate fechaCalificacion,
			EstadoComentarioLectorEntities estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setComentarioPadre(comentarioPadre);
		setComentario(comentario);
		setFechaCalificacion(fechaCalificacion);
		setEstado(estado);
	}

	public static ComentarioLectorEntities getDefaultObject() {
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

	public final ComentarioLectorEntities getComentarioPadre() {
		return comentarioPadre;
	}

	private final void setComentarioPadre(final ComentarioLectorEntities comentarioPadre) {
		this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorEntities.getDefaultObject());
	}

	public final String getComentario() {
		return comentario;
	}

	private final void setComentario(final String comentario) {
		this.comentario = UtilText.getUtilText().applyTrim(comentario);
	}

	public final LocalDate getFechaCalificacion() {
		return fechaCalificacion;
	}

	private final void setFechaCalificacion(final LocalDate fechaCalificacion) {
		this.fechaCalificacion = UtilDate.getDefault(fechaCalificacion);
	}

	public final EstadoComentarioLectorEntities getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoComentarioLectorEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoComentarioLectorEntities.getDefaultObject());
	}
}
