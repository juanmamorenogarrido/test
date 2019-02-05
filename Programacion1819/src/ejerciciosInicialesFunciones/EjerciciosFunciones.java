package ejerciciosInicialesFunciones;



public class EjerciciosFunciones {
	public static void main(String[] args) {
		//EJERCICIO 1
		/*int n=0;
		n=pedirNumero(n);
		moduloEjecutandose(n);*/
		
		//EJERCICIO 2
		/*int numA=0, numB=0, maximo=0;
		numA=pedirNumero(numA);
		numB=pedirNumero(numB);
		maximo=maximoDosNumeros(numA,numB);
		System.out.println("El número mayor es "+maximo);*/
		
		//EJERCICIO3
		/*int numA=0, numB=0, numC=0, maximoTres=0;
		numA=pedirNumero(numA);
		numB=pedirNumero(numB);
		numC=pedirNumero(numC);
		maximoTres=maximoTresNumeros(numA, numB, numC);
		System.out.println("El número mayor es "+maximoTres);*/
		
		//EJERCICIO4
		/*int numA=0, numB=0;
		numA=pedirNumero(numA);
		numB=pedirNumero(numB);
		numerosComprendidos(numero1, numero2);*/
		
		//EJERCICIO5
		/*int numA=0, doble=0;
		numA=pedirNumero(numA);
		doble=dobleDelNumero(numA);
		System.out.println("El doble del número "+numA+" es igual a "+doble);*/
		
		//EJERCICIO6
		/*double radio=0, altura=0;
		char c1=' ';
		System.out.println("Introduce el radio y la altura");
		radio=Entrada.real();
		altura=Entrada.real();
		System.out.println("¿Qué quieres calcular?('a' area/'v'volumen)");
		c1=Entrada.caracter();
		System.out.println(areaOVolumenCilindro(radio,altura,c1));*/
		
		
		
		//EJERCICIO7
		int numA=0;
		numA=pedirNumero(numA);
		if(numeroPrimo(numA) ){
			System.out.println("El número es primo");
		}
		else {
			System.out.println("El número no es primo");
		}

	}
		
	//FUNCION1
	public static void moduloEjecutandose(int n) {
		while(n!=0) {
			System.out.println("Módulo Ejecutandose");
			n--;
		}	
	}
	//FUNCION2
	public static int maximoDosNumeros(int numero1, int numero2) {
		if(numero1>numero2) {
			return numero1;
		}
		else
			return numero2;	
	}
	//FUNCION3
	public static int maximoTresNumeros(int num1, int num2, int num3 ) {
		return maximoDosNumeros(maximoDosNumeros(num1,num2),num3);
		}
	//FUNCION4
	public static void numerosComprendidos(int num1, int num2) {
		while(num1<=num2) {
			System.out.println(num1);
			num1++;
		}
	}
	//FUNCION5
	public static int dobleDelNumero(int num1) {
		int doble=num1*2;
		return doble;
	}
	//FUNCION6
	public static double areaOVolumenCilindro (double radio, double altura, char areaVolumen) {
			
			double area=0, volumen=0;
			
			if(areaVolumen=='a') {
				area=2*Math.PI*radio*altura+2*Math.PI*Math.pow(radio,2);
				return area;
			}else {
				if(areaVolumen=='v') {
					volumen=Math.PI*Math.pow(radio, 2)*altura;
					return volumen;
				}else {
					return 0;
				}
			}
		}

	//FUNCION7
	public static boolean numeroPrimo(int numero) {
		int i=2;
		boolean primo;
		while(i<=(numero/2) && numero%i!=0) {
			i++;
		}
		if(i>numero/2) {
			primo=true;
			return primo;
		}
		else {
			primo=false;
			return primo;
		}
	}
	//pedirNumero
	public static int pedirNumero(int numero) {
		System.out.println("Introduce un número");
		numero=Entrada.entero();
		return numero;
	}
	public static double caculaAreaCilindro(double radio, double altura) {
		double area=0;
		area=2*Math.PI*radio*altura+2*Math.PI*Math.pow(radio,2);
		return area;
	}
	public static double calculaVolumenCilindro(double radio, double altura) {
		double volumen=0;
		volumen=Math.PI*Math.pow(radio, 2)*altura;
		return volumen;
	}
		
	}

