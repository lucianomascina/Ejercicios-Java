package ejercicios;

import java.util.Scanner;

public class g1ej5 {

	public static void main(String[] args) {
		double r,l,a;
		
		System.out.println("ingrese radio: ");
		Scanner sc=new Scanner(System.in);
		r=sc.nextDouble();
		l=2*3.14*r;
		a= 3.14*(r*r);
		System.out.println("longitud: "+l);
		System.out.println("area: "+a);
		sc.close();
	}
}
