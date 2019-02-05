package vectores;

public class InicialVectoresCORREGIDO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1. Crea un vector tipo char que se llame vocales e inicialízalo con las vocales a,e,i,o,u.*/
		
		char [] vocales = {'a','e','i','o','u'};
		
		/*2. Crea otro vector de la clase float que se llame vectorF1 y reserva 10 posiciones para dicho
		vector. Pide al usuario valores para rellenar vectorF1.*/
		
		float [] vectorF1 = new float [10];
		
		for (int i = 0; i < vectorF1.length; i++) {
			System.out.println("Introduce un valor para la posicion "+i);
			vectorF1[i]=(float) Entrada.real();
		}
		
		/*3. Crea otro vector float vectorF2 y clona los datos del vectorF1.*/
		
		float [] vectorF2;
		
		vectorF2=vectorF1.clone();
		
		/*4. Crea otro vector de la clase int llamado vectorI y reserva NUM posiciones para ese vector 
		 * donde NUM es una constante con valor 15.*/
		
		final int NUM=15;
		int [] vectorI = new int [NUM];
		
		/*5. Muestra por pantalla los valores de todas las posiciones de vectorI junto con la posición 
		 * en la que se encuentran. Luego rellena el vector con los múltiplos de 5 que quepan en el 
		 * vector (empezando en el primero) y vuelve a mostrarlos por pantalla.*/
		
		for (int i = 0; i < vectorI.length; i++) {
			System.out.println("En la posicion "+i+" esta el valor: ");		
		}
		for (int i = 0; i < vectorI.length; i++) { 
			vectorI[i]=5*(i+1);
		}
		
		for (int i = 0; i < vectorI.length; i++) {
			System.out.println("En la posicion "+i+" esta el valor: ");		
		}
		/*6. Compara vectorF1 con vectorF2 y si son iguales muestra por pantalla que lo son y si no son
		iguales muestra por pantalla que no lo son.*/
		
		if (vectorF1.equals(vectorF2)) {
			System.out.println("Los vectores son iguales");
		} else
			System.out.println("Los vectores no son iguales");
		
		/*7. Pide al usuario valores tipo float para rellenar con nuevos valores todas las posiciones del
		vectorF2.*/
		
		for (int i = 0; i < vectorF2.length; i++) {
			System.out.println("Introduce un valor para la posicion "+i);
			vectorF2[i]=(float) Entrada.real();
		}
		
		/*8. Compara de nuevo vectorF1 y vectorF2 y muestra por pantalla si son iguales o no.*/
		
		if (vectorF1.equals(vectorF2)) {
			System.out.println("Los vectores son iguales");
		} else
			System.out.println("Los vectores no son iguales");
		
		/*9. Crea un nuevo vector vectorFsuma donde se guarden en cada posición la suma de los valores de
		vectorF1 y vectorF2 de la misma posición.*/
		float [] vectorFsuma=new float[vectorF1.length];
		
		for(int i=0;i<vectorFsuma.length;i++) {
			vectorFsuma[i]=vectorF1[i]+vectorF2[i];
		}
		
		/*10. Muestra por pantalla el contenido de vectorFsuma.*/
		System.out.println("Los datos de VectorFsuma son:");
		for(int i=0;i<vectorFsuma.length;i++) {
			System.out.println("El valor en la posición "+i+" es "+vectorFsuma[i]);
		}
		
		/*10. Modifica el vector vocales para que contenga las vocales
		 * en mayúsculas (sin volver a inicializar y usando un bucle) */
		for(int i=0;i<vocales.length;i++) 
			vocales[i]=Character.toUpperCase(vocales[i]);
		
		/*11. Muestra por pantalla el contenido del vector vocales */
		for(int i=0;i<vocales.length;i++)
			System.out.println("El valor en la posición "+i+" es "+vocales[i]);
		
		
	}

}
