package co.edu.uco.publiuco.dto;

import java.time.LocalDate;

import java.util.UUID;
import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PlanCategoriaDTO {
	
	private UUID identificador;
	private CategoriaDTO categoria;
	private double precio;
	private LocalDate fechaDesde;
	private LocalDate fechaHasta;
	private EstadoSuscripcionDTO estado;
	
	public PlanCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaDTO.create());
		setPrecio(UtilNumber.ZERO.intValue());
		setFechaDesde(UtilDate.DEFAULT_DATE);
		setFechaHasta(UtilDate.DEFAULT_DATE);
		setEstado(EstadoSuscripcionDTO.create());
	}
	public PlanCategoriaDTO(UUID identificador, CategoriaDTO categoria, int precio, LocalDate fechaDesde, LocalDate fechaHasta,
			EstadoSuscripcionDTO estado) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaHasta(fechaHasta);
		setEstado(estado);
	}
	public static final PlanCategoriaDTO create() {
		return new PlanCategoriaDTO();
	}
	public final UUID getIdentificador() {
		return identificador;
	}
	public final PlanCategoriaDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final CategoriaDTO getCategoria() {
		return categoria;
	}
	public final PlanCategoriaDTO setCategoria(CategoriaDTO categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
		return this;
	}
	public final double getPrecio() {
		return precio;
	}
	public final PlanCategoriaDTO setPrecio(double precio) {
		this.precio = UtilNumber.getUtilNumber().getDefault(precio).doubleValue();
		return this;
	}
	public final LocalDate getFechaDesde() {
		return fechaDesde;
	}
	public final PlanCategoriaDTO setFechaDesde(LocalDate fechaDesde) {
		this.fechaDesde = UtilDate.getDefault(fechaDesde);
		return this;
	}
	public final LocalDate getFechaHasta() {
		return fechaHasta;
	}
	public final PlanCategoriaDTO setFechaHasta(LocalDate fechaHasta) {
		this.fechaHasta = UtilDate.getDefault(fechaHasta);
		return this;
	}
	public final EstadoSuscripcionDTO getEstado() {
		return estado;
	}
	public final PlanCategoriaDTO setEstado(EstadoSuscripcionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoSuscripcionDTO.create());
		return this;
	}
}
