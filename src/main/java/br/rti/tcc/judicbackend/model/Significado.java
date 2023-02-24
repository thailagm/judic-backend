package br.rti.tcc.judicbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "significado")
public class Significado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "significado_id_seq")
    @SequenceGenerator(name ="significado_id_seq", sequenceName = "significado_id_seq", allocationSize = 1)
    private int id;
    private String significado;


    @ManyToOne
    @JoinColumn(name = "verbete_id")
    private Verbete verbete;

}
