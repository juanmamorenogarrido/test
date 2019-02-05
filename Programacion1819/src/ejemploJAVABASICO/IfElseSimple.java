package ejemploJAVABASICO;

public class IfElseSimple {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Introduce un número entero");
		num=Entrada.entero();
		
		if (num>=0){
			System.out.println("El número es positivo");
		}
		else
		{
			System.out.println("El número es negativo");
			System.out.println("Hemos entrado en el else");
		}
		
	/* Cuando las estructuras if o bucles contienen una sola línea, no se necesitan las llaves {}
		aún así, las pondremos para el ejemplo */
		

	}

}
