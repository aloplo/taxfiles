package gov.irs.taxfiles.services;

import gov.irs.taxfiles.models.TaxFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gov.irs.taxfiles.repositories.TaxFilesRepository;

@Service
public class TaxFilesServiceImpl implements TaxFilesService {

    private TaxFilesRepository repository;

    public TaxFilesServiceImpl(@Autowired TaxFilesRepository repository) {
        this.repository = repository;
    }

    @Override
    public TaxFile retrieveTaxFile(String itin) {
        return repository.findTaxFile(itin);
    }
}
