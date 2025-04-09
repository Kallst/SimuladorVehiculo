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
