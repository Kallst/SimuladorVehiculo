package autonoma.simuladorvehiculo.exceptions;

/**
 *
 * @author sant9
 */
public class FrenadoIntencidadException extends Exception {
    public FrenadoIntencidadException (){
        super ("La intensidad de su frenado fue mayor a la velocidad actual, el vehiculo esta patinando");
    }
}
