package pe.optical.domain;

import java.util.Date;

import com.mongodb.DBRef;

import pe.optical.domain.base.EntityBase;

public class SNE_MAIL_DESTINATARIO extends EntityBase {
	private DBRef SNEI_CODIGO_MAIL;
	private DBRef SNEI_CODIGO_DESTINATARIO;
	private DBRef SNEI_TIPO_ENVIO;
	private int SNEN_ESTADO;
	private Date SNED_FECHA_REGISTRO;
	
	public DBRef getSNEI_CODIGO_MAIL() {
		return SNEI_CODIGO_MAIL;
	}
	public void setSNEI_CODIGO_MAIL(DBRef sNEI_CODIGO_MAIL) {
		SNEI_CODIGO_MAIL = sNEI_CODIGO_MAIL;
	}
	public DBRef getSNEI_CODIGO_DESTINATARIO() {
		return SNEI_CODIGO_DESTINATARIO;
	}
	public void setSNEI_CODIGO_DESTINATARIO(DBRef sNEI_CODIGO_DESTINATARIO) {
		SNEI_CODIGO_DESTINATARIO = sNEI_CODIGO_DESTINATARIO;
	}
	public DBRef getSNEI_TIPO_ENVIO() {
		return SNEI_TIPO_ENVIO;
	}
	public void setSNEI_TIPO_ENVIO(DBRef sNEI_TIPO_ENVIO) {
		SNEI_TIPO_ENVIO = sNEI_TIPO_ENVIO;
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
