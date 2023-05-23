package co.edu.uco.publiuco.entities;

import java.util.UUID;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class EstadoTipoRelacionInstitucionEntities {
	
	private static final EstadoTipoRelacionInstitucionEntities DEFAULT_OBJECT = new EstadoTipoRelacionInstitucionEntities();
	private UUID identificador;
	private String nombre;
	private String descripcion;
		
	private EstadoTipoRelacionInstitucionEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
	}
	public EstadoTipoRelacionInstitucionEntities(final UUID identificador, final String nombre, final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	public static final EstadoTipoRelacionInstitucionEntities createWithIdentificador(final UUID identificador) {
		return new EstadoTipoRelacionInstitucionEntities(identificador, UtilText.EMPTY, UtilText.EMPTY);
	}
	public static final EstadoTipoRelacionInstitucionEntities createWithNombre(final String nombre) {
		return new EstadoTipoRelacionInstitucionEntities(UtilUUID.DEFAULT_UUID, nombre, UtilText.EMPTY);
	}
	public static final EstadoTipoRelacionInstitucionEntities createWithDescripcion(final String nombre) {
		return new EstadoTipoRelacionInstitucionEntities(UtilUUID.DEFAULT_UUID, nombre, UtilText.EMPTY);
	}
	public static final EstadoTipoRelacionInstitucionEntities getDefaultObject() {
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
}
