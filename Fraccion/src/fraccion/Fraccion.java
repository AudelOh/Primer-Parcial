
package fraccion;

/**
 *
 * @author AudiGS
 */
public class Fraccion {
    
     private int num;
     private int den;
     
  public Fraccion() {
      
     num=0;
     den=1;
  }
  public Fraccion(int x, int y) {
      
     num=x;
     den=y;
  }
  public static Fraccion sumar(Fraccion a, Fraccion b){
     Fraccion c=new Fraccion();
     c.num=a.num*b.den+b.num*a.den;
     c.den=a.den*b.den;
     return c;
  }
  public static Fraccion restar(Fraccion a, Fraccion b){
     Fraccion c=new Fraccion();
     c.num=a.num*b.den-b.num*a.den;
     c.den=a.den*b.den;
     return c;
  }
 // public static Fraccion multiplicar(Fraccion a, Fraccion b){
 //  return new Fraccion(a.num*b.num, a.den*b.den);
 //}


  private int mcd(){
      
     int u=Math.abs(num);
     int v=Math.abs(den);
     if(v==0){
          return u;
     }
     int r;
     while(v!=0){
          r=u%v;
          u=v;
          v=r;
     }
     return u;
  }

  public String toString(){
      
     String texto=num+" / "+den;
     return texto;
  }


}