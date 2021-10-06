package ejercicios;

import java.util.Scanner;

public class g1ej2 {

	public static void main(String[] args) {
		String nom;
		
		System.out.println("ingrese su nombre: ");
		Scanner sc=new Scanner(System.in);
		nom=sc.nextLine();
		System.out.println("buenos dias "+nom);
		sc.close();
	}

}
