import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        StringBuilder description = new StringBuilder();
        if (number == 0)    {
            System.out.println("Ноль");
        }
        else    {
            if (number > 0) {
                description.append("Положительное ");
            }
            else    {
                description.append("Отрицательное ");
            }
            if (number % 2 == 0)    {
                description.append("чётное ");
            }
            else    {
                description.append("нечётное ");
            }
            System.out.println(description + "число");
        }
    }
}
