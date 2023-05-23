package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;


import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PublicacionEntities {

	private static final PublicacionEntities DEFAULT_OBJECT = new PublicacionEntities();
	private UUID identificador;
	private CategoriaEntities categoria;
	private TipoAccesoEntities tipoAcceso;
	private LocalDate fechaPublicacion;
	private EstadoPublicacionEntities estado;

	private PublicacionEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaEntities.getDefaultObject());
		setTipoAcceso(TipoAccesoEntities.getDefaultObject());
		setFechaPublicacion(UtilDate.DEFAULT_DATE);
		setEstado(EstadoPublicacionEntities.getDefaultObject());
	}

	public PublicacionEntities(UUID identificador, CategoriaEntities categoria, TipoAccesoEntities tipoAcceso,
			LocalDate fechaPublicacion, EstadoPublicacionEntities estado) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setTipoAcceso(tipoAcceso);
		setFechaPublicacion(fechaPublicacion);
		setEstado(estado);
	}

	public static PublicacionEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final CategoriaEntities getCategoria() {
		return categoria;
	}

	private final void setCategoria(final CategoriaEntities categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaEntities.getDefaultObject());
	}

	public final TipoAccesoEntities getTipoAcceso() {
		return tipoAcceso;
	}

	private final void setTipoAcceso(final TipoAccesoEntities tipoAcceso) {
		this.tipoAcceso = UtilObject.getDefault(tipoAcceso, TipoAccesoEntities.getDefaultObject());
	}

	public final LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	private final void setFechaPublicacion(final LocalDate fechaPublicacion) {
		this.fechaPublicacion = UtilDate.getDefault(fechaPublicacion);
	}

	public final EstadoPublicacionEntities getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoPublicacionEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPublicacionEntities.getDefaultObject());
	}

}