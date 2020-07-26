package com.intraway.mefa.fizzbuzz.infraestructura.persistencia.builder;

import com.intraway.mefa.fizzbuzz.dominio.Operacion;
import com.intraway.mefa.fizzbuzz.infraestructura.persistencia.entidad.OperacionEntity;

public class OperacionBuilder {
    public OperacionBuilder() {

    }
    public static Operacion convertirADominio(OperacionEntity operacionEntity)
    {
        Operacion operacion=null;
        if(operacionEntity!=null)
        {
            operacion=new Operacion(operacionEntity.getTimestamp(),operacionEntity.getCode(),operacionEntity.getDescription(),operacionEntity.getList());
        }
        return operacion;
    }
    public static OperacionEntity convertirAEntity(Operacion operacion)
    {
        OperacionEntity operacionEntity=new OperacionEntity();
        operacionEntity.setId(operacion.getId());
        operacionEntity.setTimestamp(operacion.getTimestamp());
        operacionEntity.setCode(operacion.getCode());
        operacionEntity.setDescription(operacion.getDescription());
        operacionEntity.setList(operacion.getList());
        return operacionEntity;
    }
}
