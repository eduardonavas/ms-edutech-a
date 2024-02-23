package br.com.tlf.edutech.msedutecha.infrastructure.basepre.persistence;

import br.com.tlf.edutech.msedutecha.infrastructure.basepre.persistence.entity.Registro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BasePreMongo extends MongoRepository<Registro, String> {
}
