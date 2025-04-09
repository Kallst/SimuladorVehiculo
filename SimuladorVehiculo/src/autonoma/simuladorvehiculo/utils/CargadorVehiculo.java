package autonoma.simuladorvehiculo.utils;

import autonoma.simuladorvehiculo.models.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CargadorVehiculo {

    public static Vehiculo cargarDesdeArchivo(String rutaArchivo) throws IOException {
        Llanta llanta = null;
        Motor motor = null;

        BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
        String linea;

        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.trim().split("\\s+"); // separa por uno o más espacios
            if (partes.length < 2) continue;

            String clave = partes[0].toLowerCase();
            String valor = partes[1].toLowerCase();

            if (clave.equals("llantas")) {
                switch (valor) {
                    case "buenas":
                        llanta = new LlantaBuena("Buenas");
                        break;
                    case "bonitas":
                        llanta = new LlantaBonita("Bonitas");
                        break;
                    case "baratas":
                        llanta = new LlantaBarata("Baratas");
                        break;
                    default:
                        throw new IllegalArgumentException("Tipo de llanta desconocido: " + valor);
                }
            } else if (clave.equals("motor")) {
                switch (valor) {
                    case "1000":
                        motor = new Motor1000();
                        break;
                    case "2000":
                        motor = new Motor2000();
                        break;
                    case "3000":
                        motor = new Motor3000();
                        break;
                    default:
                        throw new IllegalArgumentException("Cilindraje de motor desconocido: " + valor);
                }
            }
        }

        reader.close();

        if (llanta == null || motor == null) {
            throw new IllegalStateException("Falta especificar el motor o las llantas en el archivo.");
        }

        return new Vehiculo(llanta, motor);
    }
}
