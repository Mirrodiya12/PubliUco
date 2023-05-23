package co.edu.uco.publiuco.entities;

import java.util.UUID;


import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class EscritorEntities {
	
	private static final EscritorEntities DEFAULT_OBJECT = new EscritorEntities();
	private UUID identificador;
	private TipoIdentificacionEntities tipoIdentificacion;
	private int numeroIdentificacion;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String correo;
	private String indicadorPaisTelefono;
	private int telefono;
	private TipoRelacionInstitucionEntities relacionInstitucion;
	private RespuestaEntities correoConfirmado;
	private RespuestaEntities telefonoConfirmado;
	private EstadoEscritorEntities estado;
	
	private EscritorEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setTipoIdentificacion(TipoIdentificacionEntities.getDefaultObject());
		setNumeroIdentificacion(UtilNumber.ZERO.intValue());
		setPrimerNombre(UtilText.EMPTY);
		setSegundoNombre(UtilText.EMPTY);
		setPrimerApellido(UtilText.EMPTY);
		setSegundoApellido(UtilText.EMPTY);
		setCorreo(UtilText.EMPTY);
		setIndicadorPaisTelefono(UtilText.EMPTY);
		setTelefono(UtilNumber.ZERO.intValue());
		setRelacionInstitucion(TipoRelacionInstitucionEntities.getDefaultObject());
		setCorreoConfirmado(RespuestaEntities.getDefaultObject());
		setTelefonoConfirmado(RespuestaEntities.getDefaultObject());
		setEstado(EstadoEscritorEntities.getDefaultObject());
	}
	
	public EscritorEntities(UUID identificador, TipoIdentificacionEntities tipoIdentificacion,
			int numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String indicadorPaisTelefono, int telefono,
			TipoRelacionInstitucionEntities relacionInstitucion, RespuestaEntities correoConfirmado, RespuestaEntities telefonoConfirmado,
			EstadoEscritorEntities estado) {
		super();
		setIdentificador(identificador);
		setTipoIdentificacion(tipoIdentificacion);
		setNumeroIdentificacion(numeroIdentificacion);
		setPrimerNombre(primerNombre);
		setSegundoNombre(segundoNombre);
		setPrimerApellido(primerApellido);
		setSegundoApellido(segundoApellido);
		setCorreo(correo);
		setIndicadorPaisTelefono(indicadorPaisTelefono);
		setTelefono(telefono);
		setRelacionInstitucion(relacionInstitucion);
		setCorreoConfirmado(correoConfirmado);
		setTelefonoConfirmado(telefonoConfirmado);
		setEstado(estado);
	}
	
	public static EscritorEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final TipoIdentificacionEntities getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	private final void setTipoIdentificacion(final TipoIdentificacionEntities tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionEntities.getDefaultObject());
	}

	public final int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	private final void setNumeroIdentificacion(final int numeroIdentificacion) {
		this.numeroIdentificacion = UtilNumber.getUtilNumber().getDefault(numeroIdentificacion).intValue();
	}

	public final String getPrimerNombre() {
		return primerNombre;
	}

	private final void setPrimerNombre(final String primerNombre) {
		this.primerNombre = UtilText.getUtilText().applyTrim(primerNombre);
	}

	public final String getSegundoNombre() {
		return segundoNombre;
	}

	private final void setSegundoNombre(final String segundoNombre) {
		this.segundoNombre = UtilText.getUtilText().applyTrim(segundoNombre);
	}

	public final String getPrimerApellido() {
		return primerApellido;
	}

	private final void setPrimerApellido(final String primerApellido) {
		this.primerApellido = UtilText.getUtilText().applyTrim(primerApellido);
	}

	public final String getSegundoApellido() {
		return segundoApellido;
	}

	private final void setSegundoApellido(final String segundoApellido) {
		this.segundoApellido = UtilText.getUtilText().applyTrim(segundoApellido);
	}

	public final String getCorreo() {
		return correo;
	}

	private final void setCorreo(final String correo) {
		this.correo = UtilText.getDefaultStringEmail(correo);
	}

	public final String getIndicadorPaisTelefono() {
		return indicadorPaisTelefono;
	}

	private final void setIndicadorPaisTelefono(final String indicadorPaisTelefono) {
		this.indicadorPaisTelefono = UtilText.getUtilText().applyTrim(indicadorPaisTelefono);
	}

	public final int getTelefono() {
		return telefono;
	}

	private final void setTelefono(final int telefono) {
		this.telefono = UtilNumber.getUtilNumber().getDefault(telefono).intValue();
	}

	public final TipoRelacionInstitucionEntities getTipoRelacion() {
		return relacionInstitucion;
	}

	private final void setRelacionInstitucion(final TipoRelacionInstitucionEntities relacionInstitucion) {
		this.relacionInstitucion = UtilObject.getDefault(relacionInstitucion, TipoRelacionInstitucionEntities.getDefaultObject());
	}

	public final RespuestaEntities getCorreoConfirmado() {
		return correoConfirmado;
	}

	private final void setCorreoConfirmado(final RespuestaEntities correoConfirmado) {
		this.correoConfirmado = UtilObject.getDefault(correoConfirmado, RespuestaEntities.getDefaultObject());
	}

	public final RespuestaEntities getTelefonoConfirmado() {
		return telefonoConfirmado;
	}

	private final void setTelefonoConfirmado(final RespuestaEntities telefonoConfirmado) {
		this.telefonoConfirmado = UtilObject.getDefault(telefonoConfirmado, RespuestaEntities.getDefaultObject());
	}

	public final EstadoEscritorEntities getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoEscritorEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoEscritorEntities.getDefaultObject());
	}
}