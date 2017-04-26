/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcentajes;

import java.util.Scanner;

/**
 *
 * @author AudiGS
 
 */

public class Porcentajes {
    
public static void main(String[]args){
    int num;
        int porcentaje;
        double rpta;
                
        Scanner scanner = new Scanner(System.in);        
        
        num = scanner.nextInt();
        System.out.print("Ingrese un numero para b: ");   
        num = scanner.nextInt();
        System.out.print("Ingrese el porcentaje de a (%): ");   
        porcentaje = scanner.nextInt();
        System.out.print("Ingrese el porcentaje de b (%): ");   
        porcentaje = scanner.nextInt();
        rpta = num*porcentaje /100.0;
        System.out.println("El " + porcentaje+ " % de a "+ 
                num + " es " + rpta); 
        rpta = num*porcentaje /100.0;
        System.out.println("El " + porcentaje + " % de b "+ 
                num + " es " + rpta); 


    }
      
   
           
}

   
    
     

    
        // TODO code application logic here
    
     

