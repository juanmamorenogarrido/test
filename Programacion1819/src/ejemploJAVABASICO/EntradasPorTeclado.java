package ejemploJAVABASICO;

import java.util.Scanner;

public class EntradasPorTeclado {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		String str;
		char c;
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		
		System.out.println("Introduce una cadena: ");
		str=teclado.nextLine();
		System.out.println("La cadena introducida es "+str);
		
		System.out.println("Introduce una carácter: ");
		c=teclado.next().charAt(0);
		System.out.println("El caracter introducido es "+c);
		
		System.out.println("Introduce un byte: ");
		b=teclado.nextByte();
		System.out.println("El byte introducido es "+b);
		
		System.out.println("Introduce un short: ");
		s=teclado.nextShort();
		System.out.println("El short introducido es "+s);
		
		System.out.println("Introduce un int: ");
		i=teclado.nextInt();
		System.out.println("El int introducido es "+i);
		
		System.out.println("Introduce un long: ");
		l=teclado.nextLong();
		System.out.println("El long introducido es "+l);
		
		System.out.println("Introduce un float: ");
		f=teclado.nextFloat();
		System.out.println("El float introducido es "+f);
		
		System.out.println("Introduce un double: ");
		d=teclado.nextDouble();
		System.out.println("El double introducido es "+d);  
		
		c=str.charAt(0);
		System.out.println("El primer carácter de la cadena es "+c);
		
		teclado.close();
	}
}
