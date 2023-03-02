package bobych.java1_4sem;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/counting")
    public ResponseEntity<Object> counting(@RequestParam(value="A", required=true) String a,
                               @RequestParam(value="B", required=true) String b,
                               @RequestParam(value="C", required=true) String c){
        int handlingValue = BadRequestException.isValueA(a);
        if (handlingValue == -1) {
            return new ResponseEntity<>("A value is not number!", HttpStatus.BAD_REQUEST);
        }
        else if (handlingValue == -2) {
            return new ResponseEntity<>("A value is less or equals then 0!", HttpStatus.BAD_REQUEST);
        }

        handlingValue = BadRequestException.isValueB(b);
        if (handlingValue == -1) {
            return new ResponseEntity<>("B value is not number!", HttpStatus.BAD_REQUEST);
        }
        else if (handlingValue == -2) {
            return new ResponseEntity<>("B value is less or equals then 0!", HttpStatus.BAD_REQUEST);
        }

        handlingValue = BadRequestException.isValueB(c);
        if (handlingValue == -1) {
            return new ResponseEntity<>("C value is not number!", HttpStatus.BAD_REQUEST);
        }
        else if (handlingValue == -2) {
            return new ResponseEntity<>("C value is less or equals then 0!", HttpStatus.BAD_REQUEST);
        }

        handlingValue = BadRequestException.isExist(a, b, c);
        if(handlingValue == -1){
            return new ResponseEntity<>("Triangle is not exists!", HttpStatus.BAD_REQUEST);
        }

        return  new ResponseEntity<>(new triangle(Double.parseDouble(a), Double.parseDouble(b), Double.parseDouble(c)), HttpStatus.OK);
    }
}
