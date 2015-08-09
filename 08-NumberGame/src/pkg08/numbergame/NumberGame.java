/*
 * Created by Rubén García Lozano - http://engineroom.sytes.net/
 */

package pkg08.numbergame;

import java.util.Scanner;

public class NumberGame {

   public static void main(String args[]) {

      Scanner in = new Scanner(System.in);
      int numero;
      int valor;
      int contador = 0;
      boolean ganar = false;

      System.out.print("---------------------------------------------");
      System.out.print("          BIENVENIDO A Juego Azar           ");
      System.out.print("---------------------------------------------");

      numero = 1 + (int) (Math.random() * 10);

      System.out.print("\nGenerando un numero entre 1 y 10 para que lo intente adivinar...");
      System.out.print("\n-------------------------------------------");

      do {
         contador++;
         System.out.print("\nIntroduzca un numero ");
         valor = in.nextInt(); //Leemos el número escrito
         if (valor == numero) {
            System.out.print("¡Felicidades, HA GANADO con " + contador + " intentos!");
            ganar = true;
         } else {
            String temp = "";
            if (numero > valor) {
               temp = "mayor";
            } else {
               temp = "menor";
            }
            System.out.print("el numero secreto es " + temp + " que " + valor);
         }
      } while (contador < 6 && ganar == false); //Cerramos el ciclo 'DO' - 'CONTADOR<6' representa el nº de oportunidades del jugador
      if (ganar == false) {
         System.out.print("Lo siento, HA PERDIDO, el número secreto era el " + numero + " .");

      }
   }

}
