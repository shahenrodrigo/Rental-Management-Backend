package crm.icet.service;

import crm.icet.dto.Rental;
import crm.icet.entity.RentalEntity;

import java.util.List;

public interface RentalService {

    RentalEntity addRental(Rental rental);

    List<Rental> getAll();

    void deleteRentalById(Integer id);

    Rental searchRentalById(Integer id);

    RentalEntity updateRentalById(Rental rental);


}
