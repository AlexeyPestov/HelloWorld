import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        String description = "";
        if (number == 0)    {
            System.out.println("Ноль");
        }
        else    {
            if (number > 0) {
                description += "Положительное ";
            }
            else    {
                description += "Отрицательное ";
            }
            if (number % 2 == 0)    {
                description += "чётное ";
            }
            else    {
                description += "нечётное ";
            }
            System.out.println(description + "число");
        }
    }
}
