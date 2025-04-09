package autonoma.simuladorvehiculo.models;

import autonoma.simuladorvehiculo.exceptions.ExcederMotorException;

public class Motor2000 implements Motor {

    @Override
    public int obtenerVelocidadMaxima() {
        return 150;
    }

    @Override
    public String obtenerTipo() {
        return "2000 cc";
    }

    @Override
    public void verificarVelocidad(int velocidad) throws ExcederMotorException {
        if (velocidad > obtenerVelocidadMaxima()) {
            throw new ExcederMotorException();
        }
    }
}
