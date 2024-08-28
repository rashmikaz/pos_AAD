package entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {
    private String itemCode;
    private String itemName;
    private int qtyOnHand;
    private double unitPrice;
}
