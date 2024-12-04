package crm.icet.service;

import crm.icet.dto.Customer;
import crm.icet.dto.HardwareItem;
import crm.icet.entity.CustomerEntity;
import crm.icet.entity.HardwareItemEntity;
import crm.icet.repository.CustomerRepository;
import crm.icet.repository.HardwareItemRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class HardwareItemServiceImpl implements HardwareItemService{

    private final HardwareItemRepository repository;
    private final ModelMapper mapper;

    @Override
    public HardwareItemEntity addItem(HardwareItem hardwareItem) {
        return repository.save(mapper.map(hardwareItem, HardwareItemEntity.class));
    }

    @Override
    public List<HardwareItem> getAll() {
        List<HardwareItem> itemArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            HardwareItem map = mapper.map(entity, HardwareItem.class);
            itemArrayList.add(map);
        });
        return itemArrayList;
    }

    @Override
    public void deleteItemById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public HardwareItem searchItemById(Integer id) {
        Optional<HardwareItemEntity> byId = repository.findById(id);

        return mapper.map(byId, HardwareItem.class);
    }

    @Override
    public HardwareItemEntity updateItemById(HardwareItem hardwareItem) {
        HardwareItemEntity map = mapper.map(hardwareItem, HardwareItemEntity.class);
        return repository.save(map);
    }
}
