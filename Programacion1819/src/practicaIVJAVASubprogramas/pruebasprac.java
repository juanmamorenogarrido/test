package practicaIVJAVASubprogramas;

public class pruebasprac {
	
	static final int TAMFIL=20, TAMCOL=30; 
	public static void main(String[] args) {
		ladoAleatorio();
	}
	public static String ladoAleatorio() {
		int numero=0;
		numero = (int) (Math.random() * 2) + 1;
		switch(numero) {
			case 1:
				return "DERECHA";
			case 2:
				return "IZQUIERDA";
		}
		return null;
	}
}
