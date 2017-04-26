
package gasprices;

import java.util.Scanner;

/**
 *
 * @author AudiGS
 */
public class GasPrices {


    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      double galones, gasolina;
      System.out.println("Introduce la cantidad de galones que necesita:");
      galones = sc.nextDouble();
      System.out.println("Recuarda de que el litro por galon es de $4.00");
      gasolina = (4.00 * galones );
      System.out.println("Por "+galones +" galones son = $" + gasolina );
    
    }
    
}
