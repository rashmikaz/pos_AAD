package bo.custom;

import bo.SuperBO;
import dto.OrderDTO;
import dto.OrderDetailDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface OrderBO extends SuperBO {
    boolean placeOrder(OrderDTO orderDTO, List<OrderDetailDTO> orderDetailDTOs, Connection connection) throws SQLException;
}
