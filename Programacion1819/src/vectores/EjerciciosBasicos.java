package vectores;

public class EjerciciosBasicos {

	public static void main(String[] args) {
		
		char[] vocales= {'a','e','i','o','u'};
		float[] vectorF1=new float [10];
		float[] vectorF2=vectorF1.clone();
		final int NUM=15;
		int[] vectorI=new int[NUM];
		
		/*for(int i=0; i<vectorF1.length; i++) {
			System.out.println("Dame un valor para la posición "+i);
			vectorF1[i]=(float) Entrada.real();
		}
		
		for(int i=0;i<vectorF1.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorF1[i]);
		}*/
		
		/*for(int i=0; i<vectorI.length; i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorI[i]);
		}
		int j=1;
		for(int i=0;i<vectorI.length;i++ ) {		
			vectorI[i]=5*j;
			System.out.println("En la posición "+i+" está el valor "+vectorI[i]);			
			j++;
			
		}*/
		//6
		if(vectorF1.equals(vectorF2))
		{
			System.out.println("Los dos vectores son el mismo");
		}
		else
			System.out.println("Los dos vectores son diferentes");	
		//7
		for(int i=0; i<vectorF2.length; i++) {
			System.out.println("Dame un valor para la posición "+i);
			vectorF1[i]=(float) Entrada.real();
		}
		//8
		if(vectorF1.equals(vectorF2))
		{
			System.out.println("Los dos vectores son el mismo");
		}
		else
			System.out.println("Los dos vectores son diferentes");	
		
		//9
		float[] vectorFsuma=new float[10];
		for(int i=0; i<vectorFsuma.length; i++) {
			vectorFsuma[i]=vectorF1[i]+vectorF2[i];
			System.out.println(vectorFsuma[i]);
		}
		
		
		
	
	}
	

}
