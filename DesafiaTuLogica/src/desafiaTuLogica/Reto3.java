package desafiaTuLogica;

public class Reto3 {
	public static void main(String[] args) {
		//Vamos a contar los multiplos de cada uno, asi que ponemos variables para contar
		int multiplosDeDos = 0;
		int multiplosDeTres = 0;
		//Multiplos del 2 con su comprobacion y contador
		System.out.println("Los multiplos de 2 son:");
		for (int i = 0; i <= 100; i++) {
			if (i%2 == 0) {
				System.out.println(i);
				multiplosDeDos++;
			}
		}
		
		//Multiplos del 3 con su comprobacion y contador
		System.out.println("Los multiplos de 3 son:");
		for (int x = 0; x < 100; x++) {
			if (x%3 == 0) {
				System.out.println(x);
				multiplosDeTres++;
			}
		}
		
		System.out.println("Hay un total de "+multiplosDeDos+" multiplos de 2 y de "+multiplosDeTres+" multiplos de 3");
	}
}
