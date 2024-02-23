package br.com.tlf.edutech.msedutecha.infrastructure.basepre.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Promo {
    private String name;
    private Date validUntil;
}
