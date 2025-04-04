package Sesion01;

/**
 *
 * @author bryan
 */
public class Televisor {
    public int canal;
    public String marca;
    public int volumen;
    public int brillo;
    public String modelo;
    public boolean encendido;
    
    public void setCanal (int canal) {
        this.canal = canal;
    }
    
    public void encender () {
        this.encendido = true;
        System.out.println("Televisor encendido");
    }
    
    public void apagar () {
        this.encendido = false;
        System.out.println("Televisor apagado");
    }
    
    public void avanzarCanal () {
        this.canal += 1;
        System.out.println("El nuevo canal es " + this.canal);
    }
    
    public void subirVolumen () {
        this.volumen += 1;
        System.out.println("El nuevo volumen es " + this.volumen);
    }
            
}
