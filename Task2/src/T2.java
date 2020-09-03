import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        String enterLine = scanner.nextLine();
        char[] chDigits = enterLine.toCharArray();
        int sum = 0;
        for (char chDigit : chDigits)   {
            sum += Integer.parseInt(String.valueOf(chDigit));
        }
        System.out.println("Сумма чисел " + sum);
    }
}
