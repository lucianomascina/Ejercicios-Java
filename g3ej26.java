package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class g3ej26 {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		File archivo=null;
		
		try
		{
			System.out.println("ingrese nombre de archivo a crear: ");
			Scanner sc=new Scanner(System.in);
			String nombre=sc.nextLine();
			nombre=nombre.concat(".txt");
			archivo=new File(nombre);
			archivo.createNewFile();
			System.out.println("ingrese texto a guardar: ");
			Scanner sc1=new Scanner(System.in);
			String texto=sc1.nextLine();
			fw=new FileWriter(nombre);
			fw.write(texto);
			sc.close();
			sc1.close();
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
		
		try
		{
			fr=new FileReader(archivo);
			br=new BufferedReader(fr);
			String linea;
			while((linea=br.readLine())!=null)
			{
				System.out.println(linea);
			}
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

	}

}
