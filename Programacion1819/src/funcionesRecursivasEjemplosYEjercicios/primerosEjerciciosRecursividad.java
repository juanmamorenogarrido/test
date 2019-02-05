package funcionesRecursivasEjemplosYEjercicios;

public class primerosEjerciciosRecursividad {

	public static void main(String[] args) {
		int num=0, i=1;
		System.out.println("¿Qué tabla quieres?");
		num=Entrada.entero();
		tablaDeMultiplicar(num,i);
	}
	public static void tablaDeMultiplicar (int num, int i) {
		if(i==num)
			System.out.println(i+"x"+num+"="+i*num);
		else {
			System.out.println(i+"x"+num+"="+i*num);
			 i++;
			tablaDeMultiplicar(num,i);
			
		}
		
	}
}
