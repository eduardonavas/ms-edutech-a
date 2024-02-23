package br.com.tlf.edutech.msedutecha.infrastructure.edutechmsb.rest.client.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestMsBDTO {
    private CustomerMsBDTO customer;
    private ProductMsBDTO product;
}
