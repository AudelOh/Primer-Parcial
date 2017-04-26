
package vehiculo;


public abstract class Vehiculo {
    private Integer modelo;
    private Marca marca;
    private String noSerie;
    private String placa;
    private Float valorFactura;

    public Vehiculo(Integer mo, Marca m, String noS, String p, Float vFact) {
        this.modelo = mo;
        this.marca = m;
        this.noSerie = noS;
        this.placa = p;
        this.valorFactura = vFact;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Float getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(Float valorFactura) {
        this.valorFactura = valorFactura;
    }
    
    public abstract Float calcularTenencia();
    public double baseGrabable(){
        return modelo >=2007?0.005:0.02;
    }
    public abstract class Carga extends Vehiculo{
        private Integer toneladas;
        private Boolean publico;
        
        public Carga(Integer mo, Marca m, String noS, String p, Float vFact,Integer ton, Boolean pu) {
            super(mo, m, noS, p, vFact);
            this.toneladas = ton;
            this.publico = pu;
        }
        public double baseGravable(){
            if(!publico){
                return super.baseGrabable();
            }else{
               return modelo>=2007?0.03:0.01; 
            }
        }

        public Integer getToneladas() {
            return toneladas;
        }

        public void setToneladas(Integer toneladas) {
            this.toneladas = toneladas;
        }

        public Boolean getPublico() {
            return publico;
        }

        public void setPublico(Boolean publico) {
            this.publico = publico;
        }
        
        public Float calcularTenencia(){
            return getvalorFactura()*baseGravable*(1+(gettoneladas()/10));
            
        }
        public class Camioneta extends Carga{
            
            public Camioneta(Integer mo, Marca m, String noS, String p, Float vFact, Integer ton, Boolean pu) {
                super(mo, m, noS, p, vFact, ton, pu);
            }
            
        }
        public class Camion extends Carga{
            
            public Camion(Integer mo, Marca m, String noS, String p, Float vFact, Integer ton, Boolean pu) {
                super(mo, m, noS, p, vFact, ton, pu);
            }
            private Integer ejes;
            public double baseGravable(){
                return super baseGravable()+ (ejes*0.001);
            }
            
        }
        
        
        
        
    }
}
    
    
    
    
    
            
    


    

