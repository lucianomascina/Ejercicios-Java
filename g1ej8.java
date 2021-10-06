package ejercicios;
import java.util.Scanner;

public class g1ej8 {

	public static void main(String[] args) {
		double v;
		int r;
		
		System.out.println("ingrese radio: ");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		v= ((double)4/3)*(3.14*(Math.pow(r,3)));
		System.out.println("el volumen es: "+v);
		sc.close();
	}

}
