package autonoma.simuladorvehiculo.models;

import autonoma.simuladorvehiculo.exceptions.ExcederMotorException;

public class Motor3000 implements Motor {

    @Override
    public int obtenerVelocidadMaxima() {
        return 200;
    }

    @Override
    public String obtenerTipo() {
        return "3000 cc";
    }

    @Override
    public void verificarVelocidad(int velocidad) throws ExcederMotorException {
        if (velocidad > obtenerVelocidadMaxima()) {
            throw new ExcederMotorException();
        }
    }
}
