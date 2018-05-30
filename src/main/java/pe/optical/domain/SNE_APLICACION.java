package pe.optical.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import pe.optical.domain.base.EntityBase;

@Document(collection = "SNE_APLICACIONES")
public class SNE_APLICACION extends EntityBase {
	
	public static final String COLLECTION_NAME = "SNE_APLICACIONES";
	
	public static final String NOMBRE_APLICACION_FIELD = "SNEV_NOMBRE_APLICACION";
	public static final String DESCRIPCION_ERROR_FIELD = "SNEV_DESCRIPCION_ERROR";
	public static final String ESTADO_FIELD = "SNEN_ESTADO";
	public static final String FECHA_REGISTRO_FIELD = "SNED_FECHA_REGISTRO";
		
	private String SNEV_NOMBRE_APLICACION;
	private String SNEV_DESCRIPCION_ERROR;
	private int SNEN_ESTADO;
	private Date SNED_FECHA_REGISTRO;
	
	public String getSNEV_NOMBRE_APLICACION() {
		return SNEV_NOMBRE_APLICACION;
	}
	public void setSNEV_NOMBRE_APLICACION(String sNEV_NOMBRE_APLICACION) {
		SNEV_NOMBRE_APLICACION = sNEV_NOMBRE_APLICACION;
	}
	public String getSNEV_DESCRIPCION_ERROR() {
		return SNEV_DESCRIPCION_ERROR;
	}
	public void setSNEV_DESCRIPCION_ERROR(String sNEV_DESCRIPCION_ERROR) {
		SNEV_DESCRIPCION_ERROR = sNEV_DESCRIPCION_ERROR;
	}
	public int getSNEN_ESTADO() {
		return SNEN_ESTADO;
	}
	public void setSNEN_ESTADO(int sNEN_ESTADO) {
		SNEN_ESTADO = sNEN_ESTADO;
	}
	public Date getSNED_FECHA_REGISTRO() {
		return SNED_FECHA_REGISTRO;
	}
	public void setSNED_FECHA_REGISTRO(Date sNED_FECHA_REGISTRO) {
		SNED_FECHA_REGISTRO = sNED_FECHA_REGISTRO;
	}	
}
