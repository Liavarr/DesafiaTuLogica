package desafiaTuLogica;

import java.util.Scanner;

public class Reto2 {
	public static void main(String[] args) {
		//Declaramos la variable para entrar al bucle y la cantidad de numeros que queremos mostrar
		boolean condicion = true;
		int numerosMostrados = 20;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero positivo:");
		//Comenzamos el bucle
		while (condicion = true) {
			int numero = sc.nextInt();
			//Verificamos que sea positivo
			if (numero >= 0) {
				System.out.println("Los siguientes 20 numeros consecutivos son:");
				
				//Entramos al bucle para mostrar los numeros
				for (int i = numero+1; i <= numero+numerosMostrados; i++) {
					System.out.println(i);
				}
				//Al haberse cumplido todo pasamos la condicion a false para cerrar el bucle
				condicion = false;
				
			} else {
				System.out.println("Eso no es positivo, introduce un numero positivo, por favor:");
			}
		}
		sc.close();
	}
}
