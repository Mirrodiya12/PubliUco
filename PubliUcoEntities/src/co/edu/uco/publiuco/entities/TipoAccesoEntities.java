package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class TipoAccesoEntities {

	private static final TipoAccesoEntities DEFAULT_OBJECT = new TipoAccesoEntities();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoAccesoEntities estado;

	private TipoAccesoEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoAccesoEntities.getDefaultObject());
	}

	public TipoAccesoEntities(UUID identificador, String nombre, String descripcion, EstadoTipoAccesoEntities estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);

	}

	public static TipoAccesoEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	// Setter y Getter
	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final String getNombre() {
		return nombre;
	}

	private final void setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	}

	public final String getDescripcion() {
		return descripcion;
	}

	private final void setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
	}

	public final EstadoTipoAccesoEntities getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoTipoAccesoEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoAccesoEntities.getDefaultObject());
	}
}
