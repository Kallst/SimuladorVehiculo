/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorvehiculo.exceptions;

/**
 *
 * @author sant9
 */
public class VehiculoPatinandoException extends Exception{
    public VehiculoPatinandoException (){
        super("El vehiculo ha perdido el control, solo volvera a la normalidad cuando este completamente quieto.");
    }
}
