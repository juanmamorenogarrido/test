package funcionesRecursivasEjemplosYEjercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		int base=0, exp=0, i=1, resultado=1;
		System.out.println("Potencia a calcular(base y exponente");
		base=Entrada.entero();
		exp=Entrada.entero();
		potencia(base, exp, i, resultado);
	}
	public static void potencia(int base, int exponente, int i, int resultado) {
		if(i==exponente) {
			resultado=resultado*base;
			System.out.println("El resultado es "+resultado);
		}
		else {
			resultado=resultado*base;
			i++;
			potencia(base,exponente,i,resultado );
		}
	}

}
