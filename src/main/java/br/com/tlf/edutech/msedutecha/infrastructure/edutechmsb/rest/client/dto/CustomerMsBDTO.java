package br.com.tlf.edutech.msedutecha.infrastructure.edutechmsb.rest.client.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerMsBDTO {
    private String name;
    private int age;
    private String phoneNumber;
    private String  email;
}
