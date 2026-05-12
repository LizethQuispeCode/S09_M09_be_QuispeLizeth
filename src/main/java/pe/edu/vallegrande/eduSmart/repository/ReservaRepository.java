package pe.edu.vallegrande.eduSmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.eduSmart.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
