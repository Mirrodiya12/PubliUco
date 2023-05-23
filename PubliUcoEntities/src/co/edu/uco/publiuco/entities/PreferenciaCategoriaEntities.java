package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PreferenciaCategoriaEntities {
	
	private static final PreferenciaCategoriaEntities DEFAULT_OBJECT = new PreferenciaCategoriaEntities();
	private UUID identificador;
	private PerfilEntities perfil;
	private CategoriaEntities categoria;
	
	private PreferenciaCategoriaEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilEntities.getDefaultObject());
		setCategoria(CategoriaEntities.getDefaultObject());
	}

	public PreferenciaCategoriaEntities(UUID identificador, PerfilEntities perfil, CategoriaEntities categoria) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setCategoria(categoria);
	}
	
	public static PreferenciaCategoriaEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final PerfilEntities getPerfil() {
		return perfil;
	}

	private final void setPerfil(final PerfilEntities perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilEntities.getDefaultObject());
	}

	public final CategoriaEntities getCategoria() {
		return categoria;
	}

	private final void setCategoria(final CategoriaEntities categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaEntities.getDefaultObject());
	}
}
