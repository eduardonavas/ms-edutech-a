package br.com.tlf.edutech.msedutecha.api.client.rest;

import br.com.tlf.edutech.msedutecha.api.client.rest.dto.RequestClienteDTO;
import br.com.tlf.edutech.msedutecha.api.client.rest.dto.ResponseClienteDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ClienteApi {

    @PostMapping("/cad")
    ResponseClienteDTO cad(@RequestBody RequestClienteDTO requestCliente);
}
