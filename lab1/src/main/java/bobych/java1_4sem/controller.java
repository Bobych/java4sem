package bobych.java1_4sem;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/counting")
    public triangle counting(@RequestParam(value="A", required=true) double a,
                               @RequestParam(value="B", required=true) double b,
                               @RequestParam(value="C", required=true) double c){
        return new triangle(a, b, c);
    }
}
