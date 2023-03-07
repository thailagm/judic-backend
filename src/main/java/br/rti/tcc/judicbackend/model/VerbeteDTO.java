package br.rti.tcc.judicbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class VerbeteDTO {
    private Long id;

    private String verbete;


    private List<SignificadoDTO> significados;

}
