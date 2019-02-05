package ejemploJAVABASICO;

public class For {

	public static void main(String[] args) {
		//int valorInicial=0, valorFinal=0;
		
		System.out.println("Contando...");
	
		for(int num=1; num<=10; num++){
			System.out.println("Vamos por el número "+num);
			for(int j=1; j<=10; j++)
			{
				System.out.println("Valor de j "+j);
			}
		}
		
		System.out.println("Fin de la cuenta");
	}

}
