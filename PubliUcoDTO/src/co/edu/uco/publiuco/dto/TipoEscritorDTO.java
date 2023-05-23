package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class TipoEscritorDTO {
	private static final TipoEscritorDTO DEFAULT_OBJECT = new TipoEscritorDTO();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoEscritorDTO estado;
		
	private TipoEscritorDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoEscritorDTO.create());
	}
	public TipoEscritorDTO(final UUID identificador, final String nombre, final String descripcion, final EstadoTipoEscritorDTO estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	public static final TipoEscritorDTO create() {
		return DEFAULT_OBJECT;
	}
	public final UUID getIdentificador() {
		return identificador;
	}
	public final TipoEscritorDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final TipoEscritorDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final TipoEscritorDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
	public final EstadoTipoEscritorDTO getEstado() {
		return estado;
	}
	public final TipoEscritorDTO setEstado(final EstadoTipoEscritorDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoEscritorDTO.create());
		return this;
	}
}
