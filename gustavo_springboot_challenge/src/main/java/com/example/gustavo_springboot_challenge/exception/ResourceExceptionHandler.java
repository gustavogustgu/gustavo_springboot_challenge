package com.example.gustavo_springboot_challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ResourceExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity handlerBadRequest(Exception e){
        StandardError err = new StandardError(HttpStatus.BAD_REQUEST.value(),"Invalid data");
        return new ResponseEntity(err , HttpStatus.BAD_REQUEST);
    }
}