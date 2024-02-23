package br.com.tlf.edutech.msedutecha.infrastructure.basepre.persistence.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private String name;
    private int age;
    private String phoneNumber;
    private String  email;
}
