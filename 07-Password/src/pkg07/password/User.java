/*
 * Created by Rubén García Lozano - http://engineroom.sytes.net/
 */

package pkg07.password;

import java.util.Scanner;


public class User {
    String nombreusuario, respuesta;
    Scanner introduce = new Scanner(System.in);
    
    public void setNombre() {
      System.out.println("Introduce el nombre de usuario: ");
      nombreusuario = introduce.next();
      System.out.println("El nombre de usuario introducido es: " +nombreusuario);

    }    
}
