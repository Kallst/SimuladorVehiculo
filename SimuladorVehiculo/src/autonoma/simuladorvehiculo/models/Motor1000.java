package autonoma.simuladorvehiculo.models;

import autonoma.simuladorvehiculo.exceptions.ExcederMotorException;

public class Motor1000 implements Motor {

    @Override
    public int obtenerVelocidadMaxima() {
        return 100;
    }

    @Override
    public String obtenerTipo() {
        return "1000 cc";
    }

    @Override
    public void verificarVelocidad(int velocidad) throws ExcederMotorException {
        if (velocidad > obtenerVelocidadMaxima()) {
            throw new ExcederMotorException();
        }
    }
}
