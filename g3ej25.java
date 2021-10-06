package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class g3ej25 {

	public static void main(String[] args) {
		File archivo=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		try
		{
			archivo=new File("test.txt");
			fr=new FileReader(archivo);
			br=new BufferedReader(fr);
			String linea;
			while((linea=br.readLine())!=null)
			{
				System.out.println(linea.replace(" ",""));
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
