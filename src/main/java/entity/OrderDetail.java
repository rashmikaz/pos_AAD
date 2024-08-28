package entity;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetail implements Serializable {
    private String orderId;
    private String itemCode;
    private int orderQty;
    private double unitPrice;
}
