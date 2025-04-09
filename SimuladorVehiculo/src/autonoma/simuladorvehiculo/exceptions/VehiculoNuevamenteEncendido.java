/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorvehiculo.exceptions;

/**
 *
 * @author sant9
 */
public class VehiculoNuevamenteEncendido extends Exception {
    public VehiculoNuevamenteEncendido (){
        super("Su vehiculo ya esta encendido, no se puede repetir esta accion.");
    }
}
