package dto;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDTO implements Serializable {
    private String itemCode;
    private String itemName;
    private int qtyOnHand;
    private double unitPrice;
}
