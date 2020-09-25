package Exceptions;

import java.io.IOException;

public class NotEnoughMoneyException extends IOException {
    public NotEnoughMoneyException (int accountId) {
        super("На счете " + accountId +" недостаточно денег");
    }
}
