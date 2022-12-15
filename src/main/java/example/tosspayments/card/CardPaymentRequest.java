package example.tosspayments.card;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CardPaymentRequest {
    private Long amount;
    private String orderId;
    private String orderName;
    private String customerName;
}
