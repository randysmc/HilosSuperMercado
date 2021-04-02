/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author randysmc
 */
public class Cliente extends Persona{
    
    private int [] carritoCompras;

    public Cliente(int[] carritoCompras, String nombre) {
        super(nombre);
        this.carritoCompras = carritoCompras;
    }
    
    public int getTiempoEnCaja(){
        int tiempoEnCaja =0;
        for(int i=0; i<carritoCompras.length; i++){
            int carrito = carritoCompras[i];
            tiempoEnCaja += carrito;
        }
        return tiempoEnCaja;
    }

    public int[] getCarritoCompras() {
        return carritoCompras;
    }

    public void setCarritoCompras(int[] carritoCompras) {
        this.carritoCompras = carritoCompras;
    }
    
    
    
    
    
}
