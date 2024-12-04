package crm.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class HardwareItem {

    private Long id;
    private String itName;
    private Integer rentalPerDay;
    private Integer finePerDay;
    private String status;

}
