package co.edu.uco.publiuco.business.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntities;

public final class EstadoTipoRelacionInstitucionDomain {

	private static final EstadoTipoRelacionInstitucionDomain DEFAULT_OBJECT = new EstadoTipoRelacionInstitucionDomain();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	private EstadoTipoRelacionInstitucionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
	}
	
	
	public EstadoTipoRelacionInstitucionDomain(final UUID identificador,final String nombre,final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	
	public static final EstadoTipoRelacionInstitucionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public static EstadoTipoRelacionInstitucionDomain create() {
		return new EstadoTipoRelacionInstitucionDomain();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final EstadoTipoRelacionInstitucionDomain setIdentificador(final UUID identificador) {
		this.identificador = identificador;
		
		return this;
	}
	
	public final String getNombre() {
		return nombre;
	}
	
	public final EstadoTipoRelacionInstitucionDomain setNombre(final String nombre) {
		
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		
		return this;
	}
	
	
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final EstadoTipoRelacionInstitucionDomain setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		
		return this;
	}
	
	
	
	
}
