package masEjerciciosJava;

public class Ejercicio2 {
	public static void main(String[] args) {
		char car=' ';
		
		System.out.println("Introduce un car�cter en min�scula");
		car=Entrada.caracter();
		car=(char) (car-32);
		System.out.println("Su car�cter en may�sculas es "+car);
	
	
}
}
