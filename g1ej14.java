package ejercicios;

import java.util.Scanner;

public class g1ej14 {

	static final int tope=10;
	
	public static void main(String[] args) {
		
		int i,contcero=0,contneg=0,contpos=0;
		int[] vector=new int[10];
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<tope;i++)
		{
			System.out.println("ingrese un numero: ");
			vector[i]=sc.nextInt();
			
			if(vector[i] > 0)
			{
				contpos++;
			}
			else 
			{
				if(vector[i] == 0)
				{
					contcero++;
				}
				if(vector[i] < 0)
				{
					contneg++;
				}
			}
		}
		System.out.println("numeros positivos: "+contpos);
		System.out.println("numeros cero: "+contcero);
		System.out.println("numeros negativos: "+contneg);
	}

}
