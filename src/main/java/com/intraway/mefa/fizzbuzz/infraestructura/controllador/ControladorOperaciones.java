package com.intraway.mefa.fizzbuzz.infraestructura.controllador;

import com.intraway.mefa.fizzbuzz.aplicacion.manejadores.ManejadorCrearOperacion;
import com.intraway.mefa.fizzbuzz.aplicacion.manejadores.ManejadorListarOperaciones;
import com.intraway.mefa.fizzbuzz.infraestructura.persistencia.entidad.OperacionEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/operacion")
public class ControladorOperaciones {
    private final ManejadorCrearOperacion manejadorCrearOperacion;
    private final ManejadorListarOperaciones manejadorListarOperaciones;

    public ControladorOperaciones(ManejadorCrearOperacion manejadorCrearOperacion, ManejadorListarOperaciones manejadorListarOperaciones) {
        this.manejadorCrearOperacion = manejadorCrearOperacion;
        this.manejadorListarOperaciones = manejadorListarOperaciones;
    }

    @GetMapping("/listar")
    public List<OperacionEntity> listarOperaciones() {
        return this.manejadorListarOperaciones.listarOperaciones();
    }

    @GetMapping("/hola")
    public String saludar()
    {
        return "Hello World!!";

    }
}
