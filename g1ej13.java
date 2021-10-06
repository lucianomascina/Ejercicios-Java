package ejercicios;

public class g1ej13 {

	static final int tope=20;
	
	public static void main(String[] args) {
		int i,z=0;
		int[] vector=new int[tope];
		
		for(i=0;i<40;i=i+2)
		{
			vector[z]=i;
			z++;
		}
		for(i=0;i<tope;i++)
		{
			System.out.println(vector[i]);
		}
	}

}
