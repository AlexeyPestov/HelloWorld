import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        System.out.println("Введите код города");
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        int countMinutes = 10;
        double costMoscow = 4.15;
        double costRostov = 1.98;
        double costKrasnodar = 2.69;
        double costKirov = 5.0;
        switch (code)  {
            case 905:   {
                System.out.println("Москва. Стоимость разговора " + costMoscow * countMinutes);
                break;
            }
            case 194:   {
                System.out.println("Ростов. Стоимость разговора " + costRostov * countMinutes);
                break;
            }
            case 491:   {
                System.out.println("Краснодар. Стоимость разговора " + costKrasnodar * countMinutes);
                break;
            }
            case 800:   {
                System.out.println("Киров. Стоимость разговора " + costKirov * 10);
                break;
            }
        }
    }
}
