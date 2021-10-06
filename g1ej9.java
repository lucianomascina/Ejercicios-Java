package ejercicios;
import java.util.Scanner;

public class g1ej9 {

	public static void main(String[] args) {
		int d,m,a,s,a1,a2,a3,a4;
		
		System.out.println("ingrese dia de nacimiento: ");
		Scanner sc1=new Scanner(System.in);
		d=sc1.nextInt();
		System.out.println("ingrese mes de nacimiento: ");
		Scanner sc2=new Scanner(System.in);
		m=sc2.nextInt();
		System.out.println("ingrese año de nacimiento: ");
		Scanner sc3=new Scanner(System.in);
		a=sc1.nextInt();
		a1=(a/1000);
		a2=(a-(a1*1000))/100;

		s=d+m+a;
		System.out.println("su numero de la suerte es: "+s);
		sc1.close();
		sc2.close();
		sc3.close();
	}

}
