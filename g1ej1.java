package ejercicios;

import java.util.Scanner;

public class g1ej1 {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		
		System.out.println("ingrese un numero: ");
		Scanner sc1=new Scanner(System.in);
		num1=sc1.nextInt();
		System.out.println("ingrese un numero: ");
		Scanner sc2=new Scanner(System.in);
		num2=sc2.nextInt();
		System.out.println("numero 1: "+num1+" numero 2: "+num2);
		sc1.close();
		sc2.close();
	}

}
