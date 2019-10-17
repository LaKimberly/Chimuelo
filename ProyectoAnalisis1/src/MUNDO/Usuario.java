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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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

	public Usuario(String cedula, String nombre, String contrase�a, String correo, String telefono, String direccion) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.contrase�a = contrase�a;
		this.correo = correo;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	private String cedula;
	private String nombre;
	private String contrase�a;
	private String correo;
	private String telefono;
	private String direccion;

}
