package co.edu.uco.publiuco.entities;

import java.util.UUID;


import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class TipoRelacionInstitucionEntities {
	
	private static final TipoRelacionInstitucionEntities DEFAULT_OBJECT = new TipoRelacionInstitucionEntities();
	private UUID identificador; 
	private String nombre;
	private String descripcion;
	private EstadoTipoRelacionInstitucionEntities estado;
	
	private TipoRelacionInstitucionEntities() {
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoRelacionInstitucionEntities.getDefaultObject());
	}
	public TipoRelacionInstitucionEntities(final UUID identificador, final String nombre, final String descripcion,
			final EstadoTipoRelacionInstitucionEntities estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	public static TipoRelacionInstitucionEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}
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
	public final EstadoTipoRelacionInstitucionEntities getEstado() {
		return estado;
	}
	private final void setEstado(final EstadoTipoRelacionInstitucionEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoRelacionInstitucionEntities.getDefaultObject());
	}
}
