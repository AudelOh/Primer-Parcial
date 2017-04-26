/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinanumero;

import java.util.Random;

/**
 *555
 * @author AudiGS
 */
public class AdivinaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
EntradaDeTeclado teclado= new EntradaDeTeclado(); 
        Random cantidadDeNumero=new Random(); 
        boolean intentos=true;
        int valorBuscar= 1 + cantidadDeNumero.nextInt(101);//int valorBuscar= 14 + cantidadDeNumero.nextInt(70);        
        System.out.println("                 EMPECEMOS EL JUEGO                        ");
        System.out.println("SE HA GENERADO UN NUMERO ALEATORIO COMPRENDIDO ENTRE 1 Y 100\n");
        do
        {           
            System.out.println("INTRODUSCA EL VALOR HA BUSCAR: ");        
            teclado.pedirEntrada();
            int convertir=Integer.parseInt(teclado.getEntrada());
            if(convertir==(valorBuscar))
            {
                System.out.println("BIEN... HAS ACERTADO AMIGO  🙂");
                intentos=false;
            }
            else if(convertir<=valorBuscar)
            {
                System.out.println(" NO HAS HACERTADO EL NUMERO ES MAYOR. INTENTALO DE NUEVO AMIGO:\n");
                intentos=true;
            }
            else if(convertir>=valorBuscar)
            {
                System.out.println(" NO HAS HACERTADO EL NUMERO ES MENOR. INTENTALO DE NUEVO AMIGO:\n");
                intentos=true;
            }
        } while(intentos);
        // TODO code application logic here
    }

    private static class EntradaDeTeclado {

        public EntradaDeTeclado() {
        }

        private void pedirEntrada() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getEntrada() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
