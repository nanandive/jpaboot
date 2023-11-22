package boot.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Hello {
    @GetMapping("/bye")
        public String seeYouNext() {
        return "goodbye";
    }
}