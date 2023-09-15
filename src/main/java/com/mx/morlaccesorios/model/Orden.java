package com.mx.morlaccesorios.model;

import java.util.Date;

public class Orden {

	private Long idOrden;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	private double total;

	public Orden() {
	}

	public Orden(Long idOrden, String numero, Date fechaCreacion, Date fechaRecibida, double total) {
		super();
		this.idOrden = idOrden;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}

	public Long getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(Long idOrden) {
		this.idOrden = idOrden;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaRecibida() {
		return fechaRecibida;
	}

	public void setFechaRecibida(Date fechaRecibida) {
		this.fechaRecibida = fechaRecibida;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Orden [idOrden=" + idOrden + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion
				+ ", fechaRecibida=" + fechaRecibida + ", total=" + total + "]";
	}

}
