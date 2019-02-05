package examenJAVA1412;



public class TresEnRaya {

	static int x1 = 0, x2 = 0, x3 = 0, o1 = 0, o2 = 0, o3 = 0;

	public static void main(String[] args) {
		boolean movimientoUsuario = false, partida=true, movimientoPrograma = false;
		String movimientoCadena = " ";
		int fichaUsuario = 0, fichaPrograma = 0, turnoUsuario=1, turnoPrograma=1;
		
		System.out.println("¡BIENVENIDO \nJuguemos al tres en raya, ¿Serás capaz de ganarme?");
		while(partida) {
			imprimeTablero();
			while (!ganaUsuario() && !ganaPrograma() && quedanFichas()) {
				switch(turnoUsuario) {
				case 1:
					fichaUsuario=o1;
					break;
				case 2:
					fichaUsuario=o2;
					break;
				case 3:
					fichaUsuario=o3;
					break;
			}
			switch(turnoPrograma) {
			case 1:
				fichaPrograma=x1;
				break;
			case 2:
				fichaPrograma=x2;
				break;
			case 3:
				fichaPrograma=x3;
				break;
		}
					System.out.println("¡Tu turno!");
				while (!movimientoUsuario) {
					System.out.println("Elige donde queires colocar tu ficha");
					movimientoCadena = Entrada.cadena().toUpperCase();
					movimientoUsuario = usuarioMueveFicha(fichaUsuario, movimientoCadena);
					if (!movimientoUsuario)
						System.out.println("Movimiento erróneo!!");
					else
						System.out.println("Buen movimiento crack");
				}
				movimientoUsuario=false;
				turnoUsuario++;
				imprimeTablero();
				ganaUsuario();
				if (!ganaUsuario()) {
					System.out.println("Turno del programa");
					while (!movimientoPrograma) {
						movimientoPrograma = mueveFichaAleatoria(fichaPrograma);
						if (!movimientoPrograma)
							System.out.println("Movimiento erróneo del programa");
						else
							System.out.println("Buen movimiento");
					}
					movimientoPrograma=false;
					turnoPrograma++;
					imprimeTablero();
					ganaPrograma();
				}
			}
			if (ganaUsuario())
				System.out.println("Has ganado campeón");
			else if (ganaPrograma())
				System.out.println("Ganó el programa...Paquete!!");
			else
				System.out.println("EMPATE");
			System.out.println("¿Quieres jugar de nuevo? (s/n)");
			char jugar=Entrada.caracter();
			if(jugar=='s') {
				limpiarTablero();
				ganaUsuario();
				ganaPrograma();
				turnoUsuario=1;
				turnoPrograma=1;
			}
			else {
				partida=false;
				System.out.println("Hasta luego Lucas");
		}
		}
			
	}

	public static void imprimeTablero() {
		int i = 1;
		while (i <= 9) {
			if (i == o1 || i == o2 || i == o3)
				System.out.print("o \t");

			else if (i == x1 || i == x2 || i == x3)
				System.out.print("x \t");

			else
				System.out.print("- \t");
			if (i % 3 == 0)
				System.out.println(" \t");

			i++;

		}
	}

	public static boolean mueveFichaAleatoria(int fichaPrograma) {
		int posicionFicha = (int) (Math.random() * 9) + 1;
		if (fichaPrograma == x1) {
			if (posicionFicha != o1) {
				x1=posicionFicha;
				return true;}
			else
				return false;
		} else if (fichaPrograma == x2) {
			if (posicionFicha != o1 && posicionFicha != x1 && posicionFicha != o2) {
				x2=posicionFicha;
				return true;}
			else
				return false;
		} else if (fichaPrograma == x3) {
			if (posicionFicha != o1 && posicionFicha != x1 && posicionFicha != o2 && posicionFicha != x2
					&& fichaPrograma != o3) {
				x3=posicionFicha;
				return true;}
			else
				return false;
		}
		return false;
	}

	public static int convierteAPosicionMovimiento(String movimientoCadena) {
		switch (movimientoCadena) {
		case ("ARRIBA IZQUIERDA"):
			return 1;
		case ("ARRIBA CENTRO"):
			return 2;
		case ("ARRIBA DERECHA"):
			return 3;
		case ("CENTRO IZQUIERDA"):
			return 4;
		case ("CENTRO CENTRO"):
			return 5;
		case ("CENTRO DERECHA"):
			return 6;
		case ("ABAJO IZQUIERDA"):
			return 7;
		case ("ABAJO CENTRO"):
			return 8;
		case ("ABAJO DERECHA"):
			return 9;
		default:
			return 0;
		}
	}

	public static boolean usuarioMueveFicha(int fichaUsuario, String movimientoCadena) {
		int movimiento = convierteAPosicionMovimiento(movimientoCadena);
		if (fichaUsuario == o1 && movimiento!=0) {
			o1 = movimiento;
			return true;}
		else if (fichaUsuario == o2 && movimiento!=0) {
			if (movimiento != o1 && movimiento != x1) {
				o2=movimiento;
				return true;}
			else
				return false;
		} else if (fichaUsuario == o3 && movimiento!=0) {
			if (movimiento != o1 && movimiento != x1 && movimiento != o2 && movimiento != x2) {
				o3=movimiento;
				return true;}
			else
				return false;
		}
		return false;
	}

	public static void limpiarTablero() {
		o1 = 0;
		o2 = 0;
		o3 = 0;
		x1 = 0;
		x2 = 0;
		x3 = 0;
		
	}

	public static boolean quedanFichas() {
		if (x1 != 0 && x2 != 0 && x3 != 0 && o1 != 0 && o2 != 0 && o3 != 0)
			return false;
		else
			return true;
	}

	public static boolean ganaPrograma() {
		if ((x1 == 1 || x2 == 1 || x3 == 1) && (x1 == 2 || x2 == 2 || x3 == 2) && (x1 == 3 || x2 == 3 || x3 == 3))
			return true;
		else if ((x1 == 4 || x2 == 4 || x3 == 4) && (x1 == 5 || x2 == 5 || x3 == 5) && (x1 == 6 || x2 == 6 || x3 == 6))
			return true;
		else if ((x1 == 7 || x2 == 7 || x3 == 7) && (x1 == 8 || x2 == 8 || x3 == 8) && (x1 == 9 || x2 == 9 || x3 == 9))
			return true;
		else if ((x1 == 1 || x2 == 1 || x3 == 1) && (x1 == 4 || x2 == 4 || x3 == 4) && (x1 == 7 || x2 == 7 || x3 == 7))
			return true;
		else if ((x1 == 2 || x2 == 2 || x3 == 2) && (x1 == 5 || x2 == 5 || x3 == 5) && (x1 == 8 || x2 == 8 || x3 == 8))
			return true;
		else if ((x1 == 3 || x2 == 3 || x3 == 3) && (x1 == 6 || x2 == 6 || x3 == 6) && (x1 == 9 || x2 == 9 || x3 == 9))
			return true;
		else if ((x1 == 1 || x2 == 1 || x3 == 1) && (x1 == 5 || x2 == 5 || x3 == 5) && (x1 == 9 || x2 == 9 || x3 == 9))
			return true;
		else if ((x1 == 3 || x2 == 3 || x3 == 3) && (x1 == 5 || x2 == 5 || x3 == 5) && (x1 == 7 || x2 == 7 || x3 == 7))
			return true;
		else
			return false;
	}

	public static boolean ganaUsuario() {
		if ((o1 == 1 || o2 == 1 || o3 == 1) && (o1 == 2 || o2 == 2 || o3 == 2) && (o1 == 3 || o2 == 3 || o3 == 3))
			return true;
		else if ((o1 == 4 || o2 == 4 || o3 == 4) && (o1 == 5 || o2 == 5 || o3 == 5) && (o1 == 6 || o2 == 6 || o3 == 6))
			return true;
		else if ((o1 == 7 || o2 == 7 || o3 == 7) && (o1 == 8 || o2 == 8 || o3 == 8) && (o1 == 9 || o2 == 9 || o3 == 9))
			return true;
		else if ((o1 == 1 || o2 == 1 || o3 == 1) && (o1 == 4 || o2 == 4 || o3 == 4) && (o1 == 7 || o2 == 7 || o3 == 7))
			return true;
		else if ((o1 == 2 || o2 == 2 || o3 == 2) && (o1 == 5 || o2 == 5 || o3 == 5) && (o1 == 8 || o2 == 8 || o3 == 8))
			return true;
		else if ((o1 == 3 || o2 == 3 || o3 == 3) && (o1 == 6 || o2 == 6 || o3 == 6) && (o1 == 9 || o2 == 9 || o3 == 9))
			return true;
		else if ((o1 == 1 || o2 == 1 || o3 == 1) && (o1 == 5 || o2 == 5 || o3 == 5) && (o1 == 9 || o2 == 9 || o3 == 9))
			return true;
		else if ((o1 == 3 || o2 == 3 || o3 == 3) && (o1 == 5 || o2 == 5 || o3 == 5) && (o1 == 7 || o2 == 7 || o3 == 7))
			return true;
		else
			return false;
	}

}
