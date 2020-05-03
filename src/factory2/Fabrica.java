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
public class Fabrica {
    
    //metodo de clase que no se necesitas intanciar 
    public static Operacion fabricarObjeto(int opcion){
        switch(opcion){
            case 0:
                return new Factura();
            case 1:
                return new Remision();
            case 2:
                return new NotaVenta();
        }
        
        return null;
    }
}
