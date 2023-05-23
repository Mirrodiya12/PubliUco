package co.edu.uco.publiuco.entities;

import java.util.UUID;


import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PerfilEntities {

	private static final PerfilEntities DEFAULT_OBJECT = new PerfilEntities();
	private UUID identificador;
	private LectorEntities lector;
	private RespuestaEntities recomendacionCategoria;
	private RespuestaEntities recomendacionAutor;
	private EstadoLectorEntities estado;

	private PerfilEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntities.getDefaultObject());
		setRecomendacionCategoria(RespuestaEntities.getDefaultObject());
		setRecomendacionAutor(RespuestaEntities.getDefaultObject());
		setEstado(EstadoLectorEntities.getDefaultObject());
	}

	public PerfilEntities(UUID identificador, LectorEntities lector, RespuestaEntities recomendacionCategoria,
			RespuestaEntities recomendacionAutor, EstadoLectorEntities estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setRecomendacionCategoria(recomendacionCategoria);
		setRecomendacionAutor(recomendacionAutor);
		setEstado(estado);
	}

	public static PerfilEntities getDefaultObject() {
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

	public final RespuestaEntities getRecomendacionCategoria() {
		return recomendacionCategoria;
	}

	private final void setRecomendacionCategoria(final RespuestaEntities recomendacionCategoria) {
		this.recomendacionCategoria = UtilObject.getDefault(recomendacionCategoria, RespuestaEntities.getDefaultObject());
	}

	public final RespuestaEntities getRecomendacionAutor() {
		return recomendacionAutor;
	}

	private final void setRecomendacionAutor(final RespuestaEntities recomendacionAutor) {
		this.recomendacionAutor = UtilObject.getDefault(recomendacionAutor, RespuestaEntities.getDefaultObject());
	}

	public final EstadoLectorEntities getEstado() {
		return estado;
	}

	private final void setEstado(EstadoLectorEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoLectorEntities.getDefaultObject());
	}
}
