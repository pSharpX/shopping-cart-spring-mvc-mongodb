package pe.optical.dto;

import pe.optical.dto.base.DtoBase;

public class MailDto extends DtoBase{
	
	private String codigoAplicacion;
	private String nombreAplicacion;
	private String origenMascara;
	private String asunto;
	private String mensaje;
	private String adjunto;
	private String descripcion;
	private int estado;
	
	public String getCodigoAplicacion() {
		return codigoAplicacion;
	}
	public void setCodigoAplicacion(String codigoAplicacion) {
		this.codigoAplicacion = codigoAplicacion;
	}
	public String getNombreAplicacion() {
		return nombreAplicacion;
	}
	public void setNombreAplicacion(String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}
	public String getOrigenMascara() {
		return origenMascara;
	}
	public void setOrigenMascara(String origenMascara) {
		this.origenMascara = origenMascara;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getAdjunto() {
		return adjunto;
	}
	public void setAdjunto(String adjunto) {
		this.adjunto = adjunto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}	

}
