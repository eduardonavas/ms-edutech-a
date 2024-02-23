package br.com.tlf.edutech.msedutecha.api.client.rest;

import br.com.tlf.edutech.msedutecha.api.client.rest.dto.RequestClienteDTO;
import br.com.tlf.edutech.msedutecha.api.client.rest.dto.ResponseClienteDTO;
import br.com.tlf.edutech.msedutecha.core.port.in.ClienteUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteApiController implements ClienteApi{

    @Autowired
    private ClienteUseCase clienteUseCase;

    @Override
    public ResponseClienteDTO cad(RequestClienteDTO requestCliente) {
        return clienteUseCase.cad(requestCliente);
    }
}
