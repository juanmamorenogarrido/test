package ejerciciosJAVA;

public class Ejercicio2 {
	public static void main(String[] args) {
		final int DIAHOY=10, MESHOY=11, ANIOHOY=2018;
		int diaNac=0, mesNac=0, anioNac=0, edad=0;
		String mesCadena=" ";
		boolean fechaValida=true;
		
		System.out.println("Introduce su fecha de nacimiento con el mes en mayuscula");
		diaNac=Entrada.entero();
		mesCadena=Entrada.cadena();
		anioNac=Entrada.entero();
		
		switch(mesCadena){
			case "ENERO":
				mesNac=1;
				break;
			case "FEBRERO":
				mesNac=2;
				break;
			case "MARZO":
				mesNac=3;
				break;
			case "ABRIL":
				mesNac=4;
				break;
			case "MAYO":
				mesNac=5;
				break;
			case "JUNIO":
				mesNac=6;
				break;
			case "JULIO":
				mesNac=7;
				break;
			case "AGOSTO":
				mesNac=8;
				break;
			case "SEPTIMBRE":
				mesNac=9;
				break;
			case "OCTUBRE":
				mesNac=10;
				break;
			case "NOVIEMBRE":
				mesNac=11;
				break;
			case "DICIEMBRE":
				mesNac=12;
				break;
			}
		if((mesNac==1 || mesNac==3 || mesNac==5 || mesNac==7 || mesNac==8 || mesNac==10 || mesNac==12) && diaNac>31) {
			fechaValida=false;
		}
		else {
			if(mesNac==2) {
				if ((anioNac % 4 == 0) && ((anioNac % 100 != 0) || (anioNac % 400 == 0)) && diaNac>29) {
					fechaValida=false;
				}
				else {
					if(!(anioNac % 4 == 0) && ((anioNac % 100 != 0) || (anioNac % 400 == 0)) && diaNac>28) {
						fechaValida=false;
					}
				}
			}
			else {
				if((mesNac==4 || mesNac==6 || mesNac==9 || mesNac==11) && diaNac>30) {
					fechaValida=false;
				}
			}
		}
		if(fechaValida) {
			if(MESHOY>=mesNac && DIAHOY<=diaNac) {
				edad=ANIOHOY-anioNac;
				System.out.println("Su edad son: "+edad+" años");
			}
			else {
				if((MESHOY<=mesNac && DIAHOY>diaNac)) {
					edad=ANIOHOY-anioNac-1;
					System.out.println("Su edad son: "+edad+" años");
			}
			
		}
	
		}
		else {
			System.out.println("Fecha no valida, introduce una correcta");
		}
	}
}
