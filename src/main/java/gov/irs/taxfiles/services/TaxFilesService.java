package gov.irs.taxfiles.services;

import gov.irs.taxfiles.models.TaxFile;

public interface TaxFilesService {
    public TaxFile retrieveTaxFile(String itin);
}
