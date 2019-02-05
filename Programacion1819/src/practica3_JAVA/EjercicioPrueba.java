package practica3_JAVA;

public class EjercicioPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroFilas=0, i=0, j=0;
		System.out.println("Introduce el nuemro de filas");
		numeroFilas=Entrada.entero();
		while(j<numeroFilas) {
			while(i!=numeroFilas){
				System.out.print("* ");
				i++;
			}
			i=0;
			if(j!=numeroFilas) {
				System.out.println(" ");
				j++;
			}
		}
	}

}
