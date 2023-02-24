package br.rti.tcc.judicbackend.adapter;

import org.springframework.data.domain.Pageable;

public interface Adaptador<T,Y> {
    T mapping(Y lista, Pageable page);
}
