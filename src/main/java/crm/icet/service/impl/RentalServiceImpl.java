package crm.icet.service.impl;

import crm.icet.dto.Rental;
import crm.icet.entity.RentalEntity;
import crm.icet.repository.RentalRepository;
import crm.icet.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class RentalServiceImpl implements RentalService {

    private final RentalRepository repository;
    private final ModelMapper mapper;

    @Override
    public RentalEntity addRental(Rental rental) {
        return repository.save(mapper.map(rental, RentalEntity.class));
    }

    @Override
    public List<Rental> getAll() {
        List<Rental> rentalArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            Rental map = mapper.map(entity, Rental.class);
            rentalArrayList.add(map);
        });
        return rentalArrayList;
    }

    @Override
    public void deleteRentalById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Rental searchRentalById(Integer id) {
        Optional<RentalEntity> byId = repository.findById(id);

        return mapper.map(byId, Rental.class);
    }

    @Override
    public RentalEntity updateRentalById(Rental rental) {
        RentalEntity map = mapper.map(rental, RentalEntity.class);
        return repository.save(map);
    }
}
