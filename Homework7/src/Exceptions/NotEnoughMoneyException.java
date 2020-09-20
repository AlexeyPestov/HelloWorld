package Exceptions;

import java.io.IOException;

public class NotEnoughMoneyException extends IOException {
    public NotEnoughMoneyException () {
        super("На счету недостаточно денег");
    }
}
