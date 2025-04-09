/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorvehiculo.models;
import autonoma.simuladorvehiculo.models.Llanta;

/**
 *
 * @author sant9
 */
public class Vehiculo {
    private Llanta llanta;
    int limite = llanta.getLimiteVelocidad();
    String tipo = llanta.getTipo();
    
    private Motor motor;
    int velocidadMax = motor.obtenerVelocidadMaxima();
    String tipoMotor = motor.obtenerTipo(); 
    
    
}
