package autonoma.simuladorvehiculo.exceptions;

/**
 *
 * @author sant9
 */
public class ExcederMotorException extends Exception{
    public ExcederMotorException (){
        super("La velocidad ha superado el limite del motor, causo un accidente.");
    }
}
