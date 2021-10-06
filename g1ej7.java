package ejercicios;

import java.util.Scanner;

public class g1ej7 {

	public static void main(String[] args) {
		double c1,c2,hip;
		
		System.out.println("ingrese cateto menor: ");
		Scanner sc1=new Scanner(System.in);
		c1= sc1.nextDouble();
		System.out.println("ingrese cateto mayor: ");
		Scanner sc2=new Scanner(System.in);
		c2=sc2.nextDouble();
		hip= Math.sqrt((Math.pow(c1,2))+(Math.pow(c2,2)));
		System.out.println("la hipotenusa es: "+hip);
		sc1.close();
		sc2.close();
	}

}
