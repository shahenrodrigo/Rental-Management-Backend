package crm.icet.controller;

import crm.icet.dto.Rental;
import crm.icet.entity.RentalEntity;
import crm.icet.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/rental")

public class RentalController {

    final RentalService rentalService;

    @PostMapping("/add-rental")

    public RentalEntity addRental(@RequestBody Rental rental){
        return rentalService.addRental(rental);
    }

    @GetMapping("/get-all")

    public List<Rental> getAllRental(){
        return rentalService.getAll();
    }

    @GetMapping("/search-by-id/{id}")

    public Rental getRentalById(@PathVariable Integer id){
        return rentalService.searchRentalById(id);
    }

    @PutMapping("/update-rental")
    public RentalEntity updateRentalById(@RequestBody Rental rental){

        return rentalService.updateRentalById(rental);
    }



    @DeleteMapping("/delete-by-id/{id}")
    public void deleteRentalById(@PathVariable Integer id){

        rentalService.deleteRentalById(id);
    }

}
