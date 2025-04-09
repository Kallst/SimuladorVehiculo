
package autonoma.simuladorvehiculo.models;


public class Motor3000 implements Motor {

    @Override
    public int obtenerVelocidadMaxima() {
        return 220;
    }

    @Override
    public String obtenerTipo() {
        return "3000 cc";
    }
}
