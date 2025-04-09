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
