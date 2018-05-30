package pe.optical.domain;

import java.util.Date;

import pe.optical.domain.base.EntityBase;

public class SNE_TIPO_ENVIO extends EntityBase {
	
	private String SNEV_TIPO;
	private String SNEV_DESCRIPCION;
	private int SNEN_ESTADO;
	private Date SNED_FECHA_REGISTRO;
	
	public String getSNEV_TIPO() {
		return SNEV_TIPO;
	}
	public void setSNEV_TIPO(String sNEV_TIPO) {
		SNEV_TIPO = sNEV_TIPO;
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
