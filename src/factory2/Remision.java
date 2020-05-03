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
public class Remision implements Operacion{
    
    private String folio;

    public Remision() {
    }

    public Remision(String folio) {
        this.folio = folio;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo remision... ");
    }
    
    
    
}
