package autonoma.simuladorvehiculo.models;

public class Motor1000 implements Motor {

    @Override
    public int obtenerVelocidadMaxima() {
        return 100;
    }

    @Override
    public String obtenerTipo() {
        return "1000 cc";
    }
}
