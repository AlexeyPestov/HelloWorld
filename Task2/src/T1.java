import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        System.out.println("Последняя цифра " + number % 10);
    }
}
