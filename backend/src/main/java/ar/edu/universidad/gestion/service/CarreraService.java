package ar.edu.universidad.gestion.service;

import ar.edu.universidad.gestion.dto.CarreraDTO;
import ar.edu.universidad.gestion.model.Carrera;
import ar.edu.universidad.gestion.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarreraService {
    @Autowired
    private CarreraRepository repository;

    public List<CarreraDTO> listarTodos() {
        return repository.findAll().stream().map(c -> {
            CarreraDTO dto = new CarreraDTO();
            dto.setId(c.getId());
            dto.setNombre(c.getNombre());
            dto.setDuracion(c.getDuracion());
            return dto;
        }).collect(Collectors.toList());
    }
}