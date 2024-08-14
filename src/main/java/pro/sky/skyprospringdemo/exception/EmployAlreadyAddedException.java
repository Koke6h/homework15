package pro.sky.skyprospringdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployAlreadyAddedException extends RuntimeException {
    public EmployAlreadyAddedException() {
    }

    public EmployAlreadyAddedException(String message) {
        super(message);
    }

    public EmployAlreadyAddedException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployAlreadyAddedException(Throwable cause) {
        super(cause);
    }

    public EmployAlreadyAddedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
