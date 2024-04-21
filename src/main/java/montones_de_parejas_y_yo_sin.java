import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class montones_de_parejas_y_yo_sin {
    public static void main(String[] args) {
    List<Pareja<Integer, Integer>> parejaList = new ArrayList<>();

    Random random = new Random();

    for (int i = 0; i < 100; i++) {
        int randomNumber1 = random.nextInt();
        int randomNumber2 = random.nextInt();
        Pareja<Integer, Integer> pareja = new Pareja<>(randomNumber1, randomNumber2);
        parejaList.add(pareja);
    }

    System.out.println("Elementos en la lista de Parejas:");
    for (Pareja<Integer, Integer> pareja : parejaList) {
        System.out.println(pareja);
    }
}
}

