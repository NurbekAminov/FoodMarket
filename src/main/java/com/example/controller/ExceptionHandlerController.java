package com.example.controller;


import com.example.exeption.AppBadRequestException;
import com.example.exeption.AppMethodNotAllowedException;
import com.example.exeption.UnAuthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(AppBadRequestException.class)
    public ResponseEntity<String> handler(AppBadRequestException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(UnAuthorizedException.class)
    public ResponseEntity<String> handler(UnAuthorizedException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(AppMethodNotAllowedException.class)
    public ResponseEntity<String> handler(AppMethodNotAllowedException e) {
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handler(RuntimeException e) {
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<String> handler(AccessDeniedException e) {
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).build();
    }
}
