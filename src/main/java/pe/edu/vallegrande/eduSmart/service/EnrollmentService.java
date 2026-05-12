package pe.edu.vallegrande.eduSmart.service;
import org.springframework.stereotype.Service;
 import pe.edu.vallegrande.eduSmart.model.Enrollment;
import pe.edu.vallegrande.eduSmart.repository.EnrollmentRepository;

import java.util.List;

@Service
public class EnrollmentService {

    private final EnrollmentRepository repository;

    public EnrollmentService(EnrollmentRepository repository) {
        this.repository = repository;
    }

    public List<Enrollment> getAll() {
        return repository.findAll();
    }

    public Enrollment save(Enrollment e) {
        return repository.save(e);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}