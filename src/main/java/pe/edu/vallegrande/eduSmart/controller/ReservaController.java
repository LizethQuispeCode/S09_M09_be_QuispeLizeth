package pe.edu.vallegrande.eduSmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.eduSmart.model.Reserva;
import pe.edu.vallegrande.eduSmart.service.ReservaService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservas")
@CrossOrigin(origins = "http://localhost:4200")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;
    
    @GetMapping
    public ResponseEntity<List<Reserva>> obtenerTodas() {
        List<Reserva> reservas = reservaService.obtenerTodas();
        return ResponseEntity.ok(reservas);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Reserva> obtenerPorId(@PathVariable Integer id) {
        Optional<Reserva> reserva = reservaService.obtenerPorId(id);
        if (reserva.isPresent()) {
            return ResponseEntity.ok(reserva.get());
        }
        return ResponseEntity.notFound().build();
    }
    
    @PostMapping
    public ResponseEntity<Reserva> crear(@RequestBody Reserva reserva) {
        Reserva nuevaReserva = reservaService.crear(reserva);
        return ResponseEntity.ok(nuevaReserva);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Reserva> actualizar(@PathVariable Integer id, @RequestBody Reserva reserva) {
        Reserva reservaActualizada = reservaService.actualizar(id, reserva);
        if (reservaActualizada != null) {
            return ResponseEntity.ok(reservaActualizada);
        }
        return ResponseEntity.notFound().build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        if (reservaService.eliminar(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
