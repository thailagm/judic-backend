package br.rti.tcc.judicbackend.model;

import br.rti.tcc.judicbackend.adapter.Adaptador;
import br.rti.tcc.judicbackend.repository.VerbeteRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Qualifier("glossario")
public class VerbeteAdapterImpl implements Adaptador<Page<VerbeteDTO>,Page<Verbete>> {
    private List<VerbeteDTO> verbeteDTOS;

    VerbeteAdapterImpl(VerbeteRepository verbeteRepository){
        this.verbeteDTOS = new ArrayList<>();
    }

    @Override
    public Page<VerbeteDTO> mapping(Page<Verbete> lista, Pageable page){
        verbeteDTOS.clear();

        lista.forEach(verbete -> {
            List<SignificadoDTO> significadoDTOS = new ArrayList<>();
            verbete.getSignificados().forEach(significado -> {
                significadoDTOS.add(new SignificadoDTO(significado.getSignificado()));
            });

            this.verbeteDTOS.add(
                    new VerbeteDTO(
                        verbete.getPessoa().getUsuario(),
                        verbete.getId(),
                        verbete.getVerbete(),
                        significadoDTOS
                    )
            );
        });

        Page<VerbeteDTO> pageDTO = new PageImpl<>(verbeteDTOS, page, lista.getTotalElements());
        return pageDTO;
    }
}
