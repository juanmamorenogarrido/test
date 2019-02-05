package matrices;


public class corredores {

	public static void main(String[] args) {
		double [][] matriz=new double[2][5];
		int corredor=0;
		int[]vector;
		System.out.println("¿Qué corredor es?");
		corredor=Entrada.entero();
		pideTiempos(matriz, corredor);
		corredor=Entrada.entero();
		pideTiempos(matriz, corredor);
		muestraMatriz(matriz);
		vector=calculaPuntos(matriz);
		muestraValoresVector(vector);
		
	}
	public static void pideTiempos(double[][]matriz, int corredor) {
		int carrera=1;
			corredor=1;
		for(int i=0;i<matriz[corredor-1].length;i++) {
			System.out.println("Introduzca el tiempo de la "+carrera+" carrera");
			matriz[corredor][i]=Entrada.real();
			carrera++;
		}
	}
	
	public static int[] calculaPuntos(double matriz[][]){
		int puntosC1=0, puntosC2=0 ;
		double tiempoC1=0, tiempoC2=0;
			for(int j=0;j<5;j++) {
				tiempoC1+=matriz[0][j];
				tiempoC2+=matriz[1][j];
			}
			if(tiempoC1<tiempoC2) {
				puntosC1+=3;
				puntosC2+=1;
			}
			if(tiempoC1>tiempoC2) {
				puntosC2+=3;
				puntosC1+=1;
			}
			if(tiempoC1==tiempoC2) {
				puntosC1+=2;
				puntosC2+=2;
			}
			
		int [] vector={puntosC1,puntosC2};
		return vector;
	
	}
	public static void  muestraValoresVector(int[]vector) {
		for (int i = 0; i < vector.length; i++)
			System.out.println("En la posicion " + i + " está el número " + vector[i]+" ");
	}
	
	
	
	
	
	
	
	public static void muestraMatriz(double [][]mat)
	{
		int tam=tamanyoMaximoColumnas(mat);
		
		for (int i=0; i<tam; i++)
			System.out.print("\t"+i);
		System.out.println();
		
		for (int i=0; i<mat.length; i++)
		{
			System.out.print(i);
			for(int j=0; j<mat[i].length; j++)
			{
				System.out.print("\t"+mat[i][j]);
			}
			System.out.println();
		}
	}
	public static int tamanyoMaximoColumnas(double[][]mat)
	{
		int max=0;
		for (int i=0; i<mat.length; i++)
			if(max<mat[i].length)
				max=mat[i].length;
		
		return max;			
	}
	
	
}
