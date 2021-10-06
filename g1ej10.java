package ejercicios;

import java.util.Scanner;

public class g1ej10 {
	
	static final int tope=10;
	
	public static void main(String[] args) {
		int i=0,sum=0,pos=0,neg=0,sumpos=0,sumneg=0;
		int [] vector=new int [tope]; 
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<tope;i++)
		{
			System.out.println("ingrese un numero: ");
			vector[i]=sc.nextInt();
			sum+=vector[i];
			if(vector[i] > 0)
			{
				pos++;
				sumpos+=vector[i];
			}
			else
			{
				neg++;
				sumneg+=vector[i];
			}
		}
		sc.close();
		System.out.println("el promedio es: "+(double)sum/tope);
		System.out.println("el promedio de positivos es: "+(double)sumpos/pos);
		System.out.println("el promedio de negativos es: "+(double)sumneg/neg);
	}

}
