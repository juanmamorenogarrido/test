package ejerciciosPseudocodigosII;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base=0, altura=0, radio=0, areaT=0, areaC=0;
		System.out.println("Introduzca la base y altura del tri�ngulo: ");
		base=Entrada.real();
		altura=Entrada.real();
		System.out.println("Introduzca el radio del c�rculo: ");
		radio=Entrada.real();
		areaT=(base*altura)/2;
		areaC=Math.PI*Math.pow(radio, 2);
		if(areaT>areaC) {
			System.out.println("El tri�ngulo es mayor que el c�rculo");
		}
		if(areaT<areaC) {
			System.out.println("El c�rculo es mayor que el tri�ngulo");
		}
		if(areaT==areaC) {
			System.out.println("Ambos tienen el mismo �rea");
		}
		
	}

}
