import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class cadenas_de_texto {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        int option;

        do {
            displayMenu();
            option = getOption();

            switch (option) {
                case 1:
                    addStringToList();
                    break;
                case 2:
                    removeLastString();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

            System.out.println("Contenido de la lista: " + list);
        } while (option != 3);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n1. Introducir cadena de caracteres");
        System.out.println("2. Eliminar último dato introducido");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }

    private static int getOption() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next(); // consume the invalid token
            return -1; // return an invalid value to trigger the default case
        }
    }

    private static void addStringToList() {
        System.out.print("Introduce una cadena de caracteres: ");
        scanner.nextLine(); // consume the newline left-over
        String input = scanner.nextLine();
        list.add(input);
    }

    private static void removeLastString() {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        } else {
            System.out.println("La lista está vacía.");
        }
    }
}
