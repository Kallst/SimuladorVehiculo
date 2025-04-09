package autonoma.simuladorvehiculo.models;

/**
 *
 * @author LAPTOP
 */

public class LlantaBonita extends Llanta {
    
    @Override
    public int getLimiteVelocidad() {
        return 70;
    }

    @Override
    public String getTipo() {
        return "Bonitas";
    }
}
