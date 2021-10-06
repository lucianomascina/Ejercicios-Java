package ejercicios;

public class Rectangulo extends Figura implements InterfaceFigura{
	private double altura;
	private double base;
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public Rectangulo(String nombre,double altura,double base)
	{
		super(nombre);
		this.altura=altura;
		this.base=base;
	}

	@Override
	public double area() {
		double area=this.base*this.altura;
		return area;
	}

}
