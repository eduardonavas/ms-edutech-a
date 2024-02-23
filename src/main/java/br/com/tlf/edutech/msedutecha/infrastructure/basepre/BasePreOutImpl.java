package br.com.tlf.edutech.msedutecha.infrastructure.basepre;

import br.com.tlf.edutech.msedutecha.core.port.out.BasePreOut;
import br.com.tlf.edutech.msedutecha.infrastructure.basepre.persistence.BasePreMongo;
import br.com.tlf.edutech.msedutecha.infrastructure.basepre.persistence.entity.Registro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasePreOutImpl implements BasePreOut {

    @Autowired
    private BasePreMongo basePreMongo;


    @Override
    public Registro save(Registro registro) {
        return basePreMongo.save(registro);
    }
}
