package br.rti.tcc.judicbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_id_seq")
    @SequenceGenerator(name ="pessoa_id_seq", sequenceName = "pessoa_id_seq", allocationSize = 1)
    private Long id;
    private String nome;
    private String usuario;

    private String email;

    private String senha;


    @ManyToOne
    @JoinColumn(name = "papel_id")
    private Papel papel;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumns(value = {
            @JoinColumn(name = "papel_id", referencedColumnName = "id")
    })
    private List<Verbete> verbetes;

}
