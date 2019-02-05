package ejemploJAVABASICO;

public class IfElseAnidados {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Introduce un número entero");
		num=Entrada.entero();
		
		if (num>0){
			System.out.println("El número es positivo");
		}
		else 
			if(num<0){
				System.out.println("El número es negativo");
			}
			else {
				System.out.println("El número es cero");
			
		}

		// ...O también...
		
		/* if (num>0){
			System.out.println("El número es positivo");
		}
		else {
			if(num<0){
				System.out.println("El número es negativo");
			}		
			else {
				System.out.println("El número es cero");
			}
			
		}*/
		 
		
		

	}

}
