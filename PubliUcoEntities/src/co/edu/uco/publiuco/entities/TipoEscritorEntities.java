package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class TipoEscritorEntities {
	
	private static final TipoEscritorEntities DEFAULT_OBJECT = new TipoEscritorEntities();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoEscritorEntities estado;
	
	private TipoEscritorEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoEscritorEntities.getDefaultObject());
	}
	
	public TipoEscritorEntities(UUID identificador, String nombre, String descripcion,
			EstadoTipoEscritorEntities estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	public static TipoEscritorEntities getDefaultObject() {
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
	
	public final EstadoTipoEscritorEntities getEstado() {
		return estado;
	}
	
	private final void setEstado(final EstadoTipoEscritorEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoEscritorEntities.getDefaultObject());
	}
}
