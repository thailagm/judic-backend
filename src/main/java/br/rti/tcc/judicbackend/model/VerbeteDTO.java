package br.rti.tcc.judicbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VerbeteDTO {
    private Long id;

    private String verbete;

    private Long pessoa;

}
