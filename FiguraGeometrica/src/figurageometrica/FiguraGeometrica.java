
package figurageometrica;

/**
 *
 * @author AudiGS
 */
public abstract class FiguraGeometrica {
    private Double altura;
    private Double ancho;
    private Figura figura;
    private Double area;

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    

    public static class Figura {

        public Figura() {
        }
        
        
    }
    public class Cuadrado extends FiguraGeometrica{
    public Double area (){
        return altura*ancho;
    }

        private void setAltura(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setAncho(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    public class Triangulo extends FiguraGeometrica{
        public Double area(){
            return ancho*altura/2;
        }

        private void setAltura(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setAncho(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    public void main(){
        Cuadrado a =new Cuadrado();
        
        a.setAltura(5);
        a.setAncho(5);
        
        System.out.println(a.area());
        
        Triangulo b = new Triangulo();
            b.setAltura(5);
            b.setAncho(2);
            
            System.out.println(b.area());
        
            
    }
}

    

    
    
    

