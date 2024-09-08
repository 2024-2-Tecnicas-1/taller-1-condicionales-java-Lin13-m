
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        // TODO: Coloca aquí el código del ejercicio 4: Letra o número

        if (!(Character.isLetter(caracter) || Character.isDigit(caracter))) {
            System.out.println("No es letra ni número");

        }

        if (Character.isDigit(caracter)) {
            System.out.println("Es numero");
        } else if (Character.isUpperCase(caracter)) {
            System.out.println("Es letra mayúscula");
        }
        if (Character.isLowerCase(caracter)) {
            System.out.println("Es letra minúscula");
        }

        return "";
    }

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
