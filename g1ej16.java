package ejercicios;

import java.util.Scanner;

public class g1ej16 {

	static final int tope=20;
	
	public static void main(String[] args) {
		int i=0;
		double mayorsueldo=0;
		String mayornom="";
		double[] vectorsueldos=new double [tope]; 
		String[] vectornombres= new String[tope];
		Scanner scsueldo=new Scanner(System.in);
		Scanner scnombre=new Scanner(System.in);
		
		for(i=0;i<tope;i++)
		{
			System.out.println("ingrese nombre: ");
			vectornombres[i]=scnombre.nextLine();
			System.out.println("ingrese sueldo: ");
			vectorsueldos[i]=scsueldo.nextDouble();
			if(vectorsueldos[i] > mayorsueldo)
			{
				mayorsueldo=vectorsueldos[i];
				mayornom=vectornombres[i];
			}
		}
		scsueldo.close();
		scnombre.close();
		System.out.println("el empleado con mayor sueldo es: "+mayornom);
		System.out.println("su sueldo es: "+mayorsueldo);
	}

}
