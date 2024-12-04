package crm.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Rental {

    private Integer id;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private LocalDate dueDate;
    private Double cost;

}
