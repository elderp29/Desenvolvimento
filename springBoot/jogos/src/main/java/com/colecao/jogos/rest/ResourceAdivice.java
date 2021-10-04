package com.colecao.jogos.rest;

import com.colecao.jogos.exception.JogosNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ResourceAdivice {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(JogosNotFoundException.class)
    public void notFound(){}
}
