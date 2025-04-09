package autonoma.simuladorvehiculo.models;

import autonoma.simuladorvehiculo.exceptions.*;

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

    public String encender() throws VehiculoNuevamenteEncendido, VehiculoEncendidoException {
        if (encendido) {
            throw new VehiculoNuevamenteEncendido();
        } else {
            encendido = true;
            throw new VehiculoEncendidoException();
        }
    }

    public String apagar() throws VehiculoApagadoNuevamenteException, VehiculoApagadoMovimientoException, VehiculoApagadoException {
        if (!encendido) {
            throw new VehiculoApagadoNuevamenteException();
        } else if (velocidadActual > 60) {
            accidentado = true;
            encendido = false;
            velocidadActual = 0;
            throw new VehiculoApagadoMovimientoException();
        } else {
            encendido = false;
            throw new VehiculoApagadoException();
        }
    }

    public String acelerar(int incremento) throws VehiculoApagadoException, VehiculoAccidentado, VehiculoPatinandoException, ExcederMotorException {
        if (!encendido) {
            throw new VehiculoApagadoException();
        }
        if (accidentado) {
            throw new VehiculoAccidentado();
        }
        if (patinando) {
            throw new VehiculoPatinandoException();
        }

        velocidadActual += incremento;

        try {
            motor.verificarVelocidad(velocidadActual);
        } catch (ExcederMotorException e) {
            accidentado = true;
            encendido = false;
            velocidadActual = 0;
            throw e;
        }

        return "Vehículo acelerado. Velocidad actual: " + velocidadActual + " km/h.";
    }

    public String frenar(int reduccion) throws VehiculoApagadoException, VehiculoAccidentado, VehiculoDetenidoFrenarException, FrenadoIntencidadException {
        if (!encendido) {
            throw new VehiculoApagadoException();
        }
        if (accidentado) {
            throw new VehiculoAccidentado();
        }
        if (velocidadActual == 0) {
            throw new VehiculoDetenidoFrenarException();
        }

        if (reduccion > velocidadActual) {
            patinando = true;
            velocidadActual = 0;
            throw new FrenadoIntencidadException();
        }

        velocidadActual -= reduccion;
        String mensaje = "Vehículo frenado. Velocidad actual: " + velocidadActual + " km/h.";

        if (velocidadActual == 0 && patinando) {
            patinando = false;
            mensaje += " El vehículo ha dejado de patinar al detenerse.";
        }

        return mensaje;
    }

    public String frenarBruscamente(int reduccion) throws FrenadoBruscoException, VehiculoApagadoException, VehiculoAccidentado, VehiculoDetenidoFrenarException, FrenadoIntencidadException {
        String mensaje = "Frenado brusco con intensidad de " + reduccion + " km/h.";

        if (reduccion > 30 || velocidadActual > llanta.getLimiteVelocidad()) {
            patinando = true;
            throw new FrenadoBruscoException();
        }

        return mensaje + " " + frenar(reduccion);
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
