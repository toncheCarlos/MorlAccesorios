package com.mx.morlaccesorios.model;

public class Usuario {

	private Long idUsuario;
	private String nombre;
	private String nombreUsuario;
	private String email;
	private String direccion;
	private String telefono;
	private String tipo;
	private String password;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Usuario(Long idUsuario, String nombre, String nombreUsuario, String email, String direccion, String telefono,
			String tipo, String password) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
		this.password = password;
	}

	public Usuario() {
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", nombreUsuario=" + nombreUsuario
				+ ", email=" + email + ", direccion=" + direccion + ", telefono=" + telefono + ", tipo=" + tipo
				+ ", password=" + password + "]";
	}

}
