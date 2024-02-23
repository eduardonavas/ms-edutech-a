package br.com.tlf.edutech.msedutecha.api.client.rest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO {
    private String name;
    private int age;
    private String phoneNumber;
    private String  email;
}
