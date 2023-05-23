package co.edu.uco.publiuco.entities;

import java.util.UUID;


import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class CategoriaEntities {
	
	private static final CategoriaEntities DEFAULT_OBJECT = new CategoriaEntities();
	private UUID identificador;
	private CategoriaEntities categoriaPadre;
	private String nombre;
	private String descripcion;
	private EstadoCategoriaEntities estadoCategoria;
	private EstadoPreferenciaEntities estadoPreferencia;

	private CategoriaEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoriaPadre(CategoriaEntities.getDefaultObject());
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
		setEstadoCategoria(EstadoCategoriaEntities.getDefaultObject());
		setEstadoPreferencia(EstadoPreferenciaEntities.getDefaultObject());
	}

	public CategoriaEntities(UUID identificador, CategoriaEntities categoriaPadre, String nombre, String descripcion,
			EstadoCategoriaEntities estadoCategoria, EstadoPreferenciaEntities estadoPreferencia) {
		super();
		setIdentificador(identificador);
		setCategoriaPadre(categoriaPadre);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstadoCategoria(estadoCategoria);
		setEstadoPreferencia(estadoPreferencia);
	}
	
	public static CategoriaEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final CategoriaEntities getCategoriaPadre() {
		return categoriaPadre;
	}

	private final void setCategoriaPadre(CategoriaEntities categoriaPadre) {
		this.categoriaPadre = UtilObject.getDefault(categoriaPadre, CategoriaEntities.getDefaultObject());
	}

	public final String getNombre() {
		return nombre;
	}

	private final void setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	}

	public final String getDescripcion() {
		return descripcion;
	}

	private final void setDescripcion(String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
	}
	public final EstadoPreferenciaEntities getEstadoPreferencia() {
		return estadoPreferencia;
	}

	private final void setEstadoPreferencia(EstadoPreferenciaEntities estadoPreferencia) {
		this.estadoPreferencia = UtilObject.getDefault(estadoPreferencia, EstadoPreferenciaEntities.getDefaultObject());
	}
	public final EstadoCategoriaEntities getEstadoCategoria() {
		return estadoCategoria;
	}

	private final void setEstadoCategoria(EstadoCategoriaEntities estadoCategoria) {
		this.estadoCategoria = UtilObject.getDefault(estadoCategoria, EstadoCategoriaEntities.getDefaultObject());
	}
}
