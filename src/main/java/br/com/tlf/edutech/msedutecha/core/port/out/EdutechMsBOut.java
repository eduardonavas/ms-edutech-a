package br.com.tlf.edutech.msedutecha.core.port.out;

import br.com.tlf.edutech.msedutecha.infrastructure.edutechmsb.rest.client.dto.RequestMsBDTO;
import br.com.tlf.edutech.msedutecha.infrastructure.edutechmsb.rest.client.dto.ResponseMsBDTO;

public interface EdutechMsBOut {
    ResponseMsBDTO cad(RequestMsBDTO requestMsBDTO);

}
