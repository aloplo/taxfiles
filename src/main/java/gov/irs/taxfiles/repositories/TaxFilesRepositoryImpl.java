package gov.irs.taxfiles.repositories;

import gov.irs.taxfiles.models.TaxFile;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Repository
public class TaxFilesRepositoryImpl implements TaxFilesRepository {

    private static Map<Long, TaxFile> taxFiles = new HashMap<>();
    static {
        taxFiles.put(123L, new TaxFile("Doe", "Chicago", BigDecimal.valueOf(9899)));
        taxFiles.put(234L, new TaxFile("Mason", "Pittsburgh", BigDecimal.valueOf(356)));
        taxFiles.put(345L, new TaxFile("Anderson", "Delaware", BigDecimal.valueOf(15878)));
        taxFiles.put(456L, new TaxFile("Simmons", "Detroit", BigDecimal.valueOf(9899)));
    }
    @Override
    public TaxFile findTaxFile(String itin) {
//        return new TaxFile(
//                "Doe",
//                "Detroit",
//                BigDecimal.valueOf(9899)
//        );
        return taxFiles.get(Long.parseLong(itin));

    }
}
