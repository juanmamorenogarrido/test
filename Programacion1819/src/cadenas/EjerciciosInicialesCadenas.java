package cadenas;

public class EjerciciosInicialesCadenas {

	public static void main(String[] args) {
		String cadena = new String("");
		// System.out.println(email());
		System.out.println("Mete cadena");
		cadena = Entrada.cadena().toLowerCase();
		int vocales = numeroVocales(cadena);
		System.out.println("La palabra" + cadena + " tiene " + vocales + " vocales");
	}

	
	  public static String email() { String nombre=new String(""); String
	  dominio=new String(""); String tld=new String(""); String email=new
	  String("");
	  
	  System.out.println("Introduzca nombre: "); nombre=Entrada.cadena();
	  System.out.println("Introduzca dominio: "); dominio=Entrada.cadena();
	  System.out.println("Introduzca TLD: "); tld=Entrada.cadena();
	  
	  email=nombre.concat("@").concat(dominio).concat(".").concat(tld).toLowerCase(
	  ).trim(); return email; }
	 
	public static int numeroVocales(String cadena) {
		int numVocales = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'
					|| cadena.charAt(i) == 'u')
				numVocales++;
		}
		return numVocales;
	}
	
	
}
