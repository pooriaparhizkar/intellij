package com.example.demo.DTO;

public class BaseResponseDTO {
    private String message;
    private int code;

//    public BaseResponseDTO(String message, int code) {
//        this.message = message;
//        this.code = code;
//    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

