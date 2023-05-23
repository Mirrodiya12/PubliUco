package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class CategoriaAdministradorCategoriaEntities {
	
	private static final CategoriaAdministradorCategoriaEntities DEFAULT_OBJECT = new CategoriaAdministradorCategoriaEntities();
	private UUID identificador;
	private CategoriaEntities categoria;
	private AdministradorCategoriaEntities administradorCategoria;
	private EstadoCategoriaEntities estado;

	private CategoriaAdministradorCategoriaEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaEntities.getDefaultObject());
		setAdministradorCategoria(AdministradorCategoriaEntities.getDefaultObject());
		setEstado(EstadoCategoriaEntities.getDefaultObject());
	}

	public CategoriaAdministradorCategoriaEntities(UUID identificador, CategoriaEntities categoria,
			AdministradorCategoriaEntities administradorCategoria, EstadoCategoriaEntities estado) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setAdministradorCategoria(administradorCategoria);
		setEstado(estado);
	}
	
	public static CategoriaAdministradorCategoriaEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final CategoriaEntities getCategoria() {
		return categoria;
	}

	private final void setCategoria(CategoriaEntities categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaEntities.getDefaultObject());
	}

	public final AdministradorCategoriaEntities getAdministradorCategoria() {
		return administradorCategoria;
	}

	private final void setAdministradorCategoria(AdministradorCategoriaEntities administradorCategoria) {
		this.administradorCategoria = UtilObject.getDefault(administradorCategoria, AdministradorCategoriaEntities.getDefaultObject());
	}

	public final EstadoCategoriaEntities getEstado() {
		return estado;
	}

	private final void setEstado(EstadoCategoriaEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoCategoriaEntities.getDefaultObject());
	}
}
