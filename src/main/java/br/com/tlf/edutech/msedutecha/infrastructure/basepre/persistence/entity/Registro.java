package br.com.tlf.edutech.msedutecha.infrastructure.basepre.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Registro {

    @Id
    private String id;
    private Customer customer;
    private Product product;
    private Promo promo;
}
