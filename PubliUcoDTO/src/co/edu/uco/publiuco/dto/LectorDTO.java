package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class LectorDTO{
	private UUID identificador;
	private TipoIdentificacionDTO tipoIdentifiacion;
	private int numeroIdentificacion;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String correo;
	private String indicadorPaisTelefono;
	private int telefono;
	private TipoRelacionInstitucionDTO relacionInstitucion;
	private RespuestaDTO correoConfirmado;
	private RespuestaDTO telefonoConfirmado;
	private EstadoLectorDTO estado;
	
	public LectorDTO(){
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setTipoIdentifiacion(TipoIdentificacionDTO.create());
		setNumeroIdentificacion(UtilNumber.ZERO.intValue());
		setPrimerNombre(UtilText.EMPTY);
		setSegundoNombre(UtilText.EMPTY);
		setPrimerNombre(UtilText.EMPTY);
		setSegundoApellido(UtilText.EMPTY);
		setCorreo(UtilText.EMPTY);
		setIndicadorPaisTelefono(UtilText.EMPTY);
		setTelefono(UtilNumber.ZERO.intValue());
		setRelacionInstitucion(TipoRelacionInstitucionDTO.create());
		setCorreoConfirmado(RespuestaDTO.create());
		setTelefonoConfirmado(RespuestaDTO.create());
		setEstado(EstadoLectorDTO.create());
	}
	public LectorDTO(UUID identificador, TipoIdentificacionDTO tipoIdentifiacion,
			int numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String indicadorPaisTelefono, int telefono,
			TipoRelacionInstitucionDTO relacionInstitucion, RespuestaDTO correoConfirmado,
			RespuestaDTO telefonoConfirmado, EstadoLectorDTO estado) {
		super();
		setIdentificador(identificador);
		setTipoIdentifiacion(tipoIdentifiacion);
		setNumeroIdentificacion(numeroIdentificacion);
		setPrimerNombre(primerNombre);
		setSegundoNombre(segundoNombre);
		setPrimerNombre(primerNombre);
		setSegundoApellido(segundoApellido);
		setCorreo(correo);
		setIndicadorPaisTelefono(indicadorPaisTelefono);
		setTelefono(telefono);
		setRelacionInstitucion(relacionInstitucion);
		setCorreoConfirmado(correoConfirmado);
		setTelefonoConfirmado(telefonoConfirmado);
		setEstado(estado);
	}
	
	public static final LectorDTO create(){
		return new LectorDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final LectorDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}


	public final TipoIdentificacionDTO getTipoIdentifiacion() {
		return tipoIdentifiacion;
	}


	public final LectorDTO setTipoIdentifiacion(TipoIdentificacionDTO tipoIdentifiacion) {
		this.tipoIdentifiacion = UtilObject.getDefault(tipoIdentifiacion, TipoIdentificacionDTO.create());
		return this;
	}


	public final int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}


	public final LectorDTO setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = UtilNumber.getUtilNumber().getDefault(numeroIdentificacion).intValue();
		return this;
	}


	public final String getPrimerNombre() {
		return primerNombre;
	}


	public final LectorDTO setPrimerNombre(String primerNombre) {
		this.primerNombre = UtilText.getUtilText().applyTrim(primerNombre);
		return this;
	}


	public final String getSegundoNombre() {
		return segundoNombre;
	}


	public final LectorDTO setSegundoNombre(String segundoNombre) {
		this.segundoNombre = UtilText.getUtilText().applyTrim(segundoNombre);
		return this;
	}


	public final String getPrimerApellido() {
		return primerApellido;
	}


	public final LectorDTO setPrimerApellido(String primerApellido) {
		this.primerApellido = UtilText.getUtilText().applyTrim(primerApellido);
		return this;
	}


	public final String getSegundoApellido() {
		return segundoApellido;
	}


	public final LectorDTO setSegundoApellido(String segundoApellido) {
		this.segundoApellido = UtilText.getUtilText().applyTrim(segundoApellido);
		return this;
	}


	public final String getCorreo() {
		return correo;
	}


	public final LectorDTO setCorreo(String correo) {
		this.correo = UtilText.getDefaultStringEmail(correo);
		return this;
	}


	public final String getIndicadorPaisTelefono() {
		return indicadorPaisTelefono;
	}


	public final LectorDTO setIndicadorPaisTelefono(String indicadorPaisTelefono) {
		this.indicadorPaisTelefono = UtilText.getUtilText().applyTrim(indicadorPaisTelefono);
		return this;
	}

	public final int getTelefono() {
		return telefono;
	}

	public final LectorDTO setTelefono(int telefono) {
		this.telefono = UtilNumber.getUtilNumber().getDefault(telefono).intValue();
		return this;
	}

	public final TipoRelacionInstitucionDTO getRelacionInstitucion() {
		return relacionInstitucion;
	}

	public final LectorDTO setRelacionInstitucion(TipoRelacionInstitucionDTO relacionInstitucion) {
		this.relacionInstitucion = UtilObject.getDefault(relacionInstitucion, TipoRelacionInstitucionDTO.create());
		return this;
	}

	public final RespuestaDTO getCorreoConfirmado() {
		return correoConfirmado;
	}

	public final LectorDTO setCorreoConfirmado(RespuestaDTO correoConfirmado) {
		this.correoConfirmado = UtilObject.getDefault(correoConfirmado, RespuestaDTO.create());
		return this;
	}

	public final RespuestaDTO getTelefonoConfirmado() {
		return telefonoConfirmado;
	}

	public final LectorDTO setTelefonoConfirmado(RespuestaDTO telefonoConfirmado) {
		this.telefonoConfirmado = UtilObject.getDefault(telefonoConfirmado, RespuestaDTO.create());
		return this;
	}

	public final EstadoLectorDTO getEstado() {
		return estado;
	}

	public final LectorDTO setEstado(EstadoLectorDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoLectorDTO.create());
		return this;
	}
}
