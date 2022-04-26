package ecommerce.dto;

import ecommerce.entities.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ClienteDTO {

    private Long id;
    private String name;

    public ClienteDTO(Cliente cliente) {
        id = cliente.getId();
        name = cliente.getName();
    }

}
