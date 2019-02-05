package ejerciciosPseudocodigosII;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jugador1=" ",jugador2=" ";
		System.out.println("Jugador 1, Introduzca piedra, papel o tijeras");
		jugador1=Entrada.cadena();
		System.out.println("Jugador 2, Introduzca piedra, papel o tijeras");
		jugador2=Entrada.cadena();
		if(jugador1.equals("piedra") && jugador2.equals("tijeras")) {
			System.out.println("El jugador 1 ha ganado la partida");
		}
		if(jugador1.compareTo("papel")==0 && jugador2.compareTo("piedra")==0) {
			System.out.println("El jugador 1 ha ganado la partida");
		}
		if(jugador1.equals("tijeras") && jugador2.equals("papel")) {
			System.out.println("El jugador 1 ha ganado la partida");
		}
		if(jugador1.compareTo("tijeras")==0 && jugador2.compareTo("piedra")==0) {
			System.out.println("El jugador 2 ha ganado la partida");
		}
		if(jugador1.equals("piedra") && jugador2.equals("papel")) {  /*DOS FORMAS DE COMPARAR, ==0 ES PARA QUE LAS CADENAS SEAN IGUALES*/ 
			System.out.println("El jugador 2 ha ganado la partida"); /*PARA MAYOR O MENOR SE SIGUE EL ORDENA ALFABETICO*/  
		}
		if(jugador1.equals("papel") && jugador2.equals("tijeras")) {
			System.out.println("El jugador 2 ha ganado la partida");
		}
		if(jugador1.compareTo(jugador2)==0) {
			System.out.println("Han empatado");
		}
	}

}
