package gov.irs.taxfiles.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class TaxFile {
    private String lastname;
    private String city;
    private BigDecimal debt;
}
