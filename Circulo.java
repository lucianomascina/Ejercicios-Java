package ejercicios;

public class Circulo extends Figura implements InterfaceFigura {
	private double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circulo(String nombre,double radio)
	{
		super(nombre);
		this.radio=radio;
	}

	@Override
	public double area() {
		double area=2*3.14*(this.radio*this.radio);
		return area;
	}

}
