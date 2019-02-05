package vectores;

public class ejercicioFunciones {

	public static void main(String[] args) {
		//Ejercicio1
		/*int [] vEjer1= new int [10];
		muestraValoresVector(vEjer1);
		//Ejercicio2
		int [] vEjer2= new int [5];
		int posicion=0, numero=0;
		posicion=devuelvePosicion(vEjer2,numero);*/
		
		//ejercicio4
		/*int[] vector=new int [5];
		int[] vectorMult;
		int num=2;
		rellenaVector(vector);
		muestraValoresVector(vector);
		System.out.println("\n");
		vectorMult=multiplicaVectorEnOtro(vector, num);
		muestraValoresVector(vectorMult);*/
	
		//int[] vector=new int [5];
		//int[] vector2=new int [vector.length];
		//int[] vectorS=new int [vector.length];
		
		/*rellenaVector(vector);
		muestraValoresVector(vector);
		System.out.println("\n");
		rellenaVector(vector2);
		muestraValoresVector(vector2);
		System.out.println("\n");
		
		vectorS=sumaVectores(vector, vector2);
		muestraValoresVector(vectorS);*/
	
	}
	//funcionRelleno
	public static void rellenaVector(int[] vector) {
		for(int  i=0; i<vector.length; i++) {
			vector[i] = (int) (Math.random() * 10) + 1;
		}
	}
	//funcion 1
	public static void  muestraValoresVector(int[]vector) {
		for (int i = 0; i < vector.length; i++)
			System.out.println("En la posicion " + i + " está el número " + vector[i]+" ");
	}
	
	//funcion 2
	public static int devuelvePosicion(int[] vector, int num) {
		
		for(int i=0; i<vector.length; i++) {
			if(num==vector[i]) 
				return i; 
		
		}
		return -1;
	}
	
	//funcion 3
	public static void multiplicaPropioVector(int[]vector, int num) {
		
		for(int i=0;i < vector.length; i++) {
			vector[i]=vector[i]*num; 
		}
	}
	
	//funcion 4
	public static int[] multiplicaVectorEnOtro(int[]vector, int num) {
		int[] vectorMultiplicado=vector.clone();
		
		for(int i=0;i < vector.length; i++) {
			vectorMultiplicado[i]=vector[i]*num; 
		}
		return vectorMultiplicado;
	}
	
	//funcion 5
	public static int[] sumaVectores(int[]vector1,  int[]vector2) {
		int[] vectorSuma=new int[vector1.length];
		for(int i=0;i<vector1.length; i++) {
			vectorSuma[i]=vector1[i]+vector2[i];
		}
		return vectorSuma;
		
	}
	

	
	

}
