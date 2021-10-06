package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class g2ej24 {

	public static void main(String[] args) {
		ArrayList<coche> lista = new ArrayList<coche>();
		int i=0;
		
		for(i=0;i<5;i++)
		{
			System.out.println("ingrese marca: ");
			Scanner sc1=new Scanner(System.in);
			String marca=sc1.nextLine();
			System.out.println("ingrese modelo: ");
			Scanner sc2=new Scanner(System.in);
			int modelo=sc2.nextInt();
			System.out.println("ingrese kilometros: ");
			Scanner sc3=new Scanner(System.in);
			int kilometros=sc3.nextInt();
			coche c=new coche(kilometros,marca,modelo);
			lista.add(c);
		
		}
		
		for(coche c:lista)
		{
			System.out.println(c.toString());
		}
		
		System.out.println("ingrese marca: ");
		Scanner sc1=new Scanner(System.in);
		String marca=sc1.nextLine();
		sc1.close();
		for(coche c:lista)
		{
			if(marca.equals(c.getMarca()))
				System.out.println(c.toString());
		}
		
		System.out.println("ingrese kilometros: ");
		Scanner sc2=new Scanner(System.in);
		int kilometros=sc2.nextInt();
		sc2.close();
		for(coche c:lista)
		{
			if(c.getKilometros()<kilometros)
				System.out.println(c.toString());
		}
		
		Collections.sort(lista);
		coche c=lista.get(4);
		System.out.println(c.toString());
		
	}
}
