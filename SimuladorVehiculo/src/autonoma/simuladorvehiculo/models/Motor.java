package autonoma.simuladorvehiculo.models;

import autonoma.simuladorvehiculo.exceptions.ExcederMotorException;

public abstract class Motor {
    protected String tipo;
    protected int velocidadMaxima;

    public Motor(String tipo) {
        this.tipo = tipo;
        if (tipo.equals("1.0")) {
            velocidadMaxima = 120;
        } else if (tipo.equals("1.6")) {
            velocidadMaxima = 160;
        } else if (tipo.equals("2.0")) {
            velocidadMaxima = 200;
        } else {
            velocidadMaxima = 100; // por defecto
        }
    }

    public abstract void ();

    public int obtenerVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String obtenerTipo() {
        return tipo;
    }
}
