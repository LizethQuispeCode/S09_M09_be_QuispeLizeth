package pe.edu.vallegrande.eduSmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.eduSmart.model.Reserva;
import pe.edu.vallegrande.eduSmart.repository.ReservaRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;
    
    public List<Reserva> obtenerTodas() {
        return reservaRepository.findAll();
    }
    
    public Optional<Reserva> obtenerPorId(Integer id) {
        return reservaRepository.findById(id);
    }
    
    public Reserva crear(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
    
    public Reserva actualizar(Integer id, Reserva reservaActualizada) {
        Optional<Reserva> reserva = reservaRepository.findById(id);
        if (reserva.isPresent()) {
            Reserva r = reserva.get();
            r.setNombreCliente(reservaActualizada.getNombreCliente());
            r.setEmail(reservaActualizada.getEmail());
            r.setTelefonoContacto(reservaActualizada.getTelefonoContacto());
            r.setDestinoId(reservaActualizada.getDestinoId());
            r.setFechaSalida(reservaActualizada.getFechaSalida());
            r.setCantidadPersonas(reservaActualizada.getCantidadPersonas());
            r.setMontoPago(reservaActualizada.getMontoPago());
            r.setEstado(reservaActualizada.getEstado());
            r.setComentarios(reservaActualizada.getComentarios());
            return reservaRepository.save(r);
        }
        return null;
    }
    
    public boolean eliminar(Integer id) {
        if (reservaRepository.existsById(id)) {
            reservaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
