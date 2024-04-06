//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = Menu.generarMenu();
            switch (opcion) {
                case 1:
                    // No cree una funcion a parte para pedir una cadena ya que PARA EL EJERCICIO EN ESPECIFICO, SOLO SE UTILIZARIA UNA VEZ. ES UN GASTO DE RECURSOS INNECESARIOS.
                    Scanner pregunta = new Scanner(System.in);
                    System.out.println("Porfavor ingrese la cadena a invertir: ");
                    String cadenaInvertir = pregunta.nextLine();

                    String cadena = Funciones.invertirCadena(cadenaInvertir);
                    System.out.println(cadena);
                    break;

                case 2:
                    int num1 = Funciones.pedirNumero("Introduzca el primer número: ");
                    int num2 = Funciones.pedirNumero("Introduzca el segundo número: ");
                    int mcd = Funciones.obtenerMCD(num1, num2);
                    System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd);
                    break;

                case 3:
                    int digitosASumar = Funciones.pedirNumero("Introduzca el número: ");
                    int sumaDigitos = Funciones.sumaDigitos(digitosASumar);
                    System.out.println("La suma de los dígitos de " + digitosASumar + " es: " + sumaDigitos);
                    break;
                case 4:
                    int numero = Funciones.pedirNumero("Introduzca el número: ");
                    int numeroDigitos = Funciones.contarDigitos(numero) - 1;
                    System.out.println("El número " + numero + " tiene " + numeroDigitos + " dígitos.");
                    break;
                case 5:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

    }
}