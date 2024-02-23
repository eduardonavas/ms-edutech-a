package br.com.tlf.edutech.msedutecha.api.exception.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class CustomError {
    private int code;
    private Date timestamp;
    private String message;
}
