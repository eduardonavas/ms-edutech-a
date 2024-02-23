package br.com.tlf.edutech.msedutecha.api.client.rest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestClienteDTO {

    private CustomerDTO customer;
    private ProductDTO product;
    private PromoDTO promo;
}
