package br.rti.tcc.judicbackend.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class PessoaDTO {
    private String Nome;
    private String Username;

    private String Papel;


    private List<VerbeteDTO> verbetes;

    /*
    private List<TelefoneDTO> telefones;

    private List<EmailDTO> emails;
    */
}
