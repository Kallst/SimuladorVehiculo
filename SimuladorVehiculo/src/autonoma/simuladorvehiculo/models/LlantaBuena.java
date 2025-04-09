package autonoma.simuladorvehiculo.models;

/**
 *
 * @author LAPTOP
 */
public class LlantaBuena extends Llanta {
    
    @Override
    public int getLimiteVelocidad() {
        return 110;
    }

    @Override
    public String getTipo() {
        return "Buenas";
    }
}
