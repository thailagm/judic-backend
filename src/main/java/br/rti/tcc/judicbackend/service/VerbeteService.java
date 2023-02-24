package br.rti.tcc.judicbackend.service;

import br.rti.tcc.judicbackend.adapter.Adaptador;
import br.rti.tcc.judicbackend.model.VerbeteDTO;
import br.rti.tcc.judicbackend.repository.VerbeteRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VerbeteService {

    private VerbeteRepository verbeteRepository;

    private Adaptador adaptador;

    VerbeteService(VerbeteRepository verbeteRepository, @Qualifier("glossario") Adaptador adaptador1){
        this.verbeteRepository = verbeteRepository;
        this.adaptador = adaptador1;
    }

    public Page<VerbeteDTO> listAll(Pageable page){
        return (Page<VerbeteDTO>) adaptador.mapping(verbeteRepository.findAll(page), page);
    }

    public Page<VerbeteDTO> findByVerbete(String verbete, Pageable page){
        return (Page<VerbeteDTO>) adaptador.mapping(verbeteRepository.buscaPorVerbete(verbete, page), page);
    }
}
