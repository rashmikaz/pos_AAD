package bo.custom;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface CustomerBO {
    boolean saveCustomer(CustomerDTO dto, Connection connection) throws SQLException;

    boolean updateCustomer(String customerId,CustomerDTO customerDTO,Connection connection);
    List<CustomerDTO> getCustomer(Connection connection) throws SQLException;
    boolean deleteCustomer(String customerId,Connection connection);
}
