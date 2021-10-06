package ejercicios;

public class g2ej22 {

	public static void main(String[] args) {

		Circulo c= new Circulo("circulo",3);
		Rectangulo r=new Rectangulo("rectangulo",7,9);
		
		compara(c,r);
	}
	
	public static void compara(Circulo c,Rectangulo r)
	{
		if(c.area() > r.area())
		{
			System.out.println("el circulo tiene mayor area");
		}
		else
		{
			System.out.println("el rectangulo tiene mayor area");
		}
	}

}
