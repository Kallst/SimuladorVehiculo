/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorvehiculo.exceptions;

/**
 *
 * @author sant9
 */
public class VehiculoApagadoMovimientoException extends Exception{
    public VehiculoApagadoMovimientoException (){
        super("El vehiculo se apago a mas de 60km/h, por lo que se accidento");    }
}
