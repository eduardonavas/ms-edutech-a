package br.com.tlf.edutech.msedutecha.infrastructure.basepre.persistence.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String id;
    private String type;
    private int credit;
}
