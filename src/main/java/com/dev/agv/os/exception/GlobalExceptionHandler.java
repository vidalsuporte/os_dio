package com.dev.agv.os.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.IllegalFormatException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalFormatException.class)
    public ResponseEntity<String> handlerDateFormatException (IllegalFormatException dateFormatException){

        return  new ResponseEntity<>("Data no formato inválido", HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handlerbusinessException (IllegalArgumentException businessException){

        return  new ResponseEntity<>(new IllegalArgumentException().getMessage(),HttpStatus.CONFLICT) ;   }




}
