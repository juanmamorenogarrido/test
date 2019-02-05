package practicaIVJAVASubprogramas;

public class pseudoDAMAS {
	static final int TAMFIL = 20, TAMCOL = 30;
	static int XProg1 = 3, YProg1 = 2, XProg2 = 15, YProg2 = 2, XProg3 = 27, YProg3 = 2, XUser1 = 3, YUser1 = 18,
			XUser2 = 15, YUser2 = 18, XUser3 = 27, YUser3 = 18;
	static boolean fichaProg1 = true, fichaProg2 = true, fichaProg3 = true, fichaUser1 = true, fichaUser2 = true,
			fichaUser3 = true;

	public static void main(String[] args) {
		char empate = 'n';
		String direccion = " ";
		boolean movimiento = false;
		int numeroFicha = 0;
		
		//bienvenida
		System.out.println("¡BIENVENIDO AL JUEGO DE DAMAS!");
		construirTablero();
		System.out.println("Empiezas tú, amigo");

		//hasta que no esten todas las fichas del usuario o del programa comidas no saldrá del bucle o que el usuario quiera tablas
		while ((fichaProg1 || fichaProg2 || fichaProg3) && (fichaUser1 || fichaUser2 || fichaUser3) && empate == 'n') {
			System.out.println("¿Tablas (s/n)?");
			empate = Entrada.caracter();
			if (empate == 'n') {  //mientras el usuario no quiera tablas entrará por el if
				
				//se le pide un movimiento al usuario
				System.out.println("¿Qué número quiere mover?");
				numeroFicha = Entrada.entero();
				System.out.println("¿Qué dirección?");
				direccion = Entrada.cadena().toUpperCase();

				if (direccion.compareTo("DERECHA") == 0)
					movimiento = mueveDerechaFichaUsuario(numeroFicha);
				else if (direccion.compareTo("IZQUIERDA") == 0)
					movimiento = mueveIzquierdaFichaUsuario(numeroFicha);
				
				//si el movimiento es válido se llama a la funcion de comeFicha para comprobar si se come a alguna ficha
				if (movimiento) {
					System.out.println("Buen movimiento");
					if (comeFichas('u', numeroFicha))
						System.out.println("Te has comido una ficha del programa");
				} else
					System.out.println("Movimiento nulo \nHa perdido su turno");

				construirTablero();

				//aqui empieza el turno del programa, saldrá una ficha y un lado aleatoriamente
				System.out.println("Turno del programa");
				String ladoFicha = ladoAleatorio();
				int fichaPrograma = fichaAleatoria();

				if (ladoFicha.compareTo("DERECHA") == 0)
					movimiento = mueveDerechaFichaPrograma(fichaPrograma);
				else if (ladoFicha.compareTo("IZQUIERDA") == 0)
					movimiento = mueveIzquierdaFichaPrograma(fichaPrograma);

				if (movimiento) {
					System.out.println("Buen movimiento");
					if (comeFichas('p', fichaPrograma))
						System.out.println("El programa te ha comido una ficha, NOOB");
				} else
					System.out.println("Movimiento nulo \nEl programa perdió el turno");

				construirTablero();
			}
			
		}

		//una vez que sale del bucle comprobamos porque salió, si ha perdido el usuario, el programa o ha declarado tablas
		if (empate == 's')
			System.out.println("EMPATE");
		if (!fichaProg1 && !fichaProg2 && !fichaProg3)
			System.out.println("¡HAS GANADO!");

		if (!fichaUser1 && !fichaUser2 && !fichaUser3)
			System.out.println("ERES MUY MALO, !TE HA GANADO EL PROGRAMA¡");

	}
	//FUNCIONES 
	public static void imprimeLetrasTablero() {
		char letra = 'A';
		int posicion = 0;
		while (posicion < TAMCOL) {
			if (posicion % 6 == 3) {
				System.out.print(letra);
				letra++;
			} else
				System.out.print(" ");
			posicion++;
		}
		System.out.println();
	}

	public static void construirTablero() {
		int i = 0, j = 0, acumulador = 2, n = 1;
		imprimeLetrasTablero();
		while (i <= TAMFIL) {
			while (j <= TAMCOL) {
				if (j == 0 || i == 0 || j == TAMCOL || i == TAMFIL || i % 4 == 0 || j % 6 == 0) {
					System.out.print("*");
					if (j == TAMCOL) {
						if (i == acumulador) {
							System.out.print(n);
							acumulador = acumulador + 4;
							n++;
						}
					}
				} else
					imprimeFichas(i, j);
				j++;
			}
			j = 0;
			i++;
			System.out.println(" ");
		}
	}

	public static void imprimeFichas(int i, int j) {

		if (fichaProg1 && j == XProg1 && i == YProg1)
			System.out.print("P");
		else if (fichaProg2 && j == XProg2 && i == YProg2)
			System.out.print("P");
		else if (fichaProg3 && j == XProg3 && i == YProg3)
			System.out.print("P");
		else if (fichaUser1 && j == XUser1 && i == YUser1)
			System.out.print("U");
		else if (fichaUser2 && j == XUser2 && i == YUser2)
			System.out.print("D");
		else if (fichaUser3 && j == XUser3 && i == YUser3)
			System.out.print("T");
		else
			System.out.print(" ");

	}

	public static boolean mueveIzquierdaFichaPrograma(int fichaPrograma) {
		if (fichaPrograma == 1) {
			if (!fichaProg1)
				return false;
			else if (XProg1 - 6 <= 0 || YProg1 + 4 >= TAMCOL || !fichaProg1)
				return false;
			else if ((XProg1 - 6 == XProg2 && YProg1 + 4 == YProg2 && fichaProg2)
					|| (XProg1 - 6 == XProg3 && fichaProg3 && YProg1 + 4 == YProg3))
				return false;
			else {
				XProg1 = XProg1 - 6;
				YProg1 = YProg1 + 4;
				return true;

			}
		}
		if (fichaPrograma == 2) {
			if (!fichaProg2)
				return false;
			else if (XProg2 - 6 <= 0 || YProg2 + 4 >= TAMCOL || !fichaProg2) {
				return false;
			} else if ((XProg2 - 6 == XProg1 && YProg2 + 4 == YProg1 && fichaProg1)
					|| (XProg2 - 6 == XProg3 && fichaProg3 && YProg2 + 4 == YProg3))
				return false;
			else {
				XProg2 = XProg2 - 6;
				YProg2 = YProg2 + 4;
				return true;
			}
		}
		if (fichaPrograma == 3) {
			if (!fichaProg3)
				return false;
			else if (XProg3 - 6 <= 0 || YProg3 + 4 >= TAMCOL || !fichaProg3) {
				return false;
			} else if ((XProg3 - 6 == XProg2 && YProg3 + 4 == YProg2 && fichaProg2)
					|| (XProg3 - 6 == XProg1 && fichaProg1 && YProg3 + 4 == YProg1))
				return false;
			else {
				XProg3 = XProg3 - 6;
				YProg3 = YProg3 + 4;
				return true;
			}

		}
		return false;

	}

	public static boolean mueveDerechaFichaPrograma(int fichaPrograma) {
		if (fichaPrograma == 1) {
			if (!fichaProg1)
				return false;
			else if (XProg1 + 6 >= TAMFIL || YProg1 + 4 >= TAMCOL || !fichaUser1) {
				return false;
			} else if ((XProg1 + 6 == XProg2 && YProg1 + 4 == YProg2 && fichaProg2)
					|| (XProg1 + 6 == XProg3 && fichaProg3 && YProg1 + 4 == YProg3))
				return false;
			else {
				XProg1 = XProg1 + 6;
				YProg1 = YProg1 + 4;
				return true;

			}
		}
		if (fichaPrograma == 2) {
			if (!fichaProg2)
				return false;
			else if (XProg2 + 6 >= TAMFIL || YProg2 + 4 >= TAMCOL || !fichaUser2) {
				return false;
			} else if ((XProg2 + 6 == XProg1 && YProg2 + 4 == YProg1 && fichaProg1)
					|| (XProg2 + 6 == XProg3 && fichaProg3 && YProg2 + 4 == YProg3))
				return false;
			else {
				XProg2 = XProg2 + 6;
				YProg2 = YProg2 + 4;
				return true;
			}

		}
		if (fichaPrograma == 3) {
			if (!fichaProg3)
				return false;
			else if (XProg3 + 6 >= TAMFIL || YProg3 + 4 >= TAMCOL || !fichaUser3) {
				return false;
			} else if ((XProg3 + 6 == XProg2 && YProg3 + 4 == YProg2 && fichaProg2)
					|| (XProg3 + 6 == XProg1 && fichaProg1 && YProg3 + 4 == YProg1))
				return false;
			else {
				XProg3 = XProg3 + 6;
				YProg3 = YProg3 + 4;
				return true;
			}

		}
		return false;
	}

	public static boolean mueveIzquierdaFichaUsuario(int fichaUsuario) {
		if (fichaUsuario == 1) {
			if (!fichaUser1)
				return false;
			else if (XUser1 - 6 <= 0 || YUser1 - 4 <= 0)
				return false;
			else if ((XUser1 - 6 == XUser2 && YUser1 - 4 == YUser2 && fichaUser2)
					|| (XUser1 - 6 == XUser3 && fichaUser3 && YUser1 - 4 == YUser3))
				return false;
			else {
				XUser1 = XUser1 - 6;
				YUser1 = YUser1 - 4;
				return true;
			}

		}
		if (fichaUsuario == 2) {
			if (!fichaUser2)
				return false;
			else if (XUser2 - 6 <= 0 || YUser2 - 4 <= 0) {
				return false;
			} else if ((XUser2 - 6 == XUser1 && YUser2 - 4 == YUser1 && fichaUser1)
					|| (XUser2 - 6 == XUser3 && fichaUser3 && YUser2 - 4 == YUser3))
				return false;
			else {
				XUser2 = XUser2 - 6;
				YUser2 = YUser2 - 4;
				return true;
			}

		}
		if (fichaUsuario == 3) {
			if (!fichaUser3)
				return false;
			else if (XUser3 - 6 <= 0 || YUser3 - 4 <= 0) {
				return false;
			} else if ((XUser3 - 6 == XUser2 && YUser3 - 4 == YUser2 && fichaUser2)
					|| (XUser3 - 6 == XUser1 && fichaUser1 && YUser3 - 4 == YUser1))
				return false;
			else {
				XUser3 = XUser3 - 6;
				YUser3 = YUser3 - 4;
				return true;
			}

		}
		return false;
	}

	public static boolean mueveDerechaFichaUsuario(int fichaUsuario) {
		if (fichaUsuario == 1) {
			if (!fichaUser1)
				return false;
			else if (XUser1 + 6 >= TAMCOL || YUser1 - 4 <= 0)
				return false;
			else if ((XUser1 + 6 == XUser2 && YUser1 - 4 == YUser2 && fichaUser2)
					|| (XUser1 + 6 == XUser3 && fichaUser3 && YUser1 - 4 == YUser3))
				return false;
			else {
				XUser1 = XUser1 + 6;
				YUser1 = YUser1 - 4;
				return true;
			}

		}
		if (fichaUsuario == 2) {
			if (!fichaUser2)
				return false;
			else if (XUser2 + 6 >= TAMCOL || YUser2 - 4 <= 0) {
				return false;
			} else if ((XUser2 + 6 == XUser1 && YUser2 - 4 == YUser1 && fichaUser1)
					|| (XUser2 + 6 == XUser3 && fichaUser3 && YUser2 - 4 == YUser3))
				return false;
			else {
				XUser2 = XUser2 + 6;
				YUser2 = YUser2 - 4;
				return true;
			}

		}
		if (fichaUsuario == 3) {
			if (!fichaUser3)
				return false;
			else if (XUser3 + 6 >= TAMCOL || YUser3 - 4 <= 0) {
				return false;
			} else if ((XUser3 + 6 == XUser2 && YUser3 - 4 == YUser2 && fichaUser2)
					|| (XUser3 + 6 == XUser1 && fichaUser1 && YUser3 - 4 == YUser1))
				return false;
			else {
				XUser3 = XUser3 + 6;
				YUser3 = YUser3 - 4;
				return true;
			}

		}
		return false;
	}

	public static boolean comeFichas(char jugador, int numeroFicha) {
		switch (jugador) {
		case 'p':
			if (numeroFicha == 1) {
				if (XProg1 == XUser1 && YProg1 == YUser1) {
					fichaUser1 = false;
					return true;
				} else if (XProg1 == XUser2 && YProg1 == YUser2) {
					fichaUser2 = false;
					return true;
				} else if (XProg1 == XUser3 && YProg1 == YUser3) {
					fichaUser3 = false;
					return true;
				}

			} else if (numeroFicha == 2) {
				if (XProg2 == XUser1 && YProg2 == YUser1) {
					fichaUser1 = false;
					return true;
				} else if (XProg2 == XUser2 && YProg2 == YUser2) {
					fichaUser2 = false;
					return true;
				} else if (XProg2 == XUser3 && YProg2 == YUser3) {
					fichaUser3 = false;
					return true;
				}
			} else if (numeroFicha == 3) {
				if (XProg3 == XUser1 && YProg3 == YUser1) {
					fichaUser1 = false;
					return true;
				} else if (XProg3 == XUser2 && YProg3 == YUser2) {
					fichaUser2 = false;
					return true;
				} else if (XProg3 == XUser3 && YProg3 == YUser3) {
					fichaUser3 = false;
					return true;
				}
			}
		case 'u':
			if (numeroFicha == 1) {
				if (XUser1 == XProg1 && YUser1 == YProg1) {
					fichaProg1 = false;
					return true;
				} else if (XUser1 == XProg2 && YUser1 == YProg2) {
					fichaProg2 = false;
					return true;
				} else if (XUser1 == XProg3 && YUser1 == YProg3) {
					fichaProg3 = false;
					return true;
				}
			}
			if (numeroFicha == 2) {
				if (XUser2 == XProg1 && YUser2 == YProg1) {
					fichaProg1 = false;
					return true;
				} else if (XUser2 == XProg2 && YUser2 == YProg2) {
					fichaProg2 = false;
					return true;
				} else if (XUser2 == XProg3 && YUser2 == YProg3) {
					fichaProg3 = false;
					return true;
				}
			}
			if (numeroFicha == 3) {
				if (XUser3 == XProg1 && YUser3 == YProg1) {
					fichaProg1 = false;
					return true;
				} else if (XUser3 == XProg2 && YUser3 == YProg2) {
					fichaProg2 = false;
					return true;
				} else if (XUser3 == XProg3 && YUser3 == YProg3) {
					fichaProg3 = false;
					return true;
				}
			}

		}
		return false;
	}

	public static String ladoAleatorio() {
		int numero = 0;
		numero = (int) (Math.random() * 2) + 1;
		switch (numero) {
		case 1:
			return "DERECHA";
		case 2:
			return "IZQUIERDA";
		}
		return null;
	}

	public static int fichaAleatoria() {
		int ficha = 0;
		ficha = (int) (Math.random() * 3) + 1;
		return ficha;
	}
}
