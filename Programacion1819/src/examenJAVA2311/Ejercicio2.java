package examenJAVA2311;

public class Ejercicio2 {

	public static void main(String[] args) {
		final int DIA_SECRETO = 29, MES_SECRETO = 11, ANIO_SECRETO = 1995;
		int intentos = 0, dia = 0, mes = 0, anio = 0, numeroIntentos = 0;
		boolean intentosAgotados = true;

		System.out
				.println("BIENVENIDO A ADIVINA LA FECHA SECRETA!!! \n¿En cuantos intentos quieres adivinar la fecha?");
		intentos = Entrada.entero();
		while (numeroIntentos < intentos) {
			System.out.println("Introduzca su fecha (formato dd/mm/aaaa)");
			dia = Entrada.entero();
			mes = Entrada.entero();
			anio = Entrada.entero();

			if (mes > 12 || ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) && dia > 31)
					|| ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30)
					|| ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)) && mes == 2 && dia > 29)
					|| ((!(anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) && mes == 2 && dia > 28)) {
				System.out.println("Fecha Incorrecta, este intento no cuenta...");
			} else {
				if (anio < ANIO_SECRETO) {
					System.out.println("El año que has introducido es menor que el año secreto");
					numeroIntentos++;
				} else {
					if (anio > ANIO_SECRETO) {
						System.out.println("El año que has introducido es mayor que el año secreto");
						numeroIntentos++;
					} else {
						if (anio == ANIO_SECRETO && mes < MES_SECRETO) {
							System.out.println("AÑO ACERTADO! \nPero el mes introducido es menor que el mes secreto");
							numeroIntentos++;
						} else {
							if (anio == ANIO_SECRETO && mes > MES_SECRETO) {
								System.out
										.println("AÑO ACERTADO! \nPero el mes introducido es mayor que el mes secreto");
								numeroIntentos++;
							} else {
								if (anio == ANIO_SECRETO && mes == MES_SECRETO && dia < DIA_SECRETO) {
									System.out.println(
											"AÑO ACERTADO! \nMES ACERTADO! \nPero el dia que has introducido es menor que el secreto");
									numeroIntentos++;
								} else {
									if (anio == ANIO_SECRETO && mes == MES_SECRETO && dia > DIA_SECRETO) {
										System.out.println(
												"AÑO ACERTADO! \nMES ACERTADO! \nPero el dia que has introducido es mayor que el secreto");
										numeroIntentos++;
									} else {
										if (anio == ANIO_SECRETO && mes == MES_SECRETO && dia == DIA_SECRETO) {
											numeroIntentos++;
											System.out.println("ENHORABUENA, ACERTASTE LA FECHA EN " + numeroIntentos
													+ " INTENTOS");
											intentosAgotados = false;
										}
									}
								}
							}
						}
					}

				}
			}

		}
		if (intentosAgotados == true) {
			System.out.println("OHH!! AGOTASTE TUS INTENTOS, LA FECHA ERA " + DIA_SECRETO + "/" + MES_SECRETO + "/"
					+ ANIO_SECRETO);
		}

	}
}
