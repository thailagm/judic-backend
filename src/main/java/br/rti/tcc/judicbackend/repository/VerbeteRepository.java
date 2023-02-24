package br.rti.tcc.judicbackend.repository;



import br.rti.tcc.judicbackend.model.Verbete;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VerbeteRepository extends JpaRepository<Verbete, Long> {


    @Query(value = "select v from Verbete v where lower(v.verbete) like %?1%")
    Page<Verbete> buscaPorVerbete(String verbete, Pageable page);

}
