package co.edu.uco.publiuco.dto;

import java.util.UUID;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class EscritorDTO {
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
	private EstadoEscritorDTO estado;
	
	public EscritorDTO(){
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
		setEstado(EstadoEscritorDTO.create());
	}
	public EscritorDTO(UUID identificador, TipoIdentificacionDTO tipoIdentifiacion,
			int numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String indicadorPaisTelefono, int telefono,
			TipoRelacionInstitucionDTO relacionInstitucion, RespuestaDTO correoConfirmado,
			RespuestaDTO telefonoConfirmado, EstadoEscritorDTO estado) {
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
	public static final EscritorDTO create(){
		return new EscritorDTO();
	}
	public final UUID getIdentificador() {
		return identificador;
	}
	public final EscritorDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final TipoIdentificacionDTO getTipoIdentifiacion() {
		return tipoIdentifiacion;
	}
	public final EscritorDTO setTipoIdentifiacion(TipoIdentificacionDTO tipoIdentifiacion) {
		this.tipoIdentifiacion = UtilObject.getDefault(tipoIdentifiacion, TipoIdentificacionDTO.create());
		return this;
	}
	public final int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public final EscritorDTO setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = UtilNumber.getUtilNumber().getDefault(numeroIdentificacion).intValue();
		return this;
	}
	public final String getPrimerNombre() {
		return primerNombre;
	}
	public final EscritorDTO setPrimerNombre(String primerNombre) {
		this.primerNombre = UtilText.getUtilText().applyTrim(primerNombre);
		return this;
	}
	public final String getSegundoNombre() {
		return segundoNombre;
	}
	public final EscritorDTO setSegundoNombre(String segundoNombre) {
		this.segundoNombre = UtilText.getUtilText().applyTrim(segundoNombre);
		return this;
	}
	public final String getPrimerApellido() {
		return primerApellido;
	}
	public final EscritorDTO setPrimerApellido(String primerApellido) {
		this.primerApellido = UtilText.getUtilText().applyTrim(primerApellido);
		return this;
	}
	public final String getSegundoApellido() {
		return segundoApellido;
	}
	public final EscritorDTO setSegundoApellido(String segundoApellido) {
		this.segundoApellido = UtilText.getUtilText().applyTrim(segundoApellido);
		return this;
	}
	public final String getCorreo() {
		return correo;
	}
	public final EscritorDTO setCorreo(String correo) {
		this.correo = UtilText.getDefaultStringEmail(correo);
		return this;
	}
	public final String getIndicadorPaisTelefono() {
		return indicadorPaisTelefono;
	}
	public final EscritorDTO setIndicadorPaisTelefono(String indicadorPaisTelefono) {
		this.indicadorPaisTelefono = UtilText.getUtilText().applyTrim(indicadorPaisTelefono);
		return this;
	}
	public final int getTelefono() {
		return telefono;
	}
	public final EscritorDTO setTelefono(int telefono) {
		this.telefono = UtilNumber.getUtilNumber().getDefault(telefono).intValue();;
		return this;
	}
	public final TipoRelacionInstitucionDTO getRelacionInstitucion() {
		return relacionInstitucion;
	}
	public final EscritorDTO setRelacionInstitucion(TipoRelacionInstitucionDTO relacionInstitucion) {
		this.relacionInstitucion = UtilObject.getDefault(relacionInstitucion, TipoRelacionInstitucionDTO.create());
		return this;
	}
	public final RespuestaDTO getCorreoConfirmado() {
		return correoConfirmado;
	}
	public final EscritorDTO setCorreoConfirmado(RespuestaDTO correoConfirmado) {
		this.correoConfirmado = UtilObject.getDefault(correoConfirmado, RespuestaDTO.create());
		return this;
	}
	public final RespuestaDTO getTelefonoConfirmado() {
		return telefonoConfirmado;
	}
	public final EscritorDTO setTelefonoConfirmado(RespuestaDTO telefonoConfirmado) {
		this.telefonoConfirmado = UtilObject.getDefault(telefonoConfirmado, RespuestaDTO.create());
		return this;
	}
	public final EstadoEscritorDTO getEstado() {
		return estado;
	}
	public final EscritorDTO setEstado(EstadoEscritorDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoEscritorDTO.create());
		return this;
	}
}
