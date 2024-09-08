package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        if ((numVictoriasA == 3 && numVictoriasB == 7) || (numVictoriasB == 7 && numVictoriasA == 3) || (numVictoriasA == 0 && numVictoriasB == 7) || (numVictoriasB == 0 && numVictoriasA == 7) || 
        (numVictoriasA == 8 || numVictoriasB == 8) || (numVictoriasA > 7 || numVictoriasB > 7)) {
        return "Inválido";
         
    }
     if ((numVictoriasA >= 6 && numVictoriasA - numVictoriasB >= 2) || (numVictoriasA==7 && numVictoriasB==6) ) {
         System.out.println("Ganó A");         
         
    }
    if ((numVictoriasB >= 6 && numVictoriasB - numVictoriasA >= 2)||(numVictoriasA==6 && numVictoriasB==7) ) {
         System.out.println("Ganó B");  
         
    }
    
    if ((numVictoriasA < 6 && numVictoriasB < 6) || (numVictoriasA == 5 && numVictoriasB == 5) || (numVictoriasA == 6 && numVictoriasB == 5) || (numVictoriasA == 5 && numVictoriasB == 6) || 
        (numVictoriasA == 6 && numVictoriasB == 6)) {
        System.out.println("Aún no termina");
        
    }
    return "";

    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
