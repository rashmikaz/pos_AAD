package dto;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO implements Serializable {
    private String orderId;
    private Date orderDate;
    private String customerId;
    private double totalAmount;
}
