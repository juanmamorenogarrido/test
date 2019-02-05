package matrices;

public class corredoresPROFE {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		double tiempo[][] = new double [2][5];
		int num = 0;
		
		System.out.println("Introduzca el numero del corredor '1' o '2':");
		num = Entrada.entero();
		pideTiempo(tiempo, num);
		
		System.out.println("Introduzca el numero del corredor '1' o '2':");
		num = Entrada.entero();
		pideTiempo(tiempo, num);
		
		for(int i = 0; i < calculaPuntos(tiempo).length; i++){
			System.out.println("Los puntos del corredor " + (i+1) + " son " + calculaPuntos(tiempo)[i]);
		}
		
	
	}
	
	public static void pideTiempo(double matriz[][], int num){
		if(num!=1 && num!=2)
			System.out.println("Numero de corredor erroneo.");
		else{		
			for(int j = 0; j < 5; j++){
				System.out.println("Introduzca los tiempos del corredor 1 en la poscicion " + j + ":");
				double tiempo = Entrada.real();
				matriz[num-1][j] = tiempo;
			}
		}
		
	}
	
	public static int [] calculaPuntos(double matriz[][]){
		
		int puntos[] = new int [2];
		
		
		for(int j = 0; j < 5; j++){
			if(matriz[0][j] < matriz[1][j]){
				puntos[0]+=3;
				puntos[1]++;
			}else {
				if(matriz[0][j] > matriz[1][j]){
					puntos[0]++;
					puntos[1]+=3;
				}else {
					if(matriz[0][j] == matriz[1][j]){
						puntos[0]+=2;
						puntos[1]+=2;
					}
				}
			}
		}
		
		if(puntos[0] == puntos[1]){
			if(corredorConMenorTiempo(matriz) == 1){
				puntos[0]+=2;
			}else {
				if(corredorConMenorTiempo(matriz) == 2){
					puntos[1]+=2;
				}
			}
		}
		
		return puntos;
	}
	
	public static int corredorConMenorTiempo(double matriz[][]){
		
		double mejorTiempoC1 = 99, mejorTiempoC2 = 99;
		
		for(int j = 0; j < matriz[0].length; j++){
			if(mejorTiempoC1 < matriz[0][j]){
				mejorTiempoC1 = matriz[0][j];
			}
			if(mejorTiempoC2 < matriz[1][j]){
				mejorTiempoC2 = matriz[1][j];
			}
		}
		
		if(mejorTiempoC1 < mejorTiempoC2){
			return 1;
		}else if(mejorTiempoC2<mejorTiempoC1) {
			return 2;
		}else 
			return 0;
	}
}
