/*
 * Created by Rubén García Lozano - http://engineroom.sytes.net/
 */

package pkg07.password;

import java.util.Scanner;


public class Pass {
    String pass1, pass2;
    
    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    
    public void setPassword() {
        
    System.out.println("Introduce la contraseña: ");
    String pass1 = scan1.next();
        
    System.out.println("Vuelve a introducir la contraseña: ");
    String pass2 = scan2.next();
        
    if(pass1.equals(pass2)) {
        System.out.println("Correcto");            
    } else {
        System.out.println("Las contraseñas no coinciden"); 
        setPassword();
    }
}
}