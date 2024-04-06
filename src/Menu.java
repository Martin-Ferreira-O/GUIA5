import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static int generarMenu() {
        int opcion;

        do {
            System.out.println("Bienvenido al menú. Por favor, elija una de las siguientes opciones: ");
            System.out.println("""
                    1. Invertir una cadena
                    2. Calcular el MCD de dos números
                    3. Calcular la suma de los dígitos de un número
                    4. Contar el número de dígitos de un número
                    5. Salir""");

            try {
                Scanner preguntaFuncion = new Scanner(System.in);
                opcion = preguntaFuncion.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número. Inténtalo nuevamente.");
                opcion = -1; // Se reinicia la variable para que vuelva a entrar en el bucle
            }
        } while (opcion <= 0 || opcion > 5);

        return opcion;
    }

}
