package autonoma.simuladorvehiculo.main;

import autonoma.simuladorvehiculo.models.Vehiculo;
import autonoma.simuladorvehiculo.utils.CargadorVehiculo;
import autonoma.simuladorvehiculo.views.VentanaPrincipal;
import java.io.IOException;

import java.util.Scanner;

public class SimuladorVehiculo {
    public static void main(String[] args) throws IOException {
        Vehiculo vehiculo = CargadorVehiculo.cargarDesdeArchivo("src/config/vehiculo.txt");
        java.awt.EventQueue.invokeLater(() -> {
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal (vehiculo);
            ventanaPrincipal.setLocationRelativeTo(null);
            ventanaPrincipal.setVisible(true);
        });
    }
}