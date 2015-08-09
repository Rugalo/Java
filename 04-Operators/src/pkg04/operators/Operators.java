/*
 * Created by Rubén García Lozano - http://engineroom.sytes.net/
 */

package pkg04.operators;

import java.util.Scanner;

public class Operators {
    
    //Metodo para presionar ENTER para continuar
    public static void presionaEnter() {
        System.out.println("Presiona ENTER para continuar...");
        Scanner teclado = new Scanner(System.in);
        teclado.nextLine();
    }
    
    public static void main(String[] args) {
        //Clase Scanner, permite introducir datos
        Scanner teclado = new Scanner (System.in);
        
        //Declaración de variables
        int x, y, z, a, b, c, d;
        int resultado;
        boolean resultado2;
        
        //Introducción de valores
        System.out.println(":::INTRODUCCIÓN DE DATOS:::");
        System.out.println("Introduce primer numero: ");
        x = teclado.nextInt();
        System.out.println("El numero introducido es el " +x);
        System.out.println("Introduce segundo numero: ");
        y = teclado.nextInt();
        System.out.println("El numero introducido es el " +y);
        
        //Llamada al metodo presionaEnter
        presionaEnter();

        //Operadores aritméticos
        System.out.println(":::OPERADORES ARITMÉTICOS:::");
        resultado = (x + y) ;
        System.out.println("La suma es: " +resultado);
        resultado = (x - y) ;
        System.out.println("La resta es: " +resultado);
        resultado = (x * y) ;
        System.out.println("La multiplicación es: " +resultado);
        resultado = (x / y) ;
        System.out.println("La división es: " +resultado);
        resultado = (x % y) ;
        System.out.println("El resto de la división entera es: " +resultado);
        z = ++x ;
        System.out.println("++X es: " +z);
        z = y++ ;
        System.out.println("Y++ es: " +z);
        
        //Llamada al metodo presionaEnter
        presionaEnter();
        
        //Introducción de valores
        System.out.println(":::INTRODUCCIÓN DE DATOS:::");
        System.out.println("Introduce tercer numero: ");
        a = teclado.nextInt();
        System.out.println("El numero introducido es el " +a);
        System.out.println("Introduce cuarto numero: ");
        b = teclado.nextInt();
        System.out.println("El numero introducido es el " +b);
        
        //Llamada al metodo presionaEnter
        presionaEnter();
        //Operadores DE ASIGNACIÓN
        System.out.println(":::OPERADORES DE ASIGNACION:::");
        a += b;
        System.out.println("La suma es: " +a);
        a -= b;
        System.out.println("La resta es: " +a);
        a *= b;
        System.out.println("La multiplicación es: " +a);
        a /= b;
        System.out.println("La división es: " +a);
        a %= b;
        System.out.println("El resto de la división entera es: " +a);
        
        //Introducción de valores
        System.out.println(":::INTRODUCCIÓN DE DATOS:::");
        System.out.println("Introduce el numero C: ");
        c = teclado.nextInt();
        System.out.println("El numero introducido es el " +a);
        System.out.println("Introduce el numero D: ");
        d = teclado.nextInt();
        System.out.println("El numero introducido es el " +b);
        
        //Llamada al metodo presionaEnter
        presionaEnter();
        //Operadores DE RELACION
        System.out.println(":::OPERADORES DE RELACION:::");
        resultado2 = (c==d);
        System.out.println("¿C es igual que D?: " +resultado2);
        resultado2 = (c!=d);
        System.out.println("¿C es distinto que D?: " +resultado2);
        resultado2 = (c>d);
        System.out.println("¿C es mayor que D?: " +resultado2);
        resultado2 = (c<d);
        System.out.println("¿C es menor que D?: " +resultado2);
        resultado2 = (c>=d);
        System.out.println("¿C es mayor o igual que D?: " +resultado2);
        resultado2 = (c<=d);
        System.out.println("¿C es menor o igual que D?: " +resultado2);
        
        //Llamada al metodo presionaEnter
        presionaEnter();
        //Operadores LOGICOS
        System.out.println(":::OPERADORES LOGICOS:::");
        resultado2 = (c==d);
        System.out.println("¿C es igual que D?: " +resultado2);
        resultado2 = (c!=d);
        System.out.println("¿C es distinto que D?: " +resultado2);
        resultado2 = (c>d);
        System.out.println("¿C es mayor que D?: " +resultado2);
        resultado2 = (c<d);
        System.out.println("¿C es menor que D?: " +resultado2);
        resultado2 = (c>=d);
        System.out.println("¿C es mayor o igual que D?: " +resultado2);
        resultado2 = (c<=d);
        System.out.println("¿C es menor o igual que D?: " +resultado2);
        
    }

}
