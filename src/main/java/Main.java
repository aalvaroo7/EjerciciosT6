import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
//ejercicio de crear una lista de 100 datos reales(2)
public class Main {
    public static void main(String[] args) {
        List<Double> arrayList = new ArrayList<>();
        List<Double> linkedList = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            double randomNumber = random.nextDouble();
            arrayList.add(randomNumber);
            linkedList.add(randomNumber);
        }

        System.out.println("Elementos en ArrayList:");
        for (Double number : arrayList) {
            System.out.println(number);
        }

        System.out.println("\nElementos en LinkedList:");
        for (Double number : linkedList) {
            System.out.println(number);
        }
    }
}