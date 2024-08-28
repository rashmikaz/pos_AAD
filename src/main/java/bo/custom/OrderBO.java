package bo.custom;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface OrderBO {
    boolean placeOrder(OrderDTO orderDTO, List<OrderDetailDTO> orderDetailDTOs, Connection connection) throws SQLException;
}
