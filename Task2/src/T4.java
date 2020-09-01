import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        Integer number = actionNumber(scanner.nextInt());
        System.out.println(number);
    }

    private static Integer actionNumber (Integer number)    {
        if (number > 0) {
            return number + 1;
        }
        if (number < 0) {
            return number - 2;
        }
        return 10;
    }
}
