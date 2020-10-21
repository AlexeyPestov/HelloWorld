import Exceptions.NotEnoughMoneyException;
import Exceptions.UnknownAccountException;
import org.h2.jdbc.JdbcSQLException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CustomAccount extends Account implements AccountService {

    private static int currentId = 1;
    private static Connection connection = null;
    private static Statement statement = null;
    private static PreparedStatement prStatement = null;
    private static String sql = null;


    public static void closeConnections() throws SQLException {
        prStatement.close();
        connection.close();
    }

    public CustomAccount() throws SQLException {
        super();
        sql = "INSERT INTO ACCOUNTS (id, holder, amount) VALUES (?, ?, ?)";
        connection = DriverManager.getConnection("jdbc:h2:mem:test;INIT=RUNSCRIPT FROM './schema.sql'");
        connection.setAutoCommit(false);
        prStatement = connection.prepareStatement(sql);
        String[] names = {"Vasya", "Petya", "Masha", "Lesha", "Andrey", "Afanasiy", "Lena", "Katya", "Misha", "Vova"};
        for (String name : names) {
            prStatement.setInt(1, currentId);
            prStatement.setString(2, name);
            prStatement.setInt(3, rand());
            prStatement.addBatch();
            currentId++;
        }
        prStatement.executeBatch();
    }

    @Override
    public void withdraw(int accountId, int amount) throws IOException, SQLException {
        Integer amountAccountNow = amountAccount(accountId);
        if (amountAccountNow == null) {
            throw new UnknownAccountException(accountId);
        }
        int amountNew = amountAccountNow - amount;
        sql = "UPDATE ACCOUNTS SET amount = " + amountNew + " WHERE id = " + accountId;
        statement.execute(sql);
        System.out.println("Со счета " + accountId + " снято " + amount + ", теперь там " + amountNew);
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException, SQLException {
        Integer amountAccount = amountAccount(accountId);
        if (amountAccount == null) {
            throw new UnknownAccountException(accountId);
        }
        System.out.println("Баланс " + amountAccount);
    }

    @Override
    public void deposit(int accountId, int amount) throws IOException, SQLException {
        Integer amountAccountNow = amountAccount(accountId);
        if (amountAccountNow == null) {
            throw new UnknownAccountException(accountId);
        }
        sql = "UPDATE ACCOUNTS SET amount = amount +" + amount + " WHERE id = " + accountId;
        statement.execute(sql);
        System.out.println("Счет " + accountId + " пополнен на " + amount + ", теперь там " + (amountAccountNow + amount));

    }

    @Override
    public void transfer(int from, int to, int amount) throws IOException, SQLException {
        Integer amountAccountFrom = amountAccount(from);
        Integer amountAccountTo = amountAccount(to);
        if (amountAccountFrom == null) {
            throw new UnknownAccountException(from);
        }
        if (amountAccountTo == null) {
            throw new UnknownAccountException(to);
        }
        if (amountAccountFrom < amount) {
            throw new NotEnoughMoneyException(from);
        }
        sql = "UPDATE ACCOUNTS SET amount = amount -" + amount + " WHERE id = " + from;
        statement.execute(sql);
        sql = "UPDATE ACCOUNTS SET amount = amount +" + amount + " WHERE id = " + from;
        statement.execute(sql);
        System.out.println("Со счета " + from + " снято " + amount + ". Теперь там " + (amountAccountFrom - amount));
        System.out.println("На счет " + to + " внесено " + amount + ". Теперь там " + (amountAccountTo + amount));

    }


    public void all() throws SQLException {
        sql = "SELECT * FROM ACCOUNTS";
        prStatement = connection.prepareStatement(sql);
        ResultSet resultSet = prStatement.executeQuery();
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String holder = resultSet.getString(2);
            int amount = resultSet.getInt(3);
            System.out.println(id + " " + holder + " " + amount);
        }
        prStatement.close();
    }

    private int rand() {
        while (true) {
            int number = (int) (Math.random() * 100000);
            if (number < 0) {
                continue;
            }
            return number;
        }
    }

    private Integer amountAccount(int accountId) throws SQLException {
        try {
            sql = "SELECT amount FROM ACCOUNTS WHERE id = " + accountId;
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            return resultSet.getInt(1);
        } catch (JdbcSQLException ex) {
            ex.printStackTrace();
            return -1;
        } }
}
