package pe.optical.domain;

import java.util.Date;

import pe.optical.domain.base.EntityBase;

public class SNE_DESTINATARIO extends EntityBase {
	
	public static final String COLLECTION_NAME = "SNE_DESTINATARIOS";
	
	public static final String CORREO_ELECTRONICO_FIELD = "SNEV_CORREO_ELECTRONICO";
	public static final String PRIMER_NOMBRE_FIELD = "SNEV_PRIMER_NOMBRE";
	public static final String SEGUNDO_NOMBRE_FIELD = "SNEV_SEGUNDO_NOMBRE";
	public static final String APELLIDO_PATERNO_FIELD = "SNEV_APELLIDO_PATERNO";
	public static final String APELLIDO_MATERNO_FIELD = "SNEV_APELLIDO_MATERNO";
	public static final String ESTADO_FIELD = "SNEN_ESTADO";
	public static final String FECHA_REGISTRO_FIELD = "SNED_FECHA_REGISTRO";
	public static final String FECHA_ACTUALIZACION_FIELD = "SNED_FECHA_ACTUALIZACION";

	private String SNEV_CORREO_ELECTRONICO;
	private String SNEV_PRIMER_NOMBRE;
	private String SNEV_SEGUNDO_NOMBRE;
	private String SNEV_APELLIDO_PATERNO;
	private String SNEV_APELLIDO_MATERNO;
	private int SNEN_ESTADO;
	private Date SNED_FECHA_REGISTRO;
	private Date SNED_FECHA_ACTUALIZACION;
	
	public String getSNEV_CORREO_ELECTRONICO() {
		return SNEV_CORREO_ELECTRONICO;
	}
	public void setSNEV_CORREO_ELECTRONICO(String sNEV_CORREO_ELECTRONICO) {
		SNEV_CORREO_ELECTRONICO = sNEV_CORREO_ELECTRONICO;
	}
	public String getSNEV_PRIMER_NOMBRE() {
		return SNEV_PRIMER_NOMBRE;
	}
	public void setSNEV_PRIMER_NOMBRE(String sNEV_PRIMER_NOMBRE) {
		SNEV_PRIMER_NOMBRE = sNEV_PRIMER_NOMBRE;
	}
	public String getSNEV_SEGUNDO_NOMBRE() {
		return SNEV_SEGUNDO_NOMBRE;
	}
	public void setSNEV_SEGUNDO_NOMBRE(String sNEV_SEGUNDO_NOMBRE) {
		SNEV_SEGUNDO_NOMBRE = sNEV_SEGUNDO_NOMBRE;
	}
	public String getSNEV_APELLIDO_PATERNO() {
		return SNEV_APELLIDO_PATERNO;
	}
	public void setSNEV_APELLIDO_PATERNO(String sNEV_APELLIDO_PATERNO) {
		SNEV_APELLIDO_PATERNO = sNEV_APELLIDO_PATERNO;
	}
	public String getSNEV_APELLIDO_MATERNO() {
		return SNEV_APELLIDO_MATERNO;
	}
	public void setSNEV_APELLIDO_MATERNO(String sNEV_APELLIDO_MATERNO) {
		SNEV_APELLIDO_MATERNO = sNEV_APELLIDO_MATERNO;
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
	public Date getSNED_FECHA_ACTUALIZACION() {
		return SNED_FECHA_ACTUALIZACION;
	}
	public void setSNED_FECHA_ACTUALIZACION(Date sNED_FECHA_ACTUALIZACION) {
		SNED_FECHA_ACTUALIZACION = sNED_FECHA_ACTUALIZACION;
	}
	
}
