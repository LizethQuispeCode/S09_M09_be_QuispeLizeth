package pe.edu.vallegrande.eduSmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.eduSmart.model.Destino;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Integer> {
}
