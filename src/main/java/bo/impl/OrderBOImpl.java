package bo.impl;


import bo.custom.OrderBO;
import dao.DAOFactory;
import dao.custom.OrderDAO;
import dao.custom.OrderDetailDAO;
import dto.OrderDTO;
import dto.OrderDetailDTO;
import entity.Order;
import entity.OrderDetail;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OrderBOImpl implements OrderBO {
    OrderDAO orderDAO = (OrderDAO) DAOFactory.getDaoFactory().getDao(DAOFactory.DAOTypes.ORDER);
    OrderDetailDAO orderDetailDAO = (OrderDetailDAO) DAOFactory.getDaoFactory().getDao(DAOFactory.DAOTypes.ORDER_DETAIL);
    @Override
    public boolean placeOrder(OrderDTO orderDTO, List<OrderDetailDTO> orderDetailDTOs, Connection connection) throws SQLException {
        try {
            connection.setAutoCommit(false);

            // Save the order
            boolean orderSaved = orderDAO.save(
                    new Order(),
                    connection);
            if (!orderSaved) {
                connection.rollback();
                return false;
            }

            // Save the order details
            for (OrderDetailDTO orderDetail : orderDetailDTOs) {
                boolean orderDetailSaved = orderDetailDAO.save(
                        new OrderDetail(orderDetail.getOrderId(),orderDetail.getItemCode(),orderDetail.getOrderQty(),orderDetail.getUnitPrice()),
                        connection);
                if (!orderDetailSaved) {
                    connection.rollback();
                    return false;
                }
            }

            connection.commit();
            return true;

        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
