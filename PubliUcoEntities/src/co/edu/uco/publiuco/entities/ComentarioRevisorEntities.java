package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ComentarioRevisorEntities {
	
	private static final ComentarioRevisorEntities DEFAULT_OBJECT = new ComentarioRevisorEntities();
	private UUID identificador;
	private RevisorRevisionEntities revisorRevision;
	private TipoComentarioRevisorEntities tipoComentarioRevisor;
	private String comentario;
	
	private ComentarioRevisorEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setRevisorRevision(RevisorRevisionEntities.getDefaultObject());
		setTipoComentarioRevisor(TipoComentarioRevisorEntities.getDefaultObject());
		setComentario(UtilText.EMPTY);
	}

	public ComentarioRevisorEntities(UUID identificador, RevisorRevisionEntities revisorRevision,
			TipoComentarioRevisorEntities tipoComentarioRevisor, String comentario) {
		super();
		setIdentificador(identificador);
		setRevisorRevision(revisorRevision);
		setTipoComentarioRevisor(tipoComentarioRevisor);
		setComentario(comentario);
	}
	
	public static ComentarioRevisorEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final RevisorRevisionEntities getRevisorRevision() {
		return revisorRevision;
	}

	private final void setRevisorRevision(RevisorRevisionEntities revisorRevision) {
		this.revisorRevision = UtilObject.getDefault(revisorRevision, RevisorRevisionEntities.getDefaultObject());
	}

	public final TipoComentarioRevisorEntities getTipoComentarioRevisor() {
		return tipoComentarioRevisor;
	}

	private final void setTipoComentarioRevisor(TipoComentarioRevisorEntities tipoComentarioRevisor) {
		this.tipoComentarioRevisor = UtilObject.getDefault(tipoComentarioRevisor, TipoComentarioRevisorEntities.getDefaultObject());
	}

	public final String getComentario() {
		return comentario;
	}

	private final void setComentario(String comentario) {
		this.comentario = UtilText.getUtilText().applyTrim(comentario);
	}
}
