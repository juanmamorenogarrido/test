package ejemploJAVABASICO;

public class IfSimple {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Introduce un número entero");
		num=Entrada.entero();
		
				
		if (num>=0) {
			System.out.println("El número es positivo");
			System.out.println("Quillo, que el número no es positivo te he dicho");
		}
		
		System.out.println("ADIOS");
			
	/* Cuando las estructuras if o bucles contienen una sola línea, no se necesitan las llaves {}
		aún así, las pondremos para el ejemplo */
		

	}

}
