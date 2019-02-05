package masEjerciciosJava;

public class Ejercicio2Examen {

	public static void main(String[] args) {
		int numeroCarta=0, intentos=3, paloCarta=0, numeroUsuario=0;
		String paloCartaCadena=" ", paloCadenaUsuario=" ";
		boolean acierto=false;
		
		
		System.out.println("Generando carta... \nAdivina mi carta!!");
		numeroCarta=(int)(Math.random()*(12-1+1)+1);
		paloCarta=(int)(Math.random()*(4-1+1)+1);
		switch(paloCarta) {
			case 1:
			paloCartaCadena="ORO";
			break;
			case 2:
				paloCartaCadena="BASTOS";
				break;
			case 3:
				paloCartaCadena="COPAS";
				break;
			case 4:
				paloCartaCadena="ESPADA";
				break;
		}
		
		while(intentos>0) {
			System.out.println("Tienes "+intentos+" intentos \nIntroduce una carta");
			numeroUsuario=Entrada.entero();
			paloCadenaUsuario=Entrada.cadena().toUpperCase();
			if(numeroUsuario==numeroCarta && paloCadenaUsuario.compareTo(paloCartaCadena)==0) {
				System.out.println("MUY BIEN, LA HAS ACERTADO");
				intentos=0;
				acierto=true;
			}
			else {
				System.out.println("Has fallado");
				intentos--;
			}
		}
		if(acierto==false) {
			System.out.println("Te has quedado sin intentos, la carta era "+numeroCarta+" de "+paloCartaCadena);
		}
	}

}
