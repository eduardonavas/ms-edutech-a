package br.com.tlf.edutech.msedutecha.infrastructure.edutechmsb.rest.client;


import br.com.tlf.edutech.msedutecha.infrastructure.edutechmsb.rest.client.dto.RequestMsBDTO;
import br.com.tlf.edutech.msedutecha.infrastructure.edutechmsb.rest.client.dto.ResponseMsBDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "edutech-ms-b-client", url = "${api.ms-edutech-b.url}")
public interface EdutechMsB {

    @PostMapping("/cad")
    ResponseMsBDTO cad(@RequestBody RequestMsBDTO requestMsBDTO);

}
