import java.sql.SQLOutput;
import java.util.Scanner;
public class Ventana {
  private String nombreJugador;

    public Ventana() {

    }

    public void ventana(){

// Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        //preguntamos el nombre del jugador y creamos un objeto Gestion juego para asignarle el nombre de jugador
        System.out.println("ingrese su nombre de jugador");
        String nombreJugador= scanner.nextLine();
        GestionJuego gestionJuego=new GestionJuego();

        // Imprime un mensaje en pantalla para preguntar al usuario
        System.out.println("Selecciona una opción: \n1. enfrentar a bruja, mago y golem: Opción 1\n2. Enfrentar a Otro Jugador: Opción 2");

// Lee la respuesta del usuario
        String respuesta = scanner.nextLine();

// Usa el switch statement para manejar cada opción posible
        switch (respuesta) {
            case "1":
                System.out.println("Has seleccionado la Opción 1: Enfrentar mago, bruja y golem ");

                break;
            case "2":
                System.out.println("Has seleccionado la Opción 2: enfrentar Otro jugador");
                break;

            default:
                System.out.println("Selección inválida. Por favor selecciona una opción válida.");
                break;
        }

// Cierra el objeto Scanner
        scanner.close();

    }
}