package autonoma.simuladorvehiculo.main;

import autonoma.simuladorvehiculo.models.*;
import autonoma.simuladorvehiculo.exceptions.*;

import java.util.Scanner;

public class SimuladorVehiculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear motor y llanta (elige qué motor/llanta deseas usar aquí)
        Motor motor = new Motor2000();               // Puedes cambiar por Motor1000 o Motor3000
        Llanta llanta = new LlantaBuena("Buenas");   // Cambia por LlantaBarata("Barata") o LlantaBonita("Bonita")

        Vehiculo vehiculo = new Vehiculo(llanta, motor);

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("\n===== MENÚ DEL SIMULADOR DE VEHÍCULO =====");
            System.out.println("1. Encender vehículo");
            System.out.println("2. Apagar vehículo");
            System.out.println("3. Acelerar");
            System.out.println("4. Frenar");
            System.out.println("5. Frenar bruscamente");
            System.out.println("6. Mostrar estado del vehículo");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        System.out.println(vehiculo.encender());
                        break;

                    case 2:
                        System.out.println(vehiculo.apagar());
                        break;

                    case 3:
                        System.out.print("¿Cuánto desea acelerar (km/h)?: ");
                        int incremento = scanner.nextInt();
                        int nuevaVelocidad = vehiculo.getVelocidadActual() + incremento;

                        motor.verificarVelocidad(nuevaVelocidad); // Validación con motor
                        System.out.println(vehiculo.acelerar(incremento));
                        break;

                    case 4:
                        System.out.print("¿Cuánto desea frenar (km/h)?: ");
                        int reduccion = scanner.nextInt();
                        System.out.println(vehiculo.frenar(reduccion));
                        break;

                    case 5:
                        System.out.print("¿Cuánto desea frenar bruscamente (km/h)?: ");
                        int reduccionBrusca = scanner.nextInt();

                        llanta.validarVelocidad(vehiculo.getVelocidadActual(), reduccionBrusca); // Validación con llanta
                        System.out.println(vehiculo.frenarBruscamente(reduccionBrusca));
                        break;

                    case 6:
                        System.out.println(vehiculo.toString());
                        break;

                    case 7:
                        System.out.println("Saliendo del simulador...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (ExcederMotorException e) {
                System.out.println("❌ Error del motor: " + e.getMessage());
            } catch (FrenadoBruscoException e) {
                System.out.println("❌ Error de llantas: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("❌ Excepción general: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
