package autonoma.simuladorvehiculo.models;

import autonoma.simuladorvehiculo.exceptions.FrenadoBruscoException;

public class Llanta {
    private String tipo;
    private int limiteVelocidad;

    public Llanta(String tipo) {
        this.tipo = tipo;
        if (tipo.equals("Baratas")) {
            limiteVelocidad = 80;
        } else if (tipo.equals("Bonitas")) {
            limiteVelocidad = 100;
        } else if (tipo.equals("Buenas")) {
            limiteVelocidad = 150;
        } else {
            limiteVelocidad = 90; // por defecto
        }
    }

    public void validarVelocidad(int velocidad, int reduccion) throws FrenadoBruscoException {
        if (velocidad > limiteVelocidad || reduccion > 30) {
            throw new FrenadoBruscoException();
        }
    }

    public int getLimiteVelocidad() {
        return limiteVelocidad;
    }

    public String getTipo() {
        return tipo;
    }
}
