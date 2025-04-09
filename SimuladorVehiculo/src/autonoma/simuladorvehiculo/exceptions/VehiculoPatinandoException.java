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
