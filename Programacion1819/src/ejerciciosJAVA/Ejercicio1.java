package ejerciciosJAVA;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0, num2=0, j=2, i=2;
		System.out.println("Introduzca dos número");
		num1=Entrada.entero();
		num2=Entrada.entero();
		
		while(i<=(num1/2) && num1%i!=0) {
			i++;
		}
		while(j<=(num2/2) && num2%j!=0) {
			j++;
		}
		
		if (i>num1/2 && j>num2/2) {
			if(num2-num1==2) {
				System.out.println("Los números son gemelos");
			}
			else {
				System.out.println("Los números no son gemelos");
			}
		}
	
		else {
			System.out.println("Un núemro introducido no es primo");
		}

	}

}
