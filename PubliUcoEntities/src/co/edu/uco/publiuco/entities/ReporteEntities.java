package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ReporteEntities {

	private static final ReporteEntities DEFAULT_OBJECT = new ReporteEntities();
	private UUID identificador;
	private LectorEntities lector;
	private ComentarioLectorEntities comentario;
	private TipoReporteEntities tipoReporte;
	private String razon;
	private LocalDate fechaReporte;

	private ReporteEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntities.getDefaultObject());
		setComentario(ComentarioLectorEntities.getDefaultObject());
		setTipoReporte(TipoReporteEntities.getDefaultObject());
		setRazon(UtilText.EMPTY);
		setFechaReporte(UtilDate.DEFAULT_DATE);
	}

	public ReporteEntities(UUID identificador, LectorEntities lector, ComentarioLectorEntities comentario,
			TipoReporteEntities tipoReporte, String razon, LocalDate fechaReporte) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setComentario(comentario);
		setTipoReporte(tipoReporte);
		setRazon(razon);
		setFechaReporte(fechaReporte);
	}

	public static ReporteEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final LectorEntities getLector() {
		return lector;
	}

	private final void setLector(final LectorEntities lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntities.getDefaultObject());
	}

	public final ComentarioLectorEntities getComentario() {
		return comentario;
	}

	private final void setComentario(final ComentarioLectorEntities comentario) {
		this.comentario = UtilObject.getDefault(comentario, ComentarioLectorEntities.getDefaultObject());
	}

	public final TipoReporteEntities getTipoReporte() {
		return tipoReporte;
	}

	private final void setTipoReporte(final TipoReporteEntities tipoReporte) {
		this.tipoReporte = UtilObject.getDefault(tipoReporte, TipoReporteEntities.getDefaultObject());
	}

	public final String getRazon() {
		return razon;
	}

	private final void setRazon(final String razon) {
		this.razon = UtilText.getUtilText().applyTrim(razon);
	}

	public final LocalDate getFechaReporte() {
		return fechaReporte;
	}

	private final void setFechaReporte(final LocalDate fechaReporte) {
		this.fechaReporte = UtilDate.getDefault(fechaReporte);
	}
}
