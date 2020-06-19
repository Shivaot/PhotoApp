package com.shivaot.photoapp.photoappapiusers.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ResponseDto {

    private String message;
    private long timestamp;

    public ResponseDto(String message, Date timestamp) {
        this.message = message;
        this.timestamp = timestamp.getTime();
    }
}
