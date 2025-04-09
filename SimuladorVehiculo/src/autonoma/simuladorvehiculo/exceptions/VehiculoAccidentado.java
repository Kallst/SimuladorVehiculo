package autonoma.simuladorvehiculo.exceptions;

/**
 *
 * @author sant9
 */
public class VehiculoAccidentado extends Exception {
    public VehiculoAccidentado (){
        super("El vehiculo ha sudrifo un accidetente y se ha apagado.");
    }
}
