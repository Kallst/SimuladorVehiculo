package autonoma.simuladorvehiculo.models;

/**
 *
 * @author Santiago Castro Marles
 */

public class LlantaBonita extends Llanta {
    
    private static final int LIMITE_VELOCIDAD = 70;
    private static final String TIPO = "Bonita";

    public LlantaBonita(String tipo) {
        super(tipo);
    }
    
    
    @Override
    public int getLimiteVelocidad() {
        return LIMITE_VELOCIDAD;
    }

    @Override
    public String getTipo() {
        return TIPO;
    }
}
