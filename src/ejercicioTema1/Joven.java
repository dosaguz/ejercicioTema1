package ejercicioTema1;

public class Joven {
	static int edad=10;
	static int nivelDeEstudios=4;
	static int nivelDeIngresos=300000;
	static boolean jasp;

	
	public static void ejercicio6() {
		int i = 0x100;
		i>>>= 1;
		System.out.println(i);
		
	}
	public static void ejercicio5()	{

		
		if (edad <= 28 && nivelDeEstudios > 3 && nivelDeIngresos > 28000 ) {
			jasp = true;
		}
		System.out.println(jasp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio5();
		ejercicio6();
	}

}
