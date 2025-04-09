package autonoma.simuladorvehiculo.exceptions;

/**
 *
 * @author sant9
 */
public class FrenadoBruscoException extends Exception{
    public FrenadoBruscoException (){
        super("Se freno bruscamente a una velocidad superior a la permitida, las llantas estan patinando");
    }
}
