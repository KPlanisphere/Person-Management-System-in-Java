//--------> Principal

import java.util.Scanner;

class Principal{
	
	public static void main(String[] args){
		TPersona personas[];
		int n,edad;
		String nombre;
		Scanner sc1 = new Scanner(System.in); //NUMEROS
		Scanner sc2 = new Scanner(System.in); //CADENAS
		
		System.out.println("Mini Agenda");
		System.out.print("Cuantos datos deseas ingresar: ");
		n = sc1.nextInt();
		personas = new TPersona[n];
		
		System.out.println("Ingresa los datos:");
		
		for(int i=0; i<n ; i++){
			System.out.print("Dame el dato de la persona " + (i+1) + ": ");
			nombre = sc2.nextLine();
			System.out.print("Dame la edad de la persona " + (i+1) + ": ");
			edad = sc1.nextInt();
			personas[i] = new TPersona(nombre,edad);
			
		}
		
		System.out.println("\nLos datos ingresados son:");
		for(int i=0;i<n;i++){
			System.out.println(personas[i].toString());
		}
	}//FIN MAIN
	
}//FIN CLASE Principal
