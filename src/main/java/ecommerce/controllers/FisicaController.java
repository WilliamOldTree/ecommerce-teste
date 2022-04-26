package ecommerce.controllers;

import ecommerce.dto.FisicaDTO;
import ecommerce.entities.Fisica;
import ecommerce.services.FisicaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/fisica")
@AllArgsConstructor
public class FisicaController {

    private FisicaService service;

    @GetMapping(value = "/{id}")
    public FisicaDTO findById(@PathVariable Long id) {
        return service.findById(id);

    }
    @GetMapping(value = "/fisica")
    public List<FisicaDTO> getAllFisica(){
        return service.getAllFisica();
    }

    @PostMapping(value = "/fisica")
    public FisicaDTO saveFisica(@RequestBody Fisica dto) {
        return service.saveFisica(dto);

    }

    @DeleteMapping(value = "/fisica/{id}")
    public void deleteFisica(@PathVariable Long id) {
        service.deleteFisica(id);
    }


}
