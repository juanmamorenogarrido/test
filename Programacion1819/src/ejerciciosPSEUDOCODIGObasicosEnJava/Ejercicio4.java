package ejerciciosPSEUDOCODIGObasicosEnJava;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final  double PI=3.1415;
		double radio, area, perimetro;
		System.out.println("Introduzca un radio");
		radio=Entrada.real();
		area=PI*(radio*radio);
		System.out.println("el resultado del �rea de un c�rculo de radio "+radio+" es: "+area);
		perimetro=(2*PI)*radio;
		System.out.println("el resultado del per�metro de un c�rculo de radio "+radio+" es: "+perimetro);
	}

}
