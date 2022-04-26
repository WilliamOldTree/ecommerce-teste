package ecommerce.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Juridica extends Cliente {

    private String cnpj;
    private Date abertura;
    private String inscricaoEstadual;
    private String razaoSocial;

}
