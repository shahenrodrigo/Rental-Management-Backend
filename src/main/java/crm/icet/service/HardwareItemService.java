package crm.icet.service;

import crm.icet.dto.Customer;
import crm.icet.dto.HardwareItem;
import crm.icet.entity.CustomerEntity;
import crm.icet.entity.HardwareItemEntity;

import java.util.List;

public interface HardwareItemService {

    HardwareItemEntity addItem(HardwareItem hardwareItem);

    List<HardwareItem> getAll();

    void deleteItemById(Integer id);

    HardwareItem searchItemById(Integer id);

    HardwareItemEntity updateItemById(HardwareItem hardwareItem);
}
