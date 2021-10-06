package ejercicios;

public class g1ej17 {

	static final int tope=10;
	
	public static void main(String[] args) {
		
		int i;
		double[] vector=new double[tope];
		
		for(i=0;i<tope;i++)
		{
			vector[i]=Math.random();
			System.out.println(vector[i]);
		}

	}

}
