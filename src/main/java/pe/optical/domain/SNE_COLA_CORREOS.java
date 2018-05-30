package pe.optical.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.DBRef;

import pe.optical.domain.base.EntityBase;

@Document(collection = "SNE_COLA_CORREOS")
public class SNE_COLA_CORREOS extends EntityBase {
	
	public static final String COLLECTION_NAME = "SNE_COLA_CORREOS";
	
	public static final String CODIGO_MAIL_FIELD = "SNEI_CODIGO_MAIL";
	public static final String ASUNTO_FIELD = "SNEV_ASUNTO";
	public static final String MENSAJE_FIELD = "SNEV_MENSAJE";
	public static final String ADJUNTO_FIELD = "SNEV_ADJUNTO";
	
	public static final String CODIGO_ESTADO_ENVIO_FIELD = "SNEI_CODIGO_ESTADO_ENVIO";
	public static final String ES_ERROR_FIELD = "SNEI_ES_ERROR";
	public static final String ESTADO_FIELD = "SNEN_ESTADO";
	public static final String DEFAULT_FIELD = "SNEN_DEFAULT";
	public static final String CODIGO_LOG_ERROR_FIELD = "SNEI_CODIGO_LOG_ERROR";
	public static final String RESPUESTA_FIELD = "SNEV_RESPUESTA";
	public static final String FECHA_REGISTRO_FIELD = "SNED_FECHA_REGISTRO";
	public static final String FECHA_ACTUALIZACION_FIELD = "SNED_FECHA_ACTUALIZACION";
		
	private DBRef SNEI_CODIGO_MAIL;
	private String SNEV_ASUNTO;
	private String SNEV_MENSAJE;
	private String SNEV_ADJUNTO;
	private String SNEI_CODIGO_ESTADO_ENVIO;
	private int SNEI_ES_ERROR;
	private int SNEN_ESTADO;
	private int SNEN_DEFAULT;
	private DBRef SNEI_CODIGO_LOG_ERROR;
	private String SNEV_RESPUESTA;
	private Date SNED_FECHA_REGISTRO;
	private Date SNED_FECHA_ACTUALIZACION;
	
	public DBRef getSNEI_CODIGO_MAIL() {
		return SNEI_CODIGO_MAIL;
	}
	public void setSNEI_CODIGO_MAIL(DBRef sNEI_CODIGO_MAIL) {
		SNEI_CODIGO_MAIL = sNEI_CODIGO_MAIL;
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
	public String getSNEI_CODIGO_ESTADO_ENVIO() {
		return SNEI_CODIGO_ESTADO_ENVIO;
	}
	public void setSNEI_CODIGO_ESTADO_ENVIO(String sNEI_CODIGO_ESTADO_ENVIO) {
		SNEI_CODIGO_ESTADO_ENVIO = sNEI_CODIGO_ESTADO_ENVIO;
	}
	public int getSNEI_ES_ERROR() {
		return SNEI_ES_ERROR;
	}
	public void setSNEI_ES_ERROR(int sNEI_ES_ERROR) {
		SNEI_ES_ERROR = sNEI_ES_ERROR;
	}
	public int getSNEN_ESTADO() {
		return SNEN_ESTADO;
	}
	public void setSNEN_ESTADO(int sNEN_ESTADO) {
		SNEN_ESTADO = sNEN_ESTADO;
	}
	public int getSNEN_DEFAULT() {
		return SNEN_DEFAULT;
	}
	public void setSNEN_DEFAULT(int sNEN_DEFAULT) {
		SNEN_DEFAULT = sNEN_DEFAULT;
	}
	public DBRef getSNEI_CODIGO_LOG_ERROR() {
		return SNEI_CODIGO_LOG_ERROR;
	}
	public void setSNEI_CODIGO_LOG_ERROR(DBRef sNEI_CODIGO_LOG_ERROR) {
		SNEI_CODIGO_LOG_ERROR = sNEI_CODIGO_LOG_ERROR;
	}
	public String getSNEV_RESPUESTA() {
		return SNEV_RESPUESTA;
	}
	public void setSNEV_RESPUESTA(String sNEV_RESPUESTA) {
		SNEV_RESPUESTA = sNEV_RESPUESTA;
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
