package pro.sky.skyprospringdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployNotFoundException extends RuntimeException {
    public EmployNotFoundException() {
    }

    public EmployNotFoundException(String message) {
        super(message);
    }

    public EmployNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployNotFoundException(Throwable cause) {
        super(cause);
    }

    public EmployNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
