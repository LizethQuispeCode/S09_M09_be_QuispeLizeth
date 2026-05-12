package pe.edu.vallegrande.eduSmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.eduSmart.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {
}
