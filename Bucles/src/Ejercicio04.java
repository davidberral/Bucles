import java.util.Scanner;

/** 4. Algoritmo que escriba los números impares comprendidos entre dos enteros 
introducidos por el usuario.*/

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int num1 = teclado.nextInt();
		System.out.println("introduce otro numero: ");
		int num2 = teclado.nextInt();
		
		for(int i=num1;i<=num2;i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
					
	}

}
