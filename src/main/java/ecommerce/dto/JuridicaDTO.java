package ecommerce.dto;

import ecommerce.entities.Juridica;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class JuridicaDTO {

    private Long id;
    private String name;

    public JuridicaDTO(Juridica juridica) {
        id = juridica.getId();
        name = juridica.getName();

    }//end class

}