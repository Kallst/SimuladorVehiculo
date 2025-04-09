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
