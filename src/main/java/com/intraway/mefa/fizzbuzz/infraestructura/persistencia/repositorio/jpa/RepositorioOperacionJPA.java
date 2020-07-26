package com.intraway.mefa.fizzbuzz.infraestructura.persistencia.repositorio.jpa;

import com.intraway.mefa.fizzbuzz.infraestructura.persistencia.entidad.OperacionEntity;

import java.util.List;

public interface RepositorioOperacionJPA {
    List<OperacionEntity> listarOperaciones();
}
