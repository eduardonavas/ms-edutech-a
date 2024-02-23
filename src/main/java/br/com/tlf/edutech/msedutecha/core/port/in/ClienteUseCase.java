package br.com.tlf.edutech.msedutecha.core.port.in;

import br.com.tlf.edutech.msedutecha.api.client.rest.dto.RequestClienteDTO;
import br.com.tlf.edutech.msedutecha.api.client.rest.dto.ResponseClienteDTO;

public interface ClienteUseCase {

    ResponseClienteDTO cad(RequestClienteDTO requestCliente);
}
