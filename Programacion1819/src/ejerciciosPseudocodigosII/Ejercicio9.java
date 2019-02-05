package ejerciciosPseudocodigosII;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nA=0,nB=0,nC=0;
		System.out.println("Introduzca el primer número");
		nA=Entrada.entero();
		System.out.println("Introduzca el segundo número");
		nB=Entrada.entero();
		System.out.println("Introduzca el tercer número");
		nC=Entrada.entero();
		if(nA+nB==nC) {
			System.out.println("La suma de "+nA+" más "+nB+" coincide con "+nC);
		}
		else {
			if(nB+nC==nA) {
				System.out.println("La suma de "+nB+" más "+nC+" coincide con "+nA);
			}
			else {
				if(nA+nC==nB) {
					System.out.println("La suma de "+nA+" más "+nC+" coincide con "+nB);
				}
				else {
					System.out.println("Ningún resultado de la suma de dos valores coincide con el tercero");
				}
			}
		}
	}

}
