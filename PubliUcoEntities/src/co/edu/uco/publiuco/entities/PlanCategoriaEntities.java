package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PlanCategoriaEntities {
	
	private static final PlanCategoriaEntities DEFAULT_OBJECT = new PlanCategoriaEntities();
	private UUID identificador;
	private CategoriaEntities categoria;
	private double precio;
	private LocalDate fechaDesde;
	private LocalDate fechaHasta;
	private EstadoSuscripcionEntities estado;
	
	private PlanCategoriaEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaEntities.getDefaultObject());
		setPrecio(UtilNumber.ZERO.doubleValue());
		setFechaDesde(UtilDate.DEFAULT_DATE);
		setFechaHasta(UtilDate.DEFAULT_DATE);
		setEstado(EstadoSuscripcionEntities.getDefaultObject());
	}

	public PlanCategoriaEntities(UUID identificador, CategoriaEntities categoria, double precio, LocalDate fechaDesde,
			LocalDate fechaHasta, EstadoSuscripcionEntities estado) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaHasta(fechaHasta);
		setEstado(estado);
	}
	public static PlanCategoriaEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final CategoriaEntities getCategoria() {
		return categoria;
	}

	private final void setCategoria(final CategoriaEntities categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaEntities.getDefaultObject());
	}

	public final double getPrecio() {
		return precio;
	}

	private final void setPrecio(final double precio) {
		this.precio = UtilNumber.getUtilNumber().getDefault(precio).doubleValue();
	}

	public final LocalDate getFechaDesde() {
		return fechaDesde;
	}

	private final void setFechaDesde(final LocalDate fechaDesde) {
		this.fechaDesde = UtilDate.getDefault(fechaDesde);
	}

	public final LocalDate getFechaHasta() {
		return fechaHasta;
	}

	private final void setFechaHasta(final LocalDate fechaHasta) {
		this.fechaHasta = UtilDate.getDefault(fechaHasta);
	}
	
	public final EstadoSuscripcionEntities getEstado() {
		return estado;
	}

	private final void setEstado(EstadoSuscripcionEntities estado) {
		this.estado = UtilObject.getDefault(estado, EstadoSuscripcionEntities.getDefaultObject());
	}
}
