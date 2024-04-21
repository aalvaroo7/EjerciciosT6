import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class montones_de_parejas_y_yo_sin {
    public static void main(String[] args) {
        // Creamos una lista para almacenar las parejas
        List<Pareja<Integer, Integer>> parejaList = new ArrayList<>();

        // Creamos un conjunto para almacenar los números ya generados
        Set<Integer> generatedNumbers = new HashSet<>();

        // Creamos un objeto Random para generar números aleatorios
        Random random = new Random();

        // Generamos 100 parejas de números aleatorios
        for (int i = 0; i < 100; i++) {
            int randomNumber1 = generateUniqueNumber(random, generatedNumbers);
            int randomNumber2 = generateUniqueNumber(random, generatedNumbers);

            // Creamos una nueva pareja con los números generados
            Pareja<Integer, Integer> pareja = new Pareja<>(randomNumber1, randomNumber2);

            // Añadimos la pareja a la lista
            parejaList.add(pareja);
        }

        // Imprimimos los elementos de la lista
        System.out.println("Elementos en la lista de Parejas:");
        for (Pareja<Integer, Integer> pareja : parejaList) {
            System.out.println(pareja);
        }
    }

    // Método para generar un número único
    private static int generateUniqueNumber(Random random, Set<Integer> generatedNumbers) {
        int number;
        do {
            number = random.nextInt(1000); // Limitamos el rango de los números aleatorios a 1000
        } while (!generatedNumbers.add(number)); // Generamos un nuevo número hasta que sea único
        return number;
    }
}