package ejerciciosPseudocodigosIII;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cuentaNumeros=1,num=0,cuentaCeros=0,sumaNegativos=0,sumaPositivos=0,cuentaNegativos=0, media=0;
		
		System.out.println("Introduce un número entero");
		num=Entrada.entero();
		while(cuentaNumeros<10) {
			if(num==0) {
				cuentaCeros++;
			}
			else {
				if(num<0) {
					sumaNegativos=sumaNegativos+num;
					cuentaNegativos++;
				}
				else {
					sumaPositivos=sumaPositivos+num;
				}
			}
			System.out.println("Introduce un número entero");
			num=Entrada.entero();
			cuentaNumeros++;
		}
		if(cuentaNegativos!=0) {
			media=sumaNegativos/cuentaNegativos;
		}
		else {
			System.out.println("No se puede hacer la media");
		}
			
			
		System.out.println("La suma de los números positivos es: "+sumaPositivos);
		System.out.println("La media de los números negativos es: "+media);
		System.out.println("Has introducido "+cuentaCeros+" ceros");
	}

}
