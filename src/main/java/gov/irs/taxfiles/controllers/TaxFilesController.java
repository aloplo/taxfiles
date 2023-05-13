package gov.irs.taxfiles.controllers;

import gov.irs.taxfiles.models.TaxFile;
import gov.irs.taxfiles.services.TaxFilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/taxfiles")
@RestController
public class TaxFilesController {

    private TaxFilesService service;

    public TaxFilesController(@Autowired TaxFilesService service) {
        this.service = service;
    }

    @GetMapping("/client")
    public String getClient() {
        return "Brady";
    }

    @GetMapping("/itin/{itin}")
    public ResponseEntity<TaxFile> getTaxFile(@PathVariable String itin) {
        TaxFile taxFile = service.retrieveTaxFile(itin);
        return new ResponseEntity<>(taxFile, HttpStatus.OK);
    }
}
