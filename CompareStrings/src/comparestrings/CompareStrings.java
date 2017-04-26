/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparestrings;

import java.util.Scanner;
/**
 *
 * @author AudiGS
 */
public class CompareStrings{
    
    public static void main(String[] args){
        
        String aNombre = "Audel";
        
        String anotherNombre;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Escribe tu nombre > ");
        
        anotherNombre = input.nextLine();
        
        if(aNombre.equals(anotherNombre))
            
        System.out.println(aNombre + " Ese es tu nombre " + anotherNombre);
        else
        System.out.println(aNombre + " Ese no es tu nombre ");
    }
}
    



    

