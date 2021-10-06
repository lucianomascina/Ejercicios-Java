package ejercicios;

public class Proveedor extends Persona{
	private String empresa;

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public Proveedor(String apellido,int edad,String direccion,String telefono,String empresa)
	{
		super(apellido,edad,direccion,telefono);
		this.empresa=empresa;
	}

}
