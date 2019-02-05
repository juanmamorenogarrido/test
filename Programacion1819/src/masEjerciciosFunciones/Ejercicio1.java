package masEjerciciosFunciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		char car=' ';
		
		System.out.println("¿Qué area quieres calcular? \n'a' Cuadrado \n'b' Rectángulo \n'c' Triángulo \n'd' Círculo" );
		car=Entrada.caracter();
		queArea(car);
		
				
		}
	
	public static double calculoAreaCuadradoYRectangulo(double base, double altura) {
		double area=0;
		area=base*altura;
		return area;
	}
	public static double calculoAreaTriangulo(double base, double altura) {
		double area=0;
		area=calculoAreaCuadradoYRectangulo(base, altura)/2;
		return area;
	}
	public static double calculoAreaCirculo(double radio) {
		double area=0;
		area=Math.PI*Math.pow(radio,2);
		return area;
	}
	public static void queArea(char car1) {
		double base=0, altura=0, radio=0;		
		switch(car1){
			case 'a':
				System.out.println("Introduce la base y la altura");
				base=Entrada.real();
				altura=Entrada.real();
				System.out.println("El area es "+calculoAreaCuadradoYRectangulo(base,altura));
				break;
			case 'b':
				System.out.println("Introduce la base y la altura");
				base=Entrada.real();
				altura=Entrada.real();
				System.out.println("El area es "+calculoAreaCuadradoYRectangulo(base,altura));
				break;
			case 'c':
				System.out.println("Introduce la base y la altura");
				base=Entrada.real();
				altura=Entrada.real();
				System.out.println("El area es "+calculoAreaTriangulo(base,altura));
				break;
			case 'd':
				System.out.println("Introduce la el radio");
				radio=Entrada.real();
				System.out.println("El area es "+calculoAreaCirculo(radio));
				break;
			default:
				System.out.println("El caracter introducido no es valido");
				
				
		}
	}
}
