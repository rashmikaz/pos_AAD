package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@Data
public class Order implements Serializable {
    private String orderId;
    private Date orderDate;
    private String customerId;
    private double totalAmount;
}
