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

	
	public static void ejercicio11() {
		int t = 60;
		System.out.println("Son "+ t/3600 +"h, " + ((t%3600)/60) +" min y "+ ((t%3600)%60) +" s.");
	}

	public static void ejercicio8_2() {
		char caracter = (char) ((Math.random()*26)+65);
		char[] vocales = { 'A', 'E', 'I', 'O', 'U' };
		String s = "Es una consonante";
		System.out.println(caracter);
		
		
		for (int vocal : vocales) {
			if (vocal == caracter ) {
				s = "Es una vocal";
			}
		}
		System.out.println(s);
		

	}
	public static void ejercicio12() {
		int imp = 232, b500 = 0,b200 = 0,b100 = 0,b50 = 0,b20 = 0,b10 = 0,b5 = 0,resto = 0;
		
		System.out.println("Del importe: "+ imp);
		
		while (imp >= 5){
			if (imp>500) {
				b500+=1;
				imp-=500;
			}
			else if(imp>=200){
				b200+=1;
				imp-=200;
			}
			else if(imp>=100){
				b100+=1;
				imp-=100;
			}
			else if(imp>=50){
				b50+=1;
				imp-=50;
			}
			else if(imp>=20){
				b20+=1;
				imp-=20;
			}
			else if(imp>=10){
				b10+=1;
				imp-=10;
			}
			else if(imp>=5){
				b200+=1;
				imp-=5;
			}
	}
		resto = imp;

		System.out.println("Billetes de 500: "+ b500);
		System.out.println("Billetes de 200: "+ b200);
		System.out.println("Billetes de 100: "+ b100);
		System.out.println("Billetes de 50: "+ b50);
		System.out.println("Billetes de 20: "+ b20);
		System.out.println("Billetes de 10: "+ b10);
		System.out.println("Billetes de 5: "+ b5);
		System.out.println("Resto: "+ resto);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio5();
		//ejercicio7();
		//ejercicio8();
		ejercicio12();

		//ejercicio8_2();
	}

}