package com.example.Restaurant_API_Gateway.exception;

public class JwtTokenMalformedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public JwtTokenMalformedException(String msg) {
        super(msg);
    }

}