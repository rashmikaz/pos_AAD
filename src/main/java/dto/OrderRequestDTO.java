package dto;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequestDTO implements Serializable {
    private OrderDTO orderDTO;
    private List<OrderDetailDTO> orderDetailDTOS;
}
