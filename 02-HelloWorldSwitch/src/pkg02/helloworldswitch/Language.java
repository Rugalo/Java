/*
 * Created by Rubén García Lozano - http://engineroom.sytes.net/
 */

package pkg02.helloworldswitch;

import java.util.Scanner;

public class Language {
    
    public static void setLanguage(){
        int lang = 0;
        Scanner second = new Scanner(System.in);
              
        System.out.println("[1]. Español\n[2]. Deutsch\n[3]. Français\n[4]. Italiano\n[5]. 中國\n[6]. 日本");
        lang = second.nextInt();
        
        switch(lang) {
            case 1:
            System.out.println("Hola mundo!");
            break;
            
            case 2:
            System.out.println("Hallo Welt!");
            break;
                
            case 3:
            System.out.println("Bonjour le monde!");
            break;
                
            case 4:
            System.out.println("Ciao mondo!");
            break;
                
            case 5:
            System.out.println("你好世界!");
            break;
                
            case 6:
            System.out.println("こんにちは世界!");
            break;    

            default:
            System.out.println("Please enter a number from 1 to 6");
            break;
        }
        
    }

}
