import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        CustomAccount ca = new CustomAccount();
        boolean cont = true;
        while (cont) {
            System.out.println("Введите команду");
            Scanner scanner = new Scanner(System.in);
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "balance": {
                    ca.balance(Integer.parseInt(command[1]));
                    break;
                }
                case "withdraw": {
                    ca.withdraw(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                }
                case "deposit": {
                    ca.deposit(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                }
                case "transfer": {
                    ca.transfer(Integer.parseInt(command[1]), Integer.parseInt(command[2]), Integer.parseInt(command[3]));
                    break;
                }
                case "all": {
                    ca.all();
                    break;
                }
                case "q": {
                    cont = false;
                    break;
                }
            }
            CustomAccount.closeConnections();
        }
    }
}
