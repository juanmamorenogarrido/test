package practica3_JAVAResuelta;

public class Ejercicio3Resuelto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int DIA_REFERENCIA=7, MES_REFERENCIA=4, ANYO_REFERENCIA=2004;
				
		int dia=0,mes=0,anyo=0;		
		int cuentaDias=DIA_REFERENCIA, modulo=0;
		
		System.out.println("Introduzca el día de su nacimiento: ");
		dia=Entrada.entero();
		
		System.out.println("Introduzca el mes de su nacimiento: ");
		mes=Entrada.entero();
		
		System.out.println("Introduzca el año de su nacimiento: ");
		anyo=Entrada.entero();
		
		System.out.println("Sabiendo que el día "+DIA_REFERENCIA+" de "+MES_REFERENCIA+" de "+ANYO_REFERENCIA+" es MIERCOLES...");
		
		for(int meses=MES_REFERENCIA-1;meses>0;meses--)
		{
			if(meses==2)
			{
				if((ANYO_REFERENCIA%4==0) && 
						((ANYO_REFERENCIA%100!=0) || (ANYO_REFERENCIA%400==0)))
					cuentaDias+=29;
				else
					cuentaDias+=28;				
			}
			else if(meses==4 || meses==6 || meses==9 || meses==11)
				cuentaDias+=30;
			else
				cuentaDias+=31;
		}
		
		for(int anyos=ANYO_REFERENCIA-1;anyos>anyo;anyos--)
			if((anyos%4==0) && 
					((anyos%100!=0) || (anyos%400==0)))
				cuentaDias+=366;
			else
				cuentaDias+=365;
		
		for(int meses=12;meses>mes;meses--) {
			if(meses==2)
			{
				if((anyo%4==0) && 
						((anyo%100!=0) || (anyo%400==0)))
					cuentaDias+=29;
				else
					cuentaDias+=28;				
			}
			else if(meses==4 || meses==6 || meses==9 || meses==11)
				cuentaDias+=30;
			else
				cuentaDias+=31;
		}
		
		if(mes==2)
		{
			if((anyo%4==0) && 
					((anyo%100!=0) || (anyo%400==0)))
				cuentaDias+=29-dia;
			else
				cuentaDias+=28-dia;				
		}
		else if(mes==4 || mes==6 || mes==9 || mes==11)
			cuentaDias+=30-dia;
		else
			cuentaDias+=31-dia;
				
		
		modulo=cuentaDias%7;
		
		
		switch(modulo)
		{
			case 0: System.out.println("Usted nació un MIÉRCOLES");break;
			case 6: System.out.println("Usted nació un JUEVES");break;
			case 5: System.out.println("Usted nació un VIERNES");break;
			case 4: System.out.println("Usted nació un SÁBADO");break;
			case 3: System.out.println("Usted nació un DOMINGO");break;
			case 2: System.out.println("Usted nació un LUNES");break;
			case 1: System.out.println("Usted nació un MARTES");break;
		}
	}

	
}
