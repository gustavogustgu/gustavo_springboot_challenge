package com.example.gustavo_springboot_challenge.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class StandardError {

    private Long timeStamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError(Long timeStamp, Integer status, String error, String message, String path) {
        this.timeStamp = timeStamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }
}
