import java.util.Scanner;

/** 5. Algoritmo que sume los n primeros n�meros enteros, siendo n un n�mero 
introducido por el usuario.*/

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		int num = teclado.nextInt();
		
		for (int i=0; i<=num; i++) {
			System.out.println(i);
		}
		
	}

}
