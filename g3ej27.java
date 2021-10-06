package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class g3ej27 {

	public static void main(String[] args) {
		int op;
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		File archivo=null;
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		do
		{
			System.out.println("<1> crear archivo");
			System.out.println("<2> mostrar datos");
			System.out.println("<3> salir");
			System.out.println("ingrese opción: ");
				
			op=sc.nextInt();
			
			switch(op)
			{
				case 1:
					try
					{
						System.out.println("ingrese nombre de archivo a crear: ");
						String nombre=sc1.nextLine();
						sc1.nextLine();
						nombre=nombre.concat(".txt");
						archivo=new File(nombre);
						archivo.createNewFile();
						System.out.println("ingrese nombre: ");
						String nom=sc1.nextLine();
						sc1.nextLine();
						System.out.println("ingrese apellido: ");
						String ape=sc1.nextLine();
						sc1.nextLine();
						System.out.println("ingrese ciudad de nacimiento: ");
						String ciudad=sc1.nextLine();
						sc1.nextLine();
						fw=new FileWriter(nombre);
						fw.write(nom+"\t"+ape+"\t"+ciudad);
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
					finally
					{
						try
						{
							fw.close();
						}
						catch(Exception ex)
						{
							ex.printStackTrace();
						}
					}
					break;
					
				case 2:
					try
					{
						fr=new FileReader(archivo);
						br=new BufferedReader(fr);
						String linea;
						while((linea=br.readLine())!=null)
						{
							System.out.println(linea);
						}
						sc1.nextLine();
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
					finally
					{
						try
						{
							fr.close();
						}
						catch(Exception ex)
						{
							ex.printStackTrace();
						}
					}
					break;
					
				case 3: System.out.println("saliendo del programa");
						sc.close();
						sc1.close();
					break;
			}
		}while(op!=3);
		System.exit(0);	
	}

}
