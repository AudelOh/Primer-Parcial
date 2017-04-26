
package dobledelnumero;

import java.util.Scanner;

/**
 *
 * @author AudiGS
 */
public class DobleDelNumero {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        int numero;
        System.out.println("Introduce un numero entero: ");
        numero = sc.nextInt();
        System.out.println("El numero que escribiste es: "+numero);
        System.out.println("El doble es "+" = " +2*numero);
        System.out.println("El triple es"+" = " +3*numero);
        
        
    }
    
}
