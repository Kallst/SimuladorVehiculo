package autonoma.simuladorvehiculo.models;

/**
 *
 * @author Santiago Castro Marles
 */

public class LlantaBuena extends Llanta {
    private static final int LIMITE_VELOCIDAD = 110;
    private static final String TIPO = "Buenas";

    @Override
    public int getLimiteVelocidad() {
        return LIMITE_VELOCIDAD;
    }

    @Override
    public String getTipo() {
        return TIPO;
    }
}
