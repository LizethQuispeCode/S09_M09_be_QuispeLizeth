package pe.edu.vallegrande.eduSmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.eduSmart.model.Destino;
import pe.edu.vallegrande.eduSmart.repository.DestinoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class DestinoService {
    @Autowired
    private DestinoRepository destinoRepository;
    
    public List<Destino> obtenerTodos() {
        return destinoRepository.findAll();
    }
    
    public Optional<Destino> obtenerPorId(Integer id) {
        return destinoRepository.findById(id);
    }
    
    public Destino crear(Destino destino) {
        return destinoRepository.save(destino);
    }
    
    public Destino actualizar(Integer id, Destino destinoActualizado) {
        Optional<Destino> destino = destinoRepository.findById(id);
        if (destino.isPresent()) {
            Destino d = destino.get();
            d.setNombre(destinoActualizado.getNombre());
            d.setPais(destinoActualizado.getPais());
            d.setDescripcion(destinoActualizado.getDescripcion());
            d.setCosto(destinoActualizado.getCosto());
            d.setDias(destinoActualizado.getDias());
            d.setImagen(destinoActualizado.getImagen());
            d.setDisponible(destinoActualizado.getDisponible());
            return destinoRepository.save(d);
        }
        return null;
    }
    
    public boolean eliminar(Integer id) {
        if (destinoRepository.existsById(id)) {
            destinoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
