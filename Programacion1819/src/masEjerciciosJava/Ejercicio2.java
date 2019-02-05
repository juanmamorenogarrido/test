package masEjerciciosJava;

public class Ejercicio2 {
	public static void main(String[] args) {
		char car=' ';
		
		System.out.println("Introduce un carácter en minúscula");
		car=Entrada.caracter();
		car=(char) (car-32);
		System.out.println("Su carácter en mayúsculas es "+car);
	
	
}
}
