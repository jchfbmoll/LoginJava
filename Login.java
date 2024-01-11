/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;

import java.util.Scanner;
/**
 *
 * @author joch
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        boolean login = false;
        
        for (int i = 1; i<=3 && !login; i++){
            
            System.out.println("Introdueix l'user");
            String user = sc.nextLine();
            System.out.println("Introdueix el pass");
            String pass = sc.nextLine();
            
            login=isLoginCorrecte(user, pass, i);
                        
        }

        if (login){
            
            System.out.println("Login Correcte");
            
        } else{
            
            System.out.println("See u Later, Alligater");
        }
        
        
            
        
    }
    
    private static boolean isLoginCorrecte(String user, String pass, int intents){
        
            if (user.equals("usuari1") && pass.equals("asdfg")){
                
                return true;
                
            }
            System.out.println("El nombre d'intents és " + intents);
            return false;
    }
}

