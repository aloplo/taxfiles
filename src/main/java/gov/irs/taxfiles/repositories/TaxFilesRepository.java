package gov.irs.taxfiles.repositories;

import gov.irs.taxfiles.models.TaxFile;

public interface TaxFilesRepository {
    TaxFile findTaxFile(String itin);
}
