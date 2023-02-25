package br.rti.tcc.judicbackend.model;

import lombok.*;
import jakarta.persistence.*;
//import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String usuario;

    private String email;

    private String senha;


    @ManyToOne
    @JoinColumn(name = "papel_id")
    private Papel papel;

/*    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumns(value = {
            @JoinColumn(name = "papel_id", referencedColumnName = "id")
    })
    private List<Verbete> verbetes;*/

}
