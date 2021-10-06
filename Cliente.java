package ejercicios;

public class Cliente extends Persona{
	private String dni;

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Cliente(String apellido,int edad,String direccion,String telefono,String dni)
	{
		super(apellido,edad,direccion,telefono);
		this.dni=dni;
	}

}
