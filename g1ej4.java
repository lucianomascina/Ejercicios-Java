package ejercicios;

import java.util.Scanner;

public class g1ej4 {

	public static void main(String[] args) {
		double c,f;
		
		System.out.println("ingrese grados centigrados: ");
		Scanner sc=new Scanner(System.in);
		c=sc.nextDouble();
		f=32 + (9 * (c/5));
		System.out.println("en fahrenheit: "+f);
		sc.close();
	}

}
