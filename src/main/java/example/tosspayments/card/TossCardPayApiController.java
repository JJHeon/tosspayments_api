package example.tosspayments.card;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/card")
@Controller
public class TossCardPayApiController {
    @GetMapping
    public String index(){
        return "card/card";
    }

    @GetMapping("/success")
    public String success(){
        return "card/success";
    }

    @GetMapping("/fail")
    public String fail(){
        return "card/fail";
    }

    @ResponseBody
    @PostMapping("/api/v1/order")
    public CardPaymentResponse order(@ModelAttribute CardPaymentRequest request){
        CardPaymentResponse response = new CardPaymentResponse(
                request.getAmount(),
                request.getOrderId(),
                request.getOrderName(),
                request.getCustomerName(),
                "http://localhost:8080/success",
                "http://localhost:8080/fail"
        );
        return  response;
    }


}
