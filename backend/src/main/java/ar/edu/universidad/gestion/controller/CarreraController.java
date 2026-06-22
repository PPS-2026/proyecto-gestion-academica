package ar.edu.universidad.gestion.controller;

import ar.edu.universidad.gestion.dto.CarreraDTO;
import ar.edu.universidad.gestion.service.CarreraService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carreras")
public class CarreraController {
    @Autowired
    private CarreraService service;

    @Operation(summary = "Obtiene el listado completo de carreras")
    @GetMapping
    public List<CarreraDTO> obtenerTodas() {
        return service.listarTodos();
    }
}