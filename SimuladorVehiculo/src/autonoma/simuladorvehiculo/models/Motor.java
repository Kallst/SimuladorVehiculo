package autonoma.simuladorvehiculo.models;

import autonoma.simuladorvehiculo.exceptions.ExcederMotorException;

public interface Motor {
    int obtenerVelocidadMaxima();
    String obtenerTipo();

    // Nueva función para validar velocidad
    void verificarVelocidad(int velocidad) throws ExcederMotorException;
}
