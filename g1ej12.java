package ejercicios;

import java.util.Scanner;

public class g1ej12 {
	
	static final int tope=10;
	
	public static void main(String[] args) {
		int i=0,sum=0;
		double prom=0;
		int [] vector=new int [tope]; 
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<tope;i++)
		{
			System.out.println("ingrese nota del alumno: ");
			vector[i]=sc.nextInt();
			sum+=vector[i];
		}
		sc.close();
		prom=(double)sum/tope;
		System.out.println("el promedio es: "+prom);
		System.out.println("notas superiores al promedio: ");
		for(i=0;i<tope;i++)
		{
			if(vector[i] > prom)
			{
				System.out.println("\n"+vector[i]);
			}
		}
	}

}
