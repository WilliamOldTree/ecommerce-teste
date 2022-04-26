package ecommerce.services;

import ecommerce.dto.JuridicaDTO;
import ecommerce.entities.Juridica;
import ecommerce.repositories.JuridicaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class JuridicaService {


    private JuridicaRepository repository;

    public JuridicaDTO findById(Long id) {
        Juridica entity = repository.findById(id).get();
        JuridicaDTO dto = new JuridicaDTO(entity);
        return dto;
    }

    public JuridicaDTO saveJuridica (Juridica juridica){
        Juridica entity = repository.save(juridica);
        JuridicaDTO dto = new JuridicaDTO(entity);
        return dto;
    }

    public void deleteJuridica(Long id){
        repository.deleteById(id);
    }

    public List<JuridicaDTO> getAllJuridica (){
        List <Juridica> clientes = repository.findAll();
        List <JuridicaDTO> dto = new ArrayList<>();
        for (Juridica juridica: clientes){
            dto.add(new JuridicaDTO(juridica));
        }
        return dto;
    }



}//end class
