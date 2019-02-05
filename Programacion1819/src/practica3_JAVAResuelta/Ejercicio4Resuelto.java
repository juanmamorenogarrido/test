package practica3_JAVAResuelta;

public class Ejercicio4Resuelto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int num=0;
				
				while(num<5 || num%2==0) {
					System.out.println("\nIntroduzca un número impar mayor o igual a 5: ");
					num=Entrada.entero();
				}

				
				for(int i=1;i<=num;i++){
					for(int j=1;j<=num;j++){
						if(i==1  || i==num)
							System.out.print("* ");
						else if(j==num-i+1 || i==(num/2)+1)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
					System.out.println("");
				}		
	}
}
