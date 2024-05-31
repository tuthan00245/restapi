package net.javaguides.ttk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourcceNotFoundException extends RuntimeException {
    public ResourcceNotFoundException(String message){
        super(message);
    }
}
