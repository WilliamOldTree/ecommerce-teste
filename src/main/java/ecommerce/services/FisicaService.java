package ecommerce.services;

import ecommerce.dto.FisicaDTO;
import ecommerce.entities.Fisica;
import ecommerce.repositories.FisicaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class FisicaService {


    private FisicaRepository repository;

    public FisicaDTO findById(Long id) {
        Fisica entity = repository.findById(id).get();
        FisicaDTO dto = new FisicaDTO(entity);
        return dto;
    }

    public FisicaDTO saveFisica(Fisica fisica) {
        Fisica entity = repository.save(fisica);
        FisicaDTO dto = new FisicaDTO(entity);
        return dto;
    }

    public void deleteFisica(Long id) {
        repository.deleteById(id);
    }


    public List<FisicaDTO> getAllFisica() {
        List<Fisica> clientes = repository.findAll();
        List<FisicaDTO> dto = new ArrayList<>();
        for (Fisica fisica: clientes) {
            dto.add(new FisicaDTO(fisica));
        }
        return dto;
    }

}

