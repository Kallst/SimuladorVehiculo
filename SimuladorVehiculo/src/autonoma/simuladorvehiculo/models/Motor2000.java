package autonoma.simuladorvehiculo.models;


public class Motor2000 implements Motor {

    @Override
    public int obtenerVelocidadMaxima() {
        return 160;
    }

    @Override
    public String obtenerTipo() {
        return "2000 cc";
    }
}
