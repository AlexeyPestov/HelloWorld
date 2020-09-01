import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class T8 {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{1, -10, 5 ,6, 45, 23, -45, -34, 0, 32, 56, -1 , 2, -2};
        int max = Arrays.stream(arrayInt).max().getAsInt();
        System.out.println("Максимальное значение " + max);
        int sumPol = Arrays.stream(arrayInt).filter(n -> n > 0).sum();
        System.out.println("Сумма положительных элементов " + sumPol);
        int sumChetOtr = Arrays.stream(arrayInt).filter(n -> n < 0 && n % 2 == 0).sum();
        System.out.println("Сумма чётных отрицательных элементов " + sumChetOtr);
        long countPol = Arrays.stream(arrayInt).filter(n -> n > 0).count();
        System.out.println("Количество положительных элементов " + countPol);
        double averageOtr = Arrays.stream(arrayInt).filter(n -> n < 0).average().getAsDouble();
        System.out.println("Среднее арифметическое отрицательных элементов " + averageOtr);
    }
}
