package bo.impl;

import bo.custom.ItemBO;
import dao.DAOFactory;
import dao.custom.ItemDAO;
import dto.ItemDTO;
import entity.Item;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemBOImpl implements ItemBO {
    ItemDAO itemDAO = (ItemDAO) DAOFactory.getDaoFactory().getDao(DAOFactory.DAOTypes.ITEM);
    @Override
    public boolean saveItem(ItemDTO dto, Connection connection) throws SQLException {
        return itemDAO.save(new Item(dto.getItemCode(), dto.getItemName(), dto.getQtyOnHand(),dto.getUnitPrice()),connection);
    }

    @Override
    public boolean updateItem(String itemCode, ItemDTO itemDTO, Connection connection) {
        Item item = new Item(itemCode,itemDTO.getItemName(),itemDTO.getQtyOnHand(),itemDTO.getUnitPrice());
        return itemDAO.update(itemCode,item,connection);
    }

    @Override
    public List<ItemDTO> getItem(Connection connection) throws SQLException {
        List<Item> items = itemDAO.get(connection);
        List<ItemDTO> itemDTOS = new ArrayList<>();

        for(Item item : items){
            ItemDTO itemDTO = new ItemDTO();
            itemDTO.setItemCode(item.getItemCode());
            itemDTO.setItemName(item.getItemName());
            itemDTO.setQtyOnHand(item.getQtyOnHand());
            itemDTO.setUnitPrice(item.getUnitPrice());
            itemDTOS.add(itemDTO);
        }
        return itemDTOS;
    }

    @Override
    public boolean deleteItem(String itemCode, Connection connection) {
        return itemDAO.delete(itemCode,connection);
    }
}
