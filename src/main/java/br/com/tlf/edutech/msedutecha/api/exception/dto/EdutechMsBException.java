package br.com.tlf.edutech.msedutecha.api.exception.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EdutechMsBException {

    private int status;
    private String message;
}
