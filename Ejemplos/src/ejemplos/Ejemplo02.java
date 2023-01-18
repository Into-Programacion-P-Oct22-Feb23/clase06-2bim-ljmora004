
package ejemplos;

import java.util.Scanner;
import java.security.SecureRandom;
// import java.security.*;

/**
 *
 * Luis Mora
 */
public class Ejemplo02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el limite de los valores aleatorios:");
        int limite = entrada.nextInt();

        if (limite >= 0) {
            int valorA = obtenerNumero(limite); // 3
            int valorB = obtenerNumero(limite); // 2
            int suma = obtnerSuma(valorA, valorB);
            System.out.printf("La suma de %d + %d es igual a: %d\n",
                    valorA,
                    valorB,
                    suma);
        }else{
            System.out.println("Error, solo se pueden ingresar numeros enteros"
                    + " positivos.");
        }

    }

    public static int obtenerNumero(int limite) {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();

        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(limite);
        return valorAleatorio;
    }

    public static int obtnerSuma(int a, int b) {
        return a + b;
    }

}
