package pe.edu.vallegrande.eduSmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.eduSmart.model.Destino;
import pe.edu.vallegrande.eduSmart.service.DestinoService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/destinos")
@CrossOrigin(origins = "http://localhost:4200")
public class DestinoController {
    @Autowired
    private DestinoService destinoService;
    
    @GetMapping
    public ResponseEntity<List<Destino>> obtenerTodos() {
        List<Destino> destinos = destinoService.obtenerTodos();
        return ResponseEntity.ok(destinos);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Destino> obtenerPorId(@PathVariable Integer id) {
        Optional<Destino> destino = destinoService.obtenerPorId(id);
        if (destino.isPresent()) {
            return ResponseEntity.ok(destino.get());
        }
        return ResponseEntity.notFound().build();
    }
    
    @PostMapping
    public ResponseEntity<Destino> crear(@RequestBody Destino destino) {
        Destino nuevoDestino = destinoService.crear(destino);
        return ResponseEntity.ok(nuevoDestino);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Destino> actualizar(@PathVariable Integer id, @RequestBody Destino destino) {
        Destino destinoActualizado = destinoService.actualizar(id, destino);
        if (destinoActualizado != null) {
            return ResponseEntity.ok(destinoActualizado);
        }
        return ResponseEntity.notFound().build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        if (destinoService.eliminar(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
