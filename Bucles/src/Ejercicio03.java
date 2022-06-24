import java.util.Scanner;

/** 3. Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
comprendido entre uno y diez, introducido por el usuario, usando un esquema do 
while. Nota: En los tres ejercicios anteriores, el programa ha de controlar mediante 
un esquema do-while, que el número está comprendido entre 1 y 10. */

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("tablas de multiplicar");
		System.out.println("Introduce un numero del 1 al 10");
		int num = teclado.nextInt();
		int i = 1;
		
				
		do {			
			System.out.printf("%d x %d = %d\n", num, i, num*i);
			i++;
	    } while (i <= 10);

	}

}
