package ejercicios;

import java.util.Scanner;

public class g1ej3 {

	public static void main(String[] args) {
		int x=0;
		
		System.out.println("ingrese un numero: ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("el doble es: "+ x*2);
		System.out.println("el triple es: "+ x*3);
		sc.close();
	}
}
