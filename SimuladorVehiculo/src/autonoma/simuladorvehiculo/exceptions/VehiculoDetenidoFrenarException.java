/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorvehiculo.exceptions;

/**
 *
 * @author sant9
 */
public class VehiculoDetenidoFrenarException extends Exception {
    public VehiculoDetenidoFrenarException (){
        super("Frenar no sirve de nada, el vehiculo esta quieto");
    }
    
}
