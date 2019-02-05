package ejemploJAVABASICO;

public class EjemploEntrada {
	public static void main(String[] args) {
		
		int numEnt;
		double numReal1;
		float numReal2;
		char carac;
		String cad;
		
		System.out.println("Introduzca un número entero:");
		numEnt=Entrada.entero(); //LEER numEnt
		
		System.out.println("Introduzca un número real:");
		numReal1=Entrada.real();
		
		System.out.println("Introduzca otro número real:");
		numReal2=(float)Entrada.real();
		
		System.out.println("Introduzca un caracter:");
		carac=Entrada.caracter();
		
		System.out.println("Introduzca una cadena:");
		cad=Entrada.cadena();
		
		System.out.println("Ha introducido "+numEnt+" como número entero\n"+
											+numReal1+" como número real1\n"
											+numReal2+" como número real2\n"
											+carac+" como caracter\n"
											+cad+" como cadena");		

	}
}
