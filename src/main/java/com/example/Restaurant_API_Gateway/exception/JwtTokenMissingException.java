package com.example.Restaurant_API_Gateway.exception;

public class JwtTokenMissingException extends RuntimeException {

    private String message;
    private static final long serialVersionUID = 1L;

    public JwtTokenMissingException(String msg) {
        super(msg);
        this.message = msg;
    }

}