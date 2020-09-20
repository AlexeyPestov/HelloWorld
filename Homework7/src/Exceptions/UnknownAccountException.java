package Exceptions;

import java.io.IOException;

public class UnknownAccountException extends IOException {
    public UnknownAccountException (String message) {
        super(message);
    }
}
