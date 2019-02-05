package ejerciciosPseudocodigosIII;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, suma=0, i=0, media=0;
		System.out.println("Introduzca un número");
		num=Entrada.entero();
		while(num>0) {
			suma=suma+num;
			i++;
			System.out.println("Introduzca un número");
			num=Entrada.entero();
		}
		media=suma/i;
		System.out.println("La media de tus números es: "+media);
	}

}
