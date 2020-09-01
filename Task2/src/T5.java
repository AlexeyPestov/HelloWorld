import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Integer[] arrayNum = new Integer[3];
        Integer min = 0;
        System.out.println("Введите 3 целых числа");
        for (int i = 0; i < 3; i++)    {
            Scanner scanner = new Scanner(System.in);
            arrayNum[i] = scanner.nextInt();
            if (i == 0) {
                min = arrayNum[0];
                continue;
            }
            if (arrayNum[i].compareTo(min) < 0) {
                min = arrayNum[i];
            }
        }
        System.out.println("Минимальное число " + min);
    }
}
