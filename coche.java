package ejercicios;

public class coche implements Comparable<coche> {
	private int kilometros;
	private String marca;
	private int modelo;

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	public coche(int kilometros,String marca,int modelo)
	{
		this.kilometros=kilometros;
		this.marca=marca;
		this.modelo=modelo;
	}
	
	@Override
	public String toString()
	{
		return "marca: "+this.marca+"\nmodelo: "+this.modelo+"\nkilometros: "+this.kilometros;
	}

	@Override
	public int compareTo(coche c) {
		if(kilometros>c.kilometros)
			return 1;
		if(kilometros<c.kilometros)
			return -1;
		return 0;
		
	}
}
