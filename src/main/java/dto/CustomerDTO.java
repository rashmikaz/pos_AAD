package dto;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO implements Serializable {
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerTel;
}
