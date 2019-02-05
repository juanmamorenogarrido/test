package ejemploJAVABASICO;

public class ComparacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1=new String("jugador1");
		String cad2=new String("jugador2");
		
		if(cad1.compareTo(cad2)==0)
			System.out.println("Las cadenas son iguales");
		else
			if(cad1.compareTo(cad2)>0)
				System.out.println("cad1 es mayor que cad2");
			else
				System.out.println("cad1 es menor que cad2");
		
		
		
	}

}
