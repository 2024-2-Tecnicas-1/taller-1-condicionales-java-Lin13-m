package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Ordenamiento {

    public static String evaluar(int numero1, int numero2, int numero3, int numero4) {
        // Crear y llenar la lista con los números
        List<Integer> numeros = new ArrayList<>();
        numeros.add(numero1);
        numeros.add(numero2);
        numeros.add(numero3);
        numeros.add(numero4);

        // Ordenar la lista
        Collections.sort(numeros);

        // Convertir la lista ordenada a una cadena
        return numeros.toString();
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1:");
        int numero1 = lector.nextInt();
        System.out.print("Número 2:");
        int numero2 = lector.nextInt();
        System.out.print("Número 3:");
        int numero3 = lector.nextInt();
        System.out.print("Número 4:");
        int numero4 = lector.nextInt();
        
        String respuesta = evaluar(numero1, numero2, numero3, numero4);
        System.out.println(respuesta);
    }
}
