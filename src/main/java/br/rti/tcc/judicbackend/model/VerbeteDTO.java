package br.rti.tcc.judicbackend.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class VerbeteDTO {


    private String Usuario;
    private Long ID;

    private String Verbete;

    private List<SignificadoDTO> significados;
}
