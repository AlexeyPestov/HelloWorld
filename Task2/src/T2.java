import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        System.out.println("Введите трёхзначное число");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        Integer sum = 0;
        Integer lastNum = number % 10;
        Integer secNum = (number / 10) % 10;
        Integer firstNum = number / 100;
        sum = firstNum + secNum + lastNum;
        System.out.println("Сумма чисел " + sum);
    }
}
