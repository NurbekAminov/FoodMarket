package com.example.exeption;

public class UnAuthorizedException extends RuntimeException {
    public UnAuthorizedException(String not_authorized) {
        getMessage();
    }
}
