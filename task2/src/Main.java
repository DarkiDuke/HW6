import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы ниже.

        double[] weights = new double[]{first, second, third};
        Arrays.sort(weights);
        System.out.println(Arrays.toString(weights));

        //todo


        System.out.println("Наибольший вес: " + weights[2]);
        System.out.println("Средний вес: " + weights[1]);
        System.out.println("Наименьший вес: " + weights[0]);
    }
}
