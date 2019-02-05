package ejerciciosJAVARESUELTOS;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0, num2=0, i=2, contprimos=0;
		
		System.out.println("Introduzca un número");
		num1=Entrada.entero();
		System.out.println("Introduzca otro número");
		num2=Entrada.entero();
		
		
		if(num2-num1==2) {
			while (i<=(num1/2) && num1%i!=0) {
				i++;
			}
			if (i>num1/2) {
				contprimos++;
			}
			i=2;
			
			while (i<=(num2/2) && num2%i!=0) {
				i++;
			}
			if (i>num2/2) {
				contprimos++;
			}
		}
		if(contprimos==2) {
			System.out.println("Los números "+num1+" y "+num2+" son primos gemelos");
		}
		else {
			System.out.println("Los números "+num1+" y "+num2+" no son primos gemelos");
		}
	}

}
