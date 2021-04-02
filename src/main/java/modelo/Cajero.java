
package modelo;

import enums.EstadoCaja;

public class Cajero extends Persona{
    
    private int numCajero;
    private int tiempoAtendiendo;
    private EstadoCaja estado;

    public Cajero(String nombre, int numCajero, int tiempoAtendiendo, EstadoCaja estado) {
        super(nombre);
        this.numCajero = numCajero;
        this.tiempoAtendiendo = tiempoAtendiendo;
        this.estado = estado;
    }
    
    public Cajero(String nombre, int numCajero){
        super(nombre);
        this.numCajero = numCajero;
    }



    public int getNumCajero() {
        return numCajero;
    }

    public void setNumCajero(int numCajero) {
        this.numCajero = numCajero;
    }

    public int getTiempoAtendiendo() {
        return tiempoAtendiendo;
    }

    public void setTiempoAtendiendo(int tiempoAtendiendo) {
        this.tiempoAtendiendo = tiempoAtendiendo;
    }

    public EstadoCaja getEstado() {
        return estado;
    }

    public void setEstado(EstadoCaja estado) {
        this.estado = estado;
    }
    
    
    

    
    
    
    
}
