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
@Table(name = "papel")
public class Papel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "papel_id_seq")
    @SequenceGenerator(name ="papel_id_seq", sequenceName = "papel_id_seq", allocationSize = 1)
    private Long id;

    private String nome;
}
