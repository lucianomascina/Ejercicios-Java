package ejercicios;

import java.util.Scanner;

public class g1ej11 {
	
	static final int tope=10;
	
	public static void main(String[] args) {
		int i=0,sum=0,cont=0;
		int [] vector=new int [tope]; 
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<tope;i++)
		{
			System.out.println("ingrese un numero: ");
			vector[i]=sc.nextInt();
			
			if(i%2 == 0)
			{
				sum+=vector[i];
				cont++;
			}

		}
		sc.close();
		System.out.println("el promedio es: "+(double)sum/cont);
	}
}
