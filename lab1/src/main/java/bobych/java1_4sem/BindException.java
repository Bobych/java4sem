package bobych.java1_4sem;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BindException extends Exception{
    public BindException(String message){
        super(message);
    }
}
