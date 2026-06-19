package ar.edu.universidad.gestion.service;

import ar.edu.universidad.gestion.dto.EstudianteDTO;
import ar.edu.universidad.gestion.model.Estudiante;
import ar.edu.universidad.gestion.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository repository;

    public List<EstudianteDTO> listarTodos() {
        return repository.findAll().stream().map(e -> {
            EstudianteDTO dto = new EstudianteDTO();
            dto.setId(e.getId());
            dto.setNombre(e.getNombre());
            dto.setApellido(e.getApellido());
            dto.setLegajo(e.getLegajo());
            return dto;
        }).toList();
    }

    public EstudianteDTO guardar(EstudianteDTO dto) {
        Estudiante e = new Estudiante();
        e.setNombre(dto.getNombre());
        e.setApellido(dto.getApellido());
        e.setLegajo(dto.getLegajo());
        repository.save(e);
        return dto;
    }

    public EstudianteDTO obtenerPorId(Long id) {
        Estudiante e = repository.findById(id).orElseThrow(); // Lanza error si no existe
        EstudianteDTO dto = new EstudianteDTO();
        dto.setId(e.getId());
        dto.setNombre(e.getNombre());
        dto.setApellido(e.getApellido());
        dto.setLegajo(e.getLegajo());
        return dto;
    }

    public EstudianteDTO actualizar(Long id, EstudianteDTO dto) {
        Estudiante e = repository.findById(id).orElseThrow();
        e.setNombre(dto.getNombre());
        e.setApellido(dto.getApellido());
        e.setLegajo(dto.getLegajo());
        repository.save(e);
        return dto;
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}

