package ejerciciosPseudocodigosI;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI=3.1415;
		double radio=0,perimetro=0,area=0;
		System.out.println("Introduzca un radio");
		radio=Entrada.real();
		area=PI*Math.pow(radio, 2);
		System.out.println("El resultado del �rea de un c�rculo de radio "+radio+" es "+area);
		perimetro=(2*PI)*radio;
		System.out.println("El resultado del per�metro de un c�rculo de radio "+radio+" es "+perimetro);
		
	}

}
