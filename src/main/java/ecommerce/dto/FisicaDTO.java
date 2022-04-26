package ecommerce.dto;

import ecommerce.entities.Fisica;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class FisicaDTO {

    private Long id;
    private String name;
    private String cpf;

    public FisicaDTO(Fisica fisica) {
        id = fisica.getId();
        name = fisica.getName();
        cpf = fisica.getCpf();


    }

}//end class
