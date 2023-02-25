package br.rti.tcc.judicbackend.model;

import lombok.*;

//import javax.persistence.*;
import jakarta.persistence.*;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "significado")
public class Significado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String significado;


    @ManyToOne
    @JoinColumn(name = "verbete_id")
    private Verbete verbete;

}
