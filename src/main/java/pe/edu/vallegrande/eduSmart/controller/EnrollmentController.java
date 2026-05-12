package pe.edu.vallegrande.eduSmart.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.eduSmart.model.Enrollment;
import pe.edu.vallegrande.eduSmart.service.EnrollmentService;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
@CrossOrigin("*")
public class EnrollmentController {

    private final EnrollmentService service;

    public EnrollmentController(EnrollmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Enrollment> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Enrollment create(@RequestBody Enrollment e) {
        return service.save(e);
    }

    @PutMapping("/{id}")
    public Enrollment update(@PathVariable Integer id, @RequestBody Enrollment e) {
        e.setId(id);
        return service.save(e);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}