package br.com.tlf.edutech.msedutecha.api.client.rest.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PromoDTO {
    private String name;
    private Date validUntil;
}
