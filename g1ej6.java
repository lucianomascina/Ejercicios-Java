package ejercicios;

import java.util.Scanner;

public class g1ej6 {

	public static void main(String[] args) {
		double v1,v2;
		
		System.out.println("ingrese velocidad en km/h: ");
		Scanner sc=new Scanner(System.in);
		v1=sc.nextDouble();
		v2=v1*0.277778;
		System.out.println("en m/s: "+v2);
		sc.close();
	}
}
