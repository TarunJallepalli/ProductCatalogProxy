package com.amazonproxy.productcatalog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ControllerAdvisor {

    @ExceptionHandler(Exception.class)
    public void exception(Exception ex) {
        log.error(ex.getMessage());
    }
}
