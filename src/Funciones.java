import java.util.InputMismatchException;
import java.util.Scanner;

public class Funciones {
    public static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1;
        }

        return 1 + contarDigitos(numero / 10);
    }

    public static int sumaDigitos(int numero){
        if (numero == 0) {
            return 0;
        }

        return numero % 10 + sumaDigitos(numero / 10);
    }

    public static int obtenerMCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        // Caso recursivo: se calcula el MCD de b y el resto de la división de a entre b
        return obtenerMCD(b, a % b);
    }

    public static String invertirCadena(String cadena) {
        if (cadena.isEmpty() || cadena.length() == 1) {
            return cadena;
        }

        return cadena.charAt(cadena.length() - 1) + invertirCadena(cadena.substring(0, cadena.length() - 1));
    }

    public static int pedirNumero(String mensaje) {
        Scanner pregunta = new Scanner(System.in);

        try {
            System.out.println(mensaje);
            return pregunta.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un número. Inténtalo nuevamente.");
            pregunta.nextLine(); // Se consume el token no valido
            return pedirNumero(mensaje);
        } finally {
            pregunta.close();
        }
    }

}
