package com.mx.morlaccesorios.model;

public class OrdenDetalle {

	private Long idDetalle;
	private String nombre;
	private int cantidad;
	private double precio;
	private double total;

	public OrdenDetalle() {
		// TODO Auto-generated constructor stub
	}

	public OrdenDetalle(Long idDetalle, String nombre, int cantidad, double precio, double total) {
		super();
		this.idDetalle = idDetalle;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}

	public Long getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Long idDetalle) {
		this.idDetalle = idDetalle;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "OrdenDetalle [idDetalle=" + idDetalle + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio="
				+ precio + ", total=" + total + "]";
	}

}
