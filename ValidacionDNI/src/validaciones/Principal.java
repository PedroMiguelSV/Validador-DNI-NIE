package validaciones;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué documento quieres validar?");
		System.out.println("1.- DNI");
		System.out.println("2.- NIE");
		int option = sc.nextInt();
		sc.nextLine();
		boolean correct=false;
		boolean error=false;
		
		switch(option) {
			case 1:
				System.out.println("Introduce el documento a validar en formato nnnnnnnn-A");
				String DNI = sc.nextLine();
				correct = ValidacionDNI.validar(DNI);
				break;
			case 2:
				System.out.println("Introduce el documento a validar en formato Snnnnnnn-A");
				String NIE = sc.nextLine();
	            System.out.println("letra: " + NIE);

				correct = ValidacionNIE.validar(NIE);
				break;
			default:
				System.out.println("Lo sentimos, la opción elegida no es válida");
				error=true;
		}
		
		if(correct && !error) {
			System.out.println("El documento introducido es CORRECTO");
		}else {
			if(!correct && !error) {
				System.out.println("El documento introducido es INCORRECTO");
			}
		}
	}

}
