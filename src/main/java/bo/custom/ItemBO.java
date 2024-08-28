package bo.custom;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface ItemBO {
    boolean saveItem(ItemDTO dto, Connection connection) throws SQLException;

    boolean updateItem(String itemCode,ItemDTO itemDTO,Connection connection);
    List<ItemDTO> getItem(Connection connection) throws SQLException;
    boolean deleteItem(String itemCode,Connection connection);
}
