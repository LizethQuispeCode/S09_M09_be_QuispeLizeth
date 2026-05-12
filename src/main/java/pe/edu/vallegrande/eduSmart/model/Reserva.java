package pe.edu.vallegrande.eduSmart.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.Date; 

@Entity
@Table(name = "Reservas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nombreCliente", nullable = false)
    private String nombreCliente;
    
    @Column(nullable = false)
    private String email;
    
    @Column(name = "telefonoContacto")
    private String telefonoContacto;
    
    @Column(name = "destinoId", nullable = false)
    private Integer destinoId;
    
    @Column(name = "fechaSalida", nullable = false)
    private LocalDate fechaSalida;
    
    @Column(name = "cantidadPersonas", nullable = false)
    private Integer cantidadPersonas;
    
    @Column(name = "montoPago", nullable = false)
    private Double montoPago;
    
    @Column(nullable = false)
    private String estado;
    
    private String comentarios;
    
    @Column(name = "fechaReserva")
    private Date fechaReserva;
}
