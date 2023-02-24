package br.rti.tcc.judicbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class PapelDTO {
    Long ID;
    String Papel;

    private List<Pessoa> pessoa;




}
