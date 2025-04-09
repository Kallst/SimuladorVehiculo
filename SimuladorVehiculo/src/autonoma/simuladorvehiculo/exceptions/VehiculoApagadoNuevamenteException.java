/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorvehiculo.exceptions;

/**
 *
 * @author sant9
 */
public class VehiculoApagadoNuevamenteException extends Exception{
    public VehiculoApagadoNuevamenteException(){
        super("El vehiculo ya esta apagado, no se puede repetir la accion.");
    }
}
