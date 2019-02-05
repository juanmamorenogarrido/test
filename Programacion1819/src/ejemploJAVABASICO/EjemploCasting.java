package ejemploJAVABASICO;

public class EjemploCasting {

	public static void main(String[] args) {
			
		int num1;
		int num2;
		double division;
		
		System.out.println("Introduzca un número:");
		num1=Entrada.entero();
		
		System.out.println("Introduzca otro:");
		num2=Entrada.entero();
		// division=(int)(num1/num2); 12.20 entre 6.98 devuelve 1 
		division=(double)(num1/num2); //12.20 entre 6.98 devuelve 2
		System.out.println("La división entera entre "+num1+" y "+num2+" es "+division);

	}

}
