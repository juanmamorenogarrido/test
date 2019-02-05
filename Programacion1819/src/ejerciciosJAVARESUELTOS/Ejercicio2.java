package ejerciciosJAVARESUELTOS;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int DIA_FECHA_HOY = 12, ANYO_FECHA_HOY = 2018, MES_FECHA_HOY = 11;		
		int diaCumple = 0, anyoCumple = 0, mesCumple = 0;
		String mesCadena = " ";
		boolean fechaCorrecta=true;
		
		System.out.println("Introduce el día que naciste");
		diaCumple = Entrada.entero();
		
		System.out.println("Ahora el mes");
		mesCadena = Entrada.cadena();
		
		System.out.println("Ahora el año");
		anyoCumple = Entrada.entero();
		
		switch (mesCadena) {
		case "Enero":
			mesCumple = 1;
			break;
		case "Febrero":
			mesCumple = 2;
			break;
		case "Marzo":
			mesCumple = 3;
			break;
		case "Abril":
			mesCumple = 4;
			break;
		case "Mayo":
			mesCumple = 5;
			break;
		case "Junio":
			mesCumple = 6;
			break;
		case "Julio":
			mesCumple = 7;
			break;
		case "Agosto":
			mesCumple = 8;
			break;
		case "Septiembre":
			mesCumple = 9;
			break;
		case "Octubre":
			mesCumple = 10;
			break;
		case "Noviembre":
			mesCumple = 11;
			break;
		case "Diciembre":
			mesCumple = 12;
			break;
		default: 
			mesCumple = 0;
			break;
		}
		
		if((mesCumple==1 || mesCumple==3 || mesCumple==5
				|| mesCumple==7 || mesCumple==8 
				|| mesCumple==10 || mesCumple==12) && diaCumple>31)
			fechaCorrecta=false;
		else
			if(mesCumple==2) {
				if((anyoCumple%4==0) && 
						((anyoCumple%100!=0) || (anyoCumple%400==0))
						&& diaCumple>29)
					fechaCorrecta=false;
				else
					if(!((anyoCumple%4==0) && 
							((anyoCumple%100!=0) || (anyoCumple%400==0)))
								&& diaCumple>28)
						fechaCorrecta=false;
			}
			else
				if((mesCumple==4 || mesCumple==6 ||
					mesCumple==9 || mesCumple==11) && diaCumple>30)
					fechaCorrecta=false;
		
		if(fechaCorrecta) {
			if ((mesCumple > MES_FECHA_HOY) || (mesCumple == MES_FECHA_HOY && diaCumple > DIA_FECHA_HOY)) {
				anyoCumple = (ANYO_FECHA_HOY - anyoCumple) - 1;
			} else
				anyoCumple = ANYO_FECHA_HOY - anyoCumple;

			System.out.println("Tienes " + anyoCumple + " años");
		}
		else
			System.out.println("Fecha incorrecta");
		
	}

}
