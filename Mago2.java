import java.util.InputMismatchException;
import java.util.Scanner;

public class Mago2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        // Definir las tablas magicas
        int[][] tablasMagicas = {
                { 1, 23, 19, 13, 17, 3, 31, 9, 7, 29, 11, 25, 21, 5, 27, 15 },
                { 10, 26, 22, 15, 31, 14, 2, 30, 18, 19, 23, 27, 3, 6, 11, 7 },
                { 12, 20, 29, 7, 22, 4, 21, 31, 30, 28, 13, 23, 6, 14, 5, 15 },
                { 8, 28, 10, 14, 24, 12, 25, 31, 30, 29, 15, 26, 13, 9, 27, 11 },
                { 20, 28, 25, 18, 26, 16, 23, 30, 24, 21, 31, 22, 19, 27, 17, 29 }
        };

        do {
            System.out.println("Bienvenido al juego de adivinar números:");
            System.out.println("1. Te adivino un número del 1 al 7.");
            System.out.println("2. Te adivino un número del 1 al 31.");
            System.out.println("3. Te adivino un número del 1 al 1023.");
            System.out.println("4. Te adivino un número del 1 al 7 en base 3.");
            System.out.println("5. Salir del programa.");
            System.out.print("Elige una opción: \n");

            try {
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        adivinarNumero(scanner, 7, tablasMagicas[0]);
                        break;
                    case 2:
                        adivinarNumero(scanner, 31, tablasMagicas[1]);
                        break;
                    case 3:
                        adivinarNumero(scanner, 1023, tablasMagicas[2]);
                        break;
                    case 4:
                        adivinarNumeroBase3(scanner, 7, tablasMagicas[3]);
                        break;
                    /*
                     * case 4:
                     * mostrarTablas(tablasMagicas);
                     * System.out.print("¿El número que pensaste se encuentra aquí? (si/no): ");
                     * String respuesta = scanner.next().toLowerCase();
                     * if (respuesta.equals("si")) {
                     * // Implementa la lógica de adivinanza para este caso
                     * System.out.println("Lo siento, la función para adivinar no está implementada"
                     * );
                     * }
                     * break;
                     */
                    case 5:
                        System.out.println("Gracias por jugar.");
                        break;
                    default:
                        System.out.println("Opción no válida. Introduce un número del 1 al 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                scanner.next(); // Limpiar el búfer del escáner
                option = 0;
            }
        } while (option != 5);

        scanner.close();
    }

    // Función para adivinar números basados en las tablas mágicas case1
    public static void adivinarNumero(Scanner scanner, int max, int[] tablaMagica) {
        System.out.println("Piensa en un número del 1 al " + max + " y manténlo en tu mente.");

        int numeroAdivinado = 0;
        int valorTabla = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println("¿El número que pensaste se encuentra en la tabla " + (i + 1) + "? (si/no): ");
            String respuesta = scanner.next().toLowerCase();

            if (respuesta.equals("si")) {
                numeroAdivinado += valorTabla;
            }

            valorTabla *= 2; // Duplica el valor de la tabla para la siguiente iteración
        }

        System.out.println("El número que pensaste es: " + numeroAdivinado);
    }

    // Funcion para adivinar numeros basados en las tablas magicas case2
    public static void adivinarNumero(Scanner scanner, int max, int[] tablaMagica) {
        System.out.println("Piensa en un número del 1 al " + max + " y manténlo en tu mente.");

        int numeroAdivinado = 0;
        int valorTabla = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println("¿El número que pensaste se encuentra en la tabla " + (i + 1) + "? (si/no): ");
            String respuesta = scanner.next().toLowerCase();

            if (respuesta.equals("si")) {
                numeroAdivinado += tablaMagica[i];
            }
        }

        System.out.println("El número que pensaste es: " + numeroAdivinado);
    }

    // Funcion para adivinar numeros basados en las tablas magicas case3
    public static void adivinarNumero(Scanner scanner, int max, int[] tablaMagica) {
        System.out.println("Piensa en un número del 1 al " + max + " y manténlo en tu mente.");

        int numeroAdivinado = 0;
        int valorTabla = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println("¿El número que pensaste se encuentra en la tabla " + (i + 1) + "? (si/no): ");
            String respuesta = scanner.next().toLowerCase();

            if (respuesta.equals("si")) {
                numeroAdivinado += tablaMagica[i];
            }
        }

        System.out.println("El número que pensaste es: " + numeroAdivinado);
    }

    // Funcion para adivinar numeros basados en las tablas magicas case4
    public static void adivinarNumeroBase3(Scanner scanner, int max, int[] tablaMagica) {
        System.out.println("Piensa en un número del 1 al " + max + " en base 3 y manténlo en tu mente.");

        int numeroAdivinado = 0;
        int valorTabla = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println("¿El número que pensaste se encuentra en la tabla " + (i + 1) + "? (si/no): ");
            String respuesta = scanner.next().toLowerCase();

            if (respuesta.equals("si")) {
                numeroAdivinado += valorTabla;
            }

            valorTabla *= 3;
        }

        System.out.println("El número que pensaste en base 3 es: " + Integer.toString(numeroAdivinado, 3));
    }

    // Función para mostrar las tablas mágicas
    public static void mostrarTablas(int[][] tablasMagicas) {
        for (int i = 0; i < tablasMagicas.length; i++) {
            System.out.println("Tabla " + (i + 1) + ": " + arrayToString(tablasMagicas[i]));
        }
    }

    // Función para convertir un arreglo en una cadena de texto
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(" }");
        return sb.toString();
    }
}
