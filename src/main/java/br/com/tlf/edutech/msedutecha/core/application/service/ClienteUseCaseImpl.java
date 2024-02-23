package br.com.tlf.edutech.msedutecha.core.application.service;

import br.com.tlf.edutech.msedutecha.api.client.rest.dto.RequestClienteDTO;
import br.com.tlf.edutech.msedutecha.api.client.rest.dto.ResponseClienteDTO;
import br.com.tlf.edutech.msedutecha.core.port.in.ClienteUseCase;
import br.com.tlf.edutech.msedutecha.core.port.out.BasePreOut;
import br.com.tlf.edutech.msedutecha.core.port.out.EdutechMsBOut;
import br.com.tlf.edutech.msedutecha.infrastructure.basepre.persistence.entity.Registro;
import br.com.tlf.edutech.msedutecha.infrastructure.edutechmsb.rest.client.dto.RequestMsBDTO;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;

@Service
@Slf4j
public class ClienteUseCaseImpl implements ClienteUseCase {

    @Autowired
    private BasePreOut basePreOut;

    @Autowired
    private EdutechMsBOut edutechMsBOut;

    @Override
    public ResponseClienteDTO cad(RequestClienteDTO requestCliente) {
        var mapper = new ModelMapper();
        if("pre".equals(requestCliente.getProduct().getType())){
            log.info("Sim é do tipo pre");


            var registro = mapper.map(requestCliente, Registro.class);

            return mapper.map(basePreOut.save(registro), ResponseClienteDTO.class);
        }

        log.info("Não é pre, é {}", requestCliente.getProduct().getType());

        return mapper.map(edutechMsBOut.cad(mapper.map(requestCliente, RequestMsBDTO.class)), ResponseClienteDTO.class);

    }
}
