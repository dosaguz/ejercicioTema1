package ejercicioTema1;

public class EjerciciosPropuestos {
	static int n1=50;
	public static void ejercicio1(){
	int n2=30, suma=0, n3=0;
	suma=n1+n2;
	System.out.println("LA SUMA ES: " + suma);
	suma=suma+n3;
	System.out.println(suma);
	}
	public static void ejercicio2(){
	int n1=50, n2=30, suma=0;
	suma=n1+n2;
	System.out.println("LA SUMA ES: " + suma);
	}
	public static void ejercicio3(){
		int numero=3,
		cuad = numero*numero;
		System.out.println(numero+ " al cuadrado es: " + cuad);
		}
	
	public static void ejercicio5(){
		int radio = 3;
		double radio2 = 5.2;
		final double pi = Math.PI;
		System.out.println(2*pi*radio);
		System.out.println(pi*(radio2*radio2));
		}
	
	public static void ejercicio7(){
		System.out.println("Me gusta la programación");
		System.out.println("Cada dia mas");
	}
	public static void ejercicio8() {
		char caracter = (char) ((Math.random()*26)+65);
		char[] vocales = { 'A', 'E', 'I', 'O', 'U' };
		char[] consonantes = {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
		System.out.println(caracter);

		for (int vocal : vocales) {
			if (vocal == caracter )
			System.out.println("Es una vocal");
		}
		for (int consonante : consonantes) {
			if (consonante == caracter )
			System.out.println("Es una consonante");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio5();
		//ejercicio7();
		ejercicio8();
	}

}
