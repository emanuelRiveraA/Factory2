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
public class Factory2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaracion de la variable de referencia
        Operacion ouch;
        
        ouch = new Fabrica().fabricarObjeto(0);
        ouch.imprimir();
        
        /*
        +
        +
        */
        
        ouch = new Fabrica().fabricarObjeto(1);
        ouch.imprimir();
        
        /*
        +
        +
        */
        
        ouch = new Fabrica().fabricarObjeto(2);
        ouch.imprimir();
    }
    
}
