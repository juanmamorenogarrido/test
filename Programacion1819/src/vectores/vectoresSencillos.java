package vectores;

public class vectoresSencillos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] vector1=new int[5];
		int[] vector2={6,6,6,6,6};
		
		System.out.println("Vamos a rellenar el vector con datos...");
		for(int i=0;i<vector1.length;i++)
		{
			System.out.println("Añade un valor para la posición "+i);
			vector1[i]=Entrada.entero();
		}
		
		System.out.println("Vamos a mostrar el vector...");
		for(int i=0;i<vector1.length;i++)		
			System.out.println("En la posición "+i+" está guardado el valor "+vector1[i]);
	
		//comparación de dos vectores con los mismos datos
		if(vector2.equals(vector1))
				System.out.println("vector1 es igual a vector2");
		else
			System.out.println("vector1 es diferente a vector2");
		
		
		
		
		
		
	}

}
