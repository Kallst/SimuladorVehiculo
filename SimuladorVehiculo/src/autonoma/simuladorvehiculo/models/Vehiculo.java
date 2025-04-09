package autonoma.simuladorvehiculo.models;

import autonoma.simuladorvehiculo.models.Llanta;
import autonoma.simuladorvehiculo.models.Motor;

/**
 *
 * @author sant9
 */
public class Vehiculo {
    private Llanta llanta;
    private Motor motor;

    private int limite;
    private String tipoLlanta;
    private int velocidadMax;
    private String tipoMotor;

    // Constructor
    public Vehiculo(Llanta llanta, Motor motor) {
        this.llanta = llanta;
        this.motor = motor;

        this.limite = llanta.getLimiteVelocidad();
        this.tipoLlanta = llanta.getTipo();
        this.velocidadMax = motor.obtenerVelocidadMaxima();
        this.tipoMotor = motor.obtenerTipo();
    }

    
    public int getLimite() {
        return limite;
    }

    public String getTipoLlanta() {
        return tipoLlanta;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void setTipo(String tipo) {
        this.tipoLlanta = tipo;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
