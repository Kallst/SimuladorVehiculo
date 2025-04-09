package autonoma.simuladorvehiculo.models;

/**
 *
 * @author Santiago Castro Marles
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
