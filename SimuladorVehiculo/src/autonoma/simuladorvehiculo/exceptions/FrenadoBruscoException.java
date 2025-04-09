/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simuladorvehiculo.exceptions;

/**
 *
 * @author sant9
 */
public class FrenadoBruscoException extends Exception{
    public FrenadoBruscoException (){
        super("Se freno bruscamente a una velocidad superior a la permitida, las llantas estan patinando");
    }
}
