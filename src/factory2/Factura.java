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
public class Factura implements Operacion{
    
    private String cliente;
    private String direccion;

    public Factura() {
    }

    public Factura(String cliente, String direccion) {
        this.cliente = cliente;
        this.direccion = direccion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo Factura");
    }
    
    
}
