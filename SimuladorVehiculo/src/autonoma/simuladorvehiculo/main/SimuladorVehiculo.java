package autonoma.simuladorvehiculo.main;

import autonoma.simuladorvehiculo.models.Vehiculo;
import autonoma.simuladorvehiculo.utils.CargadorVehiculo;
import autonoma.simuladorvehiculo.views.VentanaPrincipal;
import java.io.IOException;
import autonoma.simuladorvehiculo.exceptions.VehiculoNuevamenteEncendido;
import autonoma.simuladorvehiculo.exceptions.VehiculoEncendidoException;

public class SimuladorVehiculo {
    public static void main(String[] args) throws IOException {
        try {
            // Cargar el vehículo desde el archivo
            Vehiculo vehiculo = CargadorVehiculo.cargarDesdeArchivo("src/config/vehiculo.txt");
            
            // Crear la ventana principal y pasarle el vehículo
            java.awt.EventQueue.invokeLater(() -> {
                try {
                    VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(vehiculo);
                    ventanaPrincipal.setLocationRelativeTo(null);
                    ventanaPrincipal.setVisible(true);
                } catch (VehiculoNuevamenteEncendido | VehiculoEncendidoException e) {
                    // Manejo de las excepciones lanzadas por el constructor
                    e.printStackTrace();  // Aquí puedes imprimir el error o mostrar un mensaje de alerta
                }
            });
        } catch (IOException e) {
            e.printStackTrace();  // Manejo de cualquier error relacionado con la carga del archivo
        }
    }
}
