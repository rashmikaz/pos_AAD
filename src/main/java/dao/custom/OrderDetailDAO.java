package dao.custom;

import dao.CrudDAO;
import entity.OrderDetail;

import java.sql.Connection;
import java.sql.SQLException;

public interface OrderDetailDAO extends CrudDAO<OrderDetail> {
    boolean save(OrderDetail entity, Connection connection) throws SQLException;
}
