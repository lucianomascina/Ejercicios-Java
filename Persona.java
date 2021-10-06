package ejercicios;

public class Persona implements IPersona{
	private String apellido;
	private int edad;
	private String direccion;
	private String telefono;
	private String nombre;
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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
	
	public Persona(String apellido,int edad,String direccion,String telefono)
	{
		this.apellido=apellido;
		this.edad=edad;
		this.direccion=direccion;
		this.telefono=telefono;
	}
	
	public Persona(String apellido,int edad,String nombre)
	{
		this.apellido=apellido;
		this.edad=edad;
		this.nombre=nombre;
	}

	@Override
	public void comparar(Persona p1,Persona p2) {
		if(p1.edad > p2.edad)
			System.out.println("el primero es mayor");
		else
			System.out.println("el segundo es mayor");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString()
	{
		return this.getApellido();
	}
	
	public boolean equals(Persona p)
	{
		if(p.getApellido().equals(this.getApellido())&&p.getNombre().equals(this.getNombre()))
			return true;
		else
			return false;		
	}
	
}
