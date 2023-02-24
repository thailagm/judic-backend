package br.rti.tcc.judicbackend.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "verbete")
public class Verbete {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "verbete_id_seq")
    @SequenceGenerator(name ="verbete_id_seq", sequenceName = "verbete_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    private String verbete;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumns(value = {
            @JoinColumn(name = "verbete_id", referencedColumnName = "id")
    })
    private List<Significado> significados;
}
