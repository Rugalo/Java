/*
 * Created by Rubén García Lozano - http://engineroom.sytes.net/
 */

package pkg06.ifelse;

import java.util.Scanner;


public class IfElse {

    public static void presionaEnter() {
        System.out.println("Presiona ENTER para continuar...");
        Scanner teclado = new Scanner(System.in);
        teclado.nextLine();
    }
    
    public static void main(String[] args) {

        Scanner primero = new Scanner(System.in);
        int x, y, z;
        String d;
        
        System.out.println(":::INTRODUCCIÓN DE DATOS:::");
        
        presionaEnter();
        
        System.out.println("Introduce primer numero: ");
        x = primero.nextInt();
        System.out.println("El numero introducido es el " +x);
        System.out.println("Introduce segundo numero: ");
        y = primero.nextInt();
        System.out.println("El numero introducido es el " +y);
        
        presionaEnter();

        
        z = x + y;
        
        if(z > 0) {
            System.out.println("El resultado es "+z+", es mayor que 0.");
        }
        else {
            System.out.println("El resultado es "+z+", es menor que 0.");
        }
    }

}
