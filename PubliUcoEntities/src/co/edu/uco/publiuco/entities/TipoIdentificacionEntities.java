package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class TipoIdentificacionEntities {
	
	private static final TipoIdentificacionEntities DEFAULT_OBJECT = new TipoIdentificacionEntities();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoIdentificacionEntities estado;
	
	private TipoIdentificacionEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoTipoIdentificacionEntities.getDefaultObject());
	}
	
	public TipoIdentificacionEntities(UUID identificador, String nombre, String descripcion,
			EstadoTipoIdentificacionEntities estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	public static TipoIdentificacionEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	//Setter y Getter
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
	
	public final EstadoTipoIdentificacionEntities getEstado() {
		return estado;
	}
	
	private final void setEstado(final EstadoTipoIdentificacionEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoIdentificacionEntities.getDefaultObject());
	}
}
