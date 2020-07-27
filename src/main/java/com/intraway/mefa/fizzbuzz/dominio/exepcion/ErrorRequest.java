package com.intraway.mefa.fizzbuzz.dominio.exepcion;

import java.util.Date;

public class ErrorRequest {
    private Long timestamp;
    private int status;
    private String error;
    private String exception;
    private String message;
    private String path;

    public ErrorRequest(int min, int max) {
        this.timestamp = getTimestamp();
        this.status = 400;
        this.error = "Bad Request";
        this.exception = "com.intraway.exceptions.badrequest";
        this.message = "Los parámetros enviados son incorrectos";
        this.path = "/intraway/api/fizzbuzz/"+min+"/"+max;
    }

    @Override
    public String toString() {
        return "{" +
                "\"timestamp\":" + timestamp +
                ", \"status\":" + status +
                ", \"error\":\"" + error + '\"' +
                ", \"exception\":\"" + exception + '\"' +
                ", \"message\":\"" + message + '\"' +
                ", \"path\":\"" + path + '\"' +
                '}';
    }
    private static Long getTimestamp() {
        Date date = new Date();
        long epochTime = date.getTime();
        return epochTime;
    }
}
