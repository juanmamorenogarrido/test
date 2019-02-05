package ejercicioPracticoFunciones;

public class ejercicioFechas {

	final static int DIA_HOY = 30;
	static final int MES_HOY = 11;
	static final int ANIO_HOY = 2018;

	public static void main(String[] args) {
		System.out.println("Introduce su dia de nacimiento");
		int dia = Entrada.entero();
		System.out.println("Introduce su mes (en cadena) de nacimiento");
		String mesCadena = Entrada.cadena().toUpperCase();
		System.out.println("Introduce su año de nacimiento");
		int anio = Entrada.entero();
		int mesNumerico = pasaMesAEntero(mesCadena);
		if (fechaCorrecta(dia, mesNumerico, anio)) {
			calculaEdad(dia, mesNumerico, anio);
		} else
			System.out.println("Fecha no válida");

	}

	public static boolean esBisiesto(int anio) {
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			return true;
		else
			return false;
	}

	public static int diasMes(int mes, int anio) {

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
			return 31;
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			return 30;
		else if (mes == 2 && esBisiesto(anio))
			return 29;
		else if (mes == 2 && !esBisiesto(anio))
			return 28;
		return 0;

	}

	public static int pasaMesAEntero(String mesCad) {

		switch (mesCad) {
		case "ENERO":
			return 1;

		case "FEBRERO":
			return 2;

		case "MARZO":
			return 3;

		case "ABRIL":
			return 4;

		case "MAYO":
			return 5;

		case "JUNIO":
			return 6;

		case "JULIO":
			return 7;

		case "AGOSTO":
			return 8;

		case "SEPTIEMBRE":
			return 9;

		case "OCTUBRE":
			return 10;

		case "NOVIEMBRE":
			return 11;

		case "DICIEMBRE":
			return 12;

		default:
			return -1;
		}

	}

	public static boolean fechaCorrecta(int dia, int mes, int anio) {
		if (dia > diasMes(mes, anio))
			return false;
		else
			return true;

	}

	public static boolean esMayor(int dia, int mes) {
		if (mes > MES_HOY)
			return true;
		else if (mes == MES_HOY && dia > DIA_HOY)
			return true;
		else
			return false;

	}

	public static void calculaEdad(int dia, int mes, int anio) {
		if (esMayor(dia, mes)) {
			anio = (ANIO_HOY - anio) - 1;
		} else {
			anio = ANIO_HOY - anio;
		}

		System.out.println("Tienes " + anio + " años");
	}
}
