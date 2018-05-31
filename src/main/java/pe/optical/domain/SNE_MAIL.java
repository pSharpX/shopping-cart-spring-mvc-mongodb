package pe.optical.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.DBRef;

import pe.optical.domain.base.EntityBase;

@Document(collection = "SNE_MAIL")
public class SNE_MAIL extends EntityBase {
	private DBRef SNEI_CODIGO_APLICACION;
	private String SNEV_MAIL_ORIGEN_MASCARA;
	private String SNEV_ASUNTO;
	private String SNEV_MENSAJE;
	private String SNEV_ADJUNTO;
	private String SNEV_DESCRIPCION;
	private int SNEN_ESTADO;
	private Date SNED_FECHA_REGISTRO;
	
	public DBRef getSNEI_CODIGO_APLICACION() {
		return SNEI_CODIGO_APLICACION;
	}
	public void setSNEI_CODIGO_APLICACION(DBRef sNEI_CODIGO_APLICACION) {
		SNEI_CODIGO_APLICACION = sNEI_CODIGO_APLICACION;
	}
	public String getSNEV_MAIL_ORIGEN_MASCARA() {
		return SNEV_MAIL_ORIGEN_MASCARA;
	}
	public void setSNEV_MAIL_ORIGEN_MASCARA(String sNEV_MAIL_ORIGEN_MASCARA) {
		SNEV_MAIL_ORIGEN_MASCARA = sNEV_MAIL_ORIGEN_MASCARA;
	}
	public String getSNEV_ASUNTO() {
		return SNEV_ASUNTO;
	}
	public void setSNEV_ASUNTO(String sNEV_ASUNTO) {
		SNEV_ASUNTO = sNEV_ASUNTO;
	}
	public String getSNEV_MENSAJE() {
		return SNEV_MENSAJE;
	}
	public void setSNEV_MENSAJE(String sNEV_MENSAJE) {
		SNEV_MENSAJE = sNEV_MENSAJE;
	}
	public String getSNEV_ADJUNTO() {
		return SNEV_ADJUNTO;
	}
	public void setSNEV_ADJUNTO(String sNEV_ADJUNTO) {
		SNEV_ADJUNTO = sNEV_ADJUNTO;
	}
	public String getSNEV_DESCRIPCION() {
		return SNEV_DESCRIPCION;
	}
	public void setSNEV_DESCRIPCION(String sNEV_DESCRIPCION) {
		SNEV_DESCRIPCION = sNEV_DESCRIPCION;
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
