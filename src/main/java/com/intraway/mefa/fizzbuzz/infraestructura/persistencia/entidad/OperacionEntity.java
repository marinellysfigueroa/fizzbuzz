package com.intraway.mefa.fizzbuzz.infraestructura.persistencia.entidad;

import javax.persistence.*;


@Entity(name = "Operacion")
@NamedQuery(name = "Operacion.listAll", query = "SELECT operacion FROM Operacion operacion")
public class OperacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Long timestamp;
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String list;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }
}
