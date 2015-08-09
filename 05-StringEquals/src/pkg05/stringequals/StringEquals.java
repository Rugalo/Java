/*
 * Created by Rubén García Lozano - http://engineroom.sytes.net/
 */

package pkg05.stringequals;

import java.util.Scanner;


public class StringEquals {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("AZUL, ROJO, AMARILLO, VERDE...¿Cual es mi color favorito?");
        String color = scan.next();
        
        System.out.println(color);
        
        if(color.equalsIgnoreCase("AZUL")) {
            System.out.println("CORRECTO!!!");            
        } else {
            System.out.println("ESE NO ERA..."); 
        }

    }

}
