package ejercicios;

import java.util.Scanner;

public class g1ej15 {

	static final int tope=5;
	
	public static void main(String[] args) {
		int i=0,sum=0,contmen=0,contmay=0;
		double prom=0;
		double [] vector=new double [tope]; 
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<tope;i++)
		{
			System.out.println("ingrese altura: ");
			vector[i]=sc.nextDouble();
			sum+=vector[i];
		}
		sc.close();
		prom=(double)sum/tope;
		for(i=0;i<tope;i++)
		{
			if(vector[i] > prom)
			{
				contmay++;
			}
			else
			{
				contmen++;
			}
		}
		System.out.println("el promedio es: "+prom);
		System.out.println("catidad de mayores al promedio: "+contmay);
		System.out.println("catidad de menores al promedio: "+contmen);
	}

}
