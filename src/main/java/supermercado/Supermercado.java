
package supermercado;

import enums.EstadoCaja;
import modelo.Cajero;
import modelo.Cliente;
import manejadores.ManejadorCompra;


public class Supermercado {
        //creamos objeto cajero
        Cajero cajero1 = new Cajero("Jose", 1);
        Cajero cajero2 = new Cajero("Ramon",2);
        Cajero cajero3 = new Cajero("Roman",3);
        Cajero cajero4 = new Cajero("Julio",4);

        //creamos objeto clientes
        Cliente cliente1 = new Cliente(new int[] {2,4,8}, "Rene");
        Cliente cliente2 = new Cliente(new int[] {1,1,1,1,1,1,1,1,1}, "Ramiro");
        Cliente cliente3 = new Cliente(new int[] {2,4,8,1,2,3,4}, "Roca");
        Cliente cliente4 = new Cliente(new int[] {2,2,2,2,4,8}, "Rosa");

        //llamamos al manejador
        ManejadorCompra proceso1 = new ManejadorCompra(cliente1, cajero1);
        ManejadorCompra proceso2 = new ManejadorCompra(cliente2, cajero2);
        ManejadorCompra proceso3 = new ManejadorCompra(cliente3, cajero3);
        ManejadorCompra proceso4 = new ManejadorCompra(cliente4, cajero4);

        //hilo
        Thread compra1 = new Thread(proceso1);
        Thread compra2 = new Thread(proceso2);
        Thread compra3 = new Thread(proceso3);
        Thread compra4 = new Thread(proceso4);
    
    public void iniciarLabores(){
        compra1.start();
        compra2.start();
        compra3.start();
        compra4.start();
    
    }
    
    
    
    
}
