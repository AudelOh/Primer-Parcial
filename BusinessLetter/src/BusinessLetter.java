
import javax.swing.JOptionPane;

/**
 *
 * @author AudiGS
 */

public class BusinessLetter{
    
public static void main(String[] args){
    
    String Nombre;
    String SobreNombre = "";
    String Apellido = "";
    int x;
    char c;
    Nombre = JOptionPane.showInputDialog(null,
    "Por favor escriba el nombre a quien va dirigido");
    x = 0;
    while(x < Nombre.length()){
        
      
        if(Nombre.charAt(x) == ' '){
             
            Apellido = Nombre.substring(0, x);
            Apellido = Nombre.substring(x + 1, Nombre.length());
            x = Nombre.length();
        }
    ++x;
    }
JOptionPane.showMessageDialog(null,
"Querido " +Nombre+
",\nEstoy contento de que estemos platicando" +
"\nporque me gustaria tener la oportunidad de" +
"\ntratar con usted hacerca de un aumento de salario" +
"\nespero considere me rendimiento en la empresa  ingeniero" +Nombre+ 
"\nEn caso de querer comunicarse conmigo este es mi numero telefonico" +
"\n 044 951-321-28-53.");
}
}
    

