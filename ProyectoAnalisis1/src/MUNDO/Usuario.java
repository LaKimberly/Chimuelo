package MUNDO;

public class Usuario {

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Usuario(String cedula, String nombre, String contraseña, String correo, String telefono, String direccion) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.correo = correo;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	private String cedula;
	private String nombre;
	private String contraseña;
	private String correo;
	private String telefono;
	private String direccion;

}
