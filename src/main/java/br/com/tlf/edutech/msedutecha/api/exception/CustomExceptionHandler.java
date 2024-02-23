package br.com.tlf.edutech.msedutecha.api.exception;

import br.com.tlf.edutech.msedutecha.api.exception.dto.CustomError;
import br.com.tlf.edutech.msedutecha.api.exception.dto.EdutechMsBException;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;
import java.util.Date;

@ControllerAdvice
@Slf4j
public class CustomExceptionHandler {

    @ExceptionHandler(FeignException.class)
    public ResponseEntity<CustomError> handleFeignException(FeignException e) throws IOException {
        var body = e.responseBody().get();

        var bytes = new byte[body.remaining()];
        body.get(bytes);

        var msBException = new ObjectMapper().readValue(bytes, EdutechMsBException.class);
        var erro = CustomError.builder()
                .code(msBException.getStatus())
                .message(msBException.getMessage())
                .timestamp(new Date()).build();

        return ResponseEntity.status(erro.getCode()).body(erro);
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<CustomError> handleException(Exception e){
        var error = CustomError.builder()
                .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .timestamp(new Date())
                .message(e.getMessage())
                .build();

        log.error(e.getClass().getName(), e);
        return ResponseEntity.status(error.getCode()).body(error);
    }
}
