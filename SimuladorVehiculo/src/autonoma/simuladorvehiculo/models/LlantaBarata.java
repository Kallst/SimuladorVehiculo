package autonoma.simuladorvehiculo.models;

/**
 *
 * @author Santiago Castro Marles
 */

public class LlantaBarata extends Llanta {
    
   private static final int LIMITE_VELOCIDAD = 50;
   private static final String TIPO = "Barata";

    public LlantaBarata(String tipo) {
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

