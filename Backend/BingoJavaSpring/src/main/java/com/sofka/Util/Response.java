package com.sofka.Util;

import org.springframework.http.HttpStatus;

public class Response {
    private Integer status;
    private Object data;

    public Response() {
        this.status = HttpStatus.OK.value();
        this.data = data;
    }
}
