package ejemploJAVABASICO;

public class SwitchCase {

	public static void main(String[] args) {
		String pos=new String("");
		
		System.out.println("Indica tu posición en la carrera:");
		pos=Entrada.cadena();
		
		/*if(pos=="primero")
		{
			System.out.println("Has quedado campeón");
		}*/
		
		switch(pos){
			case "primero":
				System.out.println("PRIMERO");
				break;
			case "segundo":
				System.out.println("SEGUNDO");
				break;
			case "tercero":System.out.println("TERCERO");
				break;
			case "cuarto":System.out.println("DIPLOMA");
				break;
			case "quinto":System.out.println("DIPLOMA");
				break;
			default: 
				System.out.println("NO HAS OBTENIDO PREMIO");
		}
		
		
	}

}
