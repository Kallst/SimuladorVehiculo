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

    private boolean encendido = false;
    private boolean accidentado = false;
    private boolean patinando = false;
    private int velocidadActual = 0;

    // Constructor
    public Vehiculo(Llanta llanta, Motor motor) {
        this.llanta = llanta;
        this.motor = motor;
    }

    // ===================== COMPORTAMIENTOS =====================

    public String encender() {
        if (encendido) {
            return "El vehículo ya está encendido.";
        } else {
            encendido = true;
            return "El vehículo ha sido encendido.";
        }
    }

    public String apagar() {
        if (!encendido) {
            return "El vehículo ya está apagado.";
        } else if (velocidadActual > 60) {
            accidentado = true;
            encendido = false;
            velocidadActual = 0;
            return "¡El vehículo se ha accidentado al apagarse a alta velocidad!";
        } else {
            encendido = false;
            return "El vehículo ha sido apagado correctamente.";
        }
    }

    public String acelerar(int incremento) {
        if (!encendido) {
            return "No se puede acelerar un vehículo apagado.";
        }
        if (accidentado) {
            return "No se puede acelerar un vehículo accidentado.";
        }
        if (patinando) {
            return "No se puede acelerar mientras el vehículo está patinando.";
        }

        velocidadActual += incremento;

        if (velocidadActual > motor.obtenerVelocidadMaxima()) {
            accidentado = true;
            encendido = false;
            velocidadActual = 0;
            return "¡El motor ha explotado! El vehículo se accidentó.";
        } else {
            return "Vehículo acelerado. Velocidad actual: " + velocidadActual + " km/h.";
        }
    }

    public String frenar(int reduccion) {
        if (!encendido) {
            return "No se puede frenar un vehículo apagado.";
        }
        if (accidentado) {
            return "No se puede frenar un vehículo accidentado.";
        }
        if (velocidadActual == 0) {
            return "El vehículo ya está detenido.";
        }

        if (reduccion > velocidadActual) {
            patinando = true;
            velocidadActual = 0;
            return "¡Frenado demasiado fuerte! El vehículo patinó y se detuvo.";
        } else {
            velocidadActual -= reduccion;
            String mensaje = "Vehículo frenado. Velocidad actual: " + velocidadActual + " km/h.";

            if (velocidadActual == 0 && patinando) {
                patinando = false;
                mensaje += " El vehículo ha dejado de patinar al detenerse.";
            }

            return mensaje;
        }
    }

    public String frenarBruscamente(int reduccion) {
        String mensaje = "Frenado brusco con intensidad de " + reduccion + " km/h.";

        if (reduccion > 30 || velocidadActual > llanta.getLimiteVelocidad()) {
            patinando = true;
            mensaje += " ¡Frenado brusco ha causado que el vehículo patine!";
        }

        mensaje += " " + frenar(reduccion);
        return mensaje;
    }

    // ===================== GETTERS =====================

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public boolean isAccidentado() {
        return accidentado;
    }

    public boolean isPatinando() {
        return patinando;
    }

    public String getTipoLlanta() {
        return llanta.getTipo();
    }

    public String getTipoMotor() {
        return motor.obtenerTipo();
    }

    public int getLimiteLlantas() {
        return llanta.getLimiteVelocidad();
    }

    public int getVelocidadMaximaMotor() {
        return motor.obtenerVelocidadMaxima();
    }

    // ===================== toString =====================

    @Override
    public String toString() {
        return "Vehículo con llantas " + getTipoLlanta() + " (límite: " + getLimiteLlantas() + " km/h), "
             + "motor " + getTipoMotor() + " (máx: " + getVelocidadMaximaMotor() + " km/h), "
             + "velocidad actual: " + velocidadActual + " km/h, "
             + "estado: " + (encendido ? "Encendido" : "Apagado")
             + (accidentado ? ", Accidentado" : "")
             + (patinando ? ", Patinando" : "");
    }
}
