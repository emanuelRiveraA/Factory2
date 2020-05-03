/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory2;

/**
 *
 * @author Idalia
 */
public class NotaVenta implements Operacion{

    private String cliente;

    public NotaVenta() {
    }

    public NotaVenta(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo nota de venta ... ");
    }
    
    
}
