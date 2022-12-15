package example.tosspayments.card;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/card")
@Controller
public class ChargeController {
    @GetMapping
    public String charge(){
        return "card/card";
    }

}
