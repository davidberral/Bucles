import java.util.Scanner;

/** 2. Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
comprendido entre uno y diez, introducido por el usuario, usando un esquema 
while. */

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("tablas de multiplicar");
		System.out.println("Introduce un numero del 1 al 10");
		int num = teclado.nextInt();
		int i = 1;
		
		while (i <= 10) {			
				
		System.out.printf("%d x %d = %d\n", num, i, num*i);
		i++;
	    }
	

	}

}
