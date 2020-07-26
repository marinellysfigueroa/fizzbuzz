package com.intraway.mefa.fizzbuzz.infraestructura.persistencia.repositorio;

import com.intraway.mefa.fizzbuzz.dominio.Operacion;
import com.intraway.mefa.fizzbuzz.dominio.repositorio.RepositorioOperacion;
import com.intraway.mefa.fizzbuzz.infraestructura.persistencia.builder.OperacionBuilder;
import com.intraway.mefa.fizzbuzz.infraestructura.persistencia.entidad.OperacionEntity;
import com.intraway.mefa.fizzbuzz.infraestructura.persistencia.repositorio.jpa.RepositorioOperacionJPA;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioOperacionPersistente implements RepositorioOperacion, RepositorioOperacionJPA {
    private static final String OPERACION_LIST_ALL = "Operacion.listAll";
    private EntityManager entityManager;

    public RepositorioOperacionPersistente(EntityManager entityManager) {

        this.entityManager = entityManager;
    }


    @Override
    public List<OperacionEntity> listarOperaciones() {
        List<OperacionEntity> list = new ArrayList();
        Query query = entityManager.createNamedQuery(OPERACION_LIST_ALL);

        try {
            list = query.getResultList();
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public void registrarOperacion(Operacion operacion) {
        entityManager.persist(OperacionBuilder.convertirAEntity(operacion));
    }
}
