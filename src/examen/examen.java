package examen;

import java.util.Scanner;
public class examen {
	public static void main(String args) {
		int menu = 0;
		Scanner menu1 = new Scanner(System.in);
		menu = menu1.nextInt();
		menu();
		int option = menu; 
	}
		public static void menu() {
			System.out.println("Elige 1 para calcular el área de un triángulo");
			System.out.println("Elige 2 para calcular el área de un trapecio");
			System.out.println("Elige 3 para calcular el área de un rectángulo");
			System.out.println("Elige 4 para salir");
	} 
		public static double calcularAreaTriangulo(double base, double altura) {
			return (base * altura / 2);
		}
		public static double calcularAreaRectángulo(double base, double altura) {
			return base * altura;
		} 
		public static double calcularAreaTrapecio(double base, double base1, double base2) {
			return (base1 + base2) / 2;
		}
}
