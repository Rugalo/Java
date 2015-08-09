/*
 * Created by Rubén García Lozano - http://engineroom.sytes.net/
 */

package pkg07.password;

import java.util.Scanner;


public class Password {

    public static void main(String[] args) {
        User user = new User();
        Pass passw = new Pass();
        
        System.out.println("|||Bienvenido a la página de registro de usuario|||");
        setEnter();
        user.setNombre();
        setEnter();
        passw.setPassword();
        
    }
    
    public static void setEnter(){
        System.out.println("Presiona ENTER para continuar...");
        Scanner teclado = new Scanner(System.in);
        teclado.nextLine();
    }

}

