package prueba;
import java.util.Scanner;

public class Edad {


		private static Scanner entrada;

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			entrada = new Scanner(System.in);
			
			System.out.println("Hola, Introduza la edad que tiene actualmente, por favor:");
			
			int edad=entrada.nextInt();
			
			if (edad<18) {
				System.out.println("Eres un adolescente, disfruta");
			}
			
			else if(edad<40) {
				System.out.println("Eres joven, pero no descontroles");
			}
			
			else if(edad<65) {
				
				System.out.println("Eres maduro y muy sabio.");
			}
			
			else {
				
				System.out.println("Cuidate, pero disfruta lo más que puedas");
			}
	}
			
	}


