package autonoma.simuladorvehiculo.exceptions;

/**
 *
 * @author sant9
 */
public class VehiculoApagadoMovimientoException extends Exception{
    public VehiculoApagadoMovimientoException (){
        super("El vehiculo se apago a mas de 60km/h, por lo que se accidento");    }
}
