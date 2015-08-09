/*
 * Created by Rubén García Lozano - http://engineroom.sytes.net/
 */

package pkg02.helloworldswitch;

import java.util.Scanner;

public class HelloWorldSwitch {

    public static void main(String[] args) {
        int choice = 0;
        String answer;
        
        Scanner first = new Scanner(System.in);
        Scanner third = new Scanner(System.in);
        
        Language languag = new Language();
        
        System.out.println("Please choose the Hello World version: ");
        System.out.println("[1]. English mode \n[2]. Multilanguage mode");
        choice = first.nextInt();
        
        switch(choice) {
            case 1:
            System.out.println("Hello world!");
            break;
            
            case 2:
            languag.setLanguage();
            break;
                
            default:
            System.out.println("Please enter a number from 1 to 2.");
            break;
                
        }
        
        System.out.println("Do you want to read it in another language? (Y/N)");
        answer = third.next();
        
        if (answer.equalsIgnoreCase("Y")) {
            languag.setLanguage();
        } else {
            System.out.println("Bye!");                
        }
    }
}

