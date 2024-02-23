package br.com.tlf.edutech.msedutecha.infrastructure.edutechmsb.rest;

import br.com.tlf.edutech.msedutecha.core.port.out.EdutechMsBOut;
import br.com.tlf.edutech.msedutecha.infrastructure.edutechmsb.rest.client.EdutechMsB;
import br.com.tlf.edutech.msedutecha.infrastructure.edutechmsb.rest.client.dto.RequestMsBDTO;
import br.com.tlf.edutech.msedutecha.infrastructure.edutechmsb.rest.client.dto.ResponseMsBDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdutechMsBOutImpl implements EdutechMsBOut {

    @Autowired
    private EdutechMsB edutechMsB;

    @Override
    public ResponseMsBDTO cad(RequestMsBDTO requestMsBDTO) {
        return edutechMsB.cad(requestMsBDTO);
    }
}
