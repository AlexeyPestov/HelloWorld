import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        if (number > 0) {
            number++;
        }
        System.out.println(number);
    }
}
