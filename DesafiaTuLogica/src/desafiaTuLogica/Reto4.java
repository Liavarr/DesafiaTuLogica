package desafiaTuLogica;

import java.util.Scanner;

public class Reto4 {
	public static void main(String[] args) {
		String condicion = "Si";
		String bucleOrden = "Si";
		int temp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//Entramos al bucle para pedirle al usuario los numeros hasta que los ponga bien
		while (condicion=="Si") {
			System.out.println("Introduce los 3 numeros:");
			System.out.println("Primero:");
			int numero1 = sc.nextInt();
			System.out.println("Segundo");
			int numero2 = sc.nextInt();
			System.out.println("Tercero:");
			int numero3 = sc.nextInt();
		
			
			//Comprobamos que los numeros sean diferentes y si no lo es dice que lo haga de nuevo
			if (numero1 != numero2 & numero1 != numero3 & numero2 != numero3) {
				System.out.println("Por favor indica si quieres ordenar de mayor a menor (1) o de menor a mayor (2)");	
				
				//Entramos en el bucle para validar que está poniendo un orden correcto
				while (bucleOrden=="Si") {
					int condicionOrden = sc.nextInt();
					//Orden de mayor a menor:
					if (condicionOrden == 1) {
						
						if (numero1<numero2){
							temp = numero1;
							numero1 = numero2;
							numero2 = temp;
						}
						
						if (numero2<numero3){
							temp = numero2;
							numero2 = numero3;
							numero3 = temp;
						}
						
						if (numero1<numero2){
							temp = numero1;
							numero1 = numero2;
							numero2 = temp;
						}
						System.out.println("El orden de mayor a menor es primero: "+numero1+", segundo: "+numero2+" y por ultimo: "+numero3);
						bucleOrden="No";
						condicion="No";
					//Orden de menor a mayor
					} else if (condicionOrden == 2){
						if (numero1>numero2){
							temp = numero1;
							numero1 = numero2;
							numero2 = temp;
						}
						
						if (numero2>numero3){
							temp = numero2;
							numero2 = numero3;
							numero3 = temp;
						}
						
						if (numero1>numero2){
							temp = numero1;
							numero1 = numero2;
							numero2 = temp;
						}
						System.out.println("El orden de menor a mayor es primero: "+numero1+", segundo: "+numero2+" y por ultimo: "+numero3);
						
						bucleOrden="No";
						condicion="No";
					} else {
						System.out.println("Has introducido un valor no valido, intentalo de nuevo, mayor a menor (1); mayor a menor (2)");
					}
				}
				
				
			} else {
				System.out.println("Por favor introduce números con valores diferentes");
			}
			
		}
		
		System.out.println("Programa finalizado, ¡¡¡gracias!!!");
	}
}
