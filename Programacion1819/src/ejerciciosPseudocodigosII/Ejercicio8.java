package ejerciciosPseudocodigosII;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base=0, altura=0, radio=0, areaT=0, areaC=0;
		System.out.println("Introduzca la base y altura del triángulo: ");
		base=Entrada.real();
		altura=Entrada.real();
		System.out.println("Introduzca el radio del círculo: ");
		radio=Entrada.real();
		areaT=(base*altura)/2;
		areaC=Math.PI*Math.pow(radio, 2);
		if(areaT>areaC) {
			System.out.println("El triángulo es mayor que el círculo");
		}
		if(areaT<areaC) {
			System.out.println("El círculo es mayor que el triángulo");
		}
		if(areaT==areaC) {
			System.out.println("Ambos tienen el mismo área");
		}
		
	}

}
