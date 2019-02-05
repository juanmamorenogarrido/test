package masEjerciciosJava;

public class Ejercicio6 {

	public static void main(String[] args) {
		int num1=0, num2=0, numeroAleatorio=0, numeroAleatorioAnterior=999999999, i=0;
		
		System.out.println("Introduzca dos números");
		num1=Entrada.entero();
		num2=Entrada.entero();
		
		while (i==0) {
			numeroAleatorio=(int) (Math.random()*(num2-num1+1)+num1);
			if(numeroAleatorio<numeroAleatorioAnterior) {
			System.out.println(numeroAleatorio);
			numeroAleatorioAnterior=numeroAleatorio;
			}
			else {
				i++;
			}
		}
	}

}
