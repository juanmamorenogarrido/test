package practica3_JAVA;

public class Ejercicio1 {

	public static void main(String[] args) {
		long cifra=0, acumulador=0;
		int numeroCifras=0, cuentaCifras=1, i=1;
		String numeroCadena=" ", numeroCadAnterior=" ";
		
		System.out.println("¿De cuántas cifras quieres el número");
		numeroCifras=Entrada.entero();
		System.out.println("Escribe su primera cifra");
		numeroCadena=Entrada.cadena().toUpperCase();
		
		switch(numeroCadena) {
			case"CERO":
				cifra=0;
				break;
			case"UNO":
				cifra=1;
				break;
			case"DOS":
				cifra=2;
				break;
			case"TRES":
				cifra=3;
				break;
			case"CUATRO":
				cifra=4;
				break;
			case"CINCO":
				cifra=5;
				break;
			case"SEIS":
				cifra=6;
				break;
			case"SIETE":
				cifra=7;
				break;
			case"OCHO":
				cifra=8;
				break;
			case"NUEVE":
				cifra=9;
				break;	
		}
		System.out.println("Su cifra introducida es "+numeroCadena);
		System.out.println("Su número parcialmente es "+cifra);
		
		acumulador=cifra;
		while(cuentaCifras<numeroCifras) {
			numeroCadAnterior=numeroCadena;
			System.out.println("\nEscribe la siguiente cifra en formato cadena");
			numeroCadena=Entrada.cadena().toUpperCase();
			
			if(numeroCadena.compareTo(numeroCadAnterior) < 0) {
				System.out.println("Cifra no válida, porque el número introducido fue "+numeroCadAnterior+" y es mayor que "+numeroCadena);
			}
			else {
				
				switch(numeroCadena) {
				case"CERO":
					cifra=0;
					break;
				case"UNO":
					cifra=1;
					break;
				case"DOS":
					cifra=2;
					break;
				case"TRES":
					cifra=3;
					break;
				case"CUATRO":
					cifra=4;
					break;
				case"CINCO":
					cifra=5;
					break;
				case"SEIS":
					cifra=6;
					break;
				case"SIETE":
					cifra=7;
					break;
				case"OCHO":
					cifra=8;
					break;
				case"NUEVE":
					cifra=9;
					break;	
			}
				i=i*10;
				acumulador=acumulador+cifra*i;
				
				System.out.println("Su cifra es "+numeroCadena);
				System.out.println("\nSu número parcialmente es "+acumulador);
				cuentaCifras++;
		}
	}
		System.out.println("Su número completo es "+acumulador);

}
}
