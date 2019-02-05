package masEjerciciosJava;

public class Ejercicio3Examen {

	public static void main(String[] args) {
		int maximo=0, i=0, distancia=0, numeroMayor=0, primo=0, primoAnterior=0, numero=0, j=2, primoDefinitivo1=0, primoDefinitivo2=0;
		
		System.out.println("Introduzca el número menor del rango");
		numero=Entrada.entero();
		System.out.println("Introduzca el número mayo del rango");
		numeroMayor=Entrada.entero();
		
		while(numero<=numeroMayor) {
			primoAnterior=primo;
			j=2;
			while(j<=(numero/2) && numero%j!=0) {
				j++;
			}
			if(j>numero/2) {
				primo=numero;
				i++;
			}
			
			if(i==2) {
				distancia=primo-primoAnterior-1;
				if(distancia>maximo) {
					maximo=distancia;
					primoDefinitivo1=primo;
					primoDefinitivo2=primoAnterior;
					
				}
				i--;
			}
			numero++;
		}
		System.out.println("La mayor distancia entre dos primos es "+maximo+" y los primos son "+primoDefinitivo2+" y "+primoDefinitivo1);
		
	}

}
