/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import enums.EstadoCaja;
import modelo.Cajero;
import modelo.Cliente;

/**
 *
 * @author randysmc
 */
public class ManejadorCompra extends Thread {
    private Cliente cliente;
    private Cajero cajero;

    public ManejadorCompra(Cliente cliente, Cajero cajero) {
        this.cliente = cliente;
        this.cajero = cajero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }
    
    
    
    public void atenderCliente() throws InterruptedException{
        this.cajero.setEstado(EstadoCaja.OCUPADO);
        //System.out.println("Estado actual del cajero: " + cajero.getEstado());
        cajero.setTiempoAtendiendo(this.cliente.getTiempoEnCaja());
        System.out.println("Atendido por:" + cajero.getNombre()+ " en caja No: " +cajero.getNumCajero()
        + " al cliente: " +cliente.getNombre());
        
        for (int i = 0; i <cliente.getCarritoCompras().length; i++) {
            int compra = cliente.getCarritoCompras()[i];
            int segundos = compra*1000;
            this.sleep(segundos);
            System.out.println("Compra: " +(i+1)+ " del cliente: " +cliente.getNombre()+ " duro: " + segundos);      
        }
        
        System.out.println("Termine de atender al cliente: " +cliente.getNombre());
        this.cajero.setEstado(EstadoCaja.LIBRE);
        this.cajero.setTiempoAtendiendo(0);
        
        
       
    }
    
    public void generarCompra() throws InterruptedException{
        while(this.cajero.getEstado() == EstadoCaja.OCUPADO){
            this.sleep(this.cajero.getTiempoAtendiendo()*1000);
        }
        atenderCliente();
    }
    
    
    @Override
    public void run(){
        try{
            generarCompra();
        }catch(InterruptedException e){
            System.out.println("Error al procesar");
            e.printStackTrace();
            
        }
    }
    
    
}
