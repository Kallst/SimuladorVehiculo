package autonoma.simuladorvehiculo.models;

/**
 *
 * @author LAPTOP
 */
public class LlantaBarata extends Llanta {
    
    @Override
    public int getLimiteVelocidad() {
        return 50;
    }

    @Override
    public String getTipo() {
        return "Baratas";
    }
}

