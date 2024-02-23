package br.com.tlf.edutech.msedutecha.core.port.out;

import br.com.tlf.edutech.msedutecha.infrastructure.basepre.persistence.entity.Registro;

public interface BasePreOut {

    Registro save(Registro registro);
}
