package com.intraway.mefa.fizzbuzz.aplicacion.comando;

public class ComandoOperacion {
    private Long id;
    private Long timestamp;
    private String code;
    private String description;
    private String list;


    public ComandoOperacion(Long timestamp, String code, String description, String list) {
        this.timestamp = timestamp;
        this.code = code;
        this.description = description;
        this.list = list;
    }

    public Long getId() {
        return id;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getList() {
        return list;
    }
}
