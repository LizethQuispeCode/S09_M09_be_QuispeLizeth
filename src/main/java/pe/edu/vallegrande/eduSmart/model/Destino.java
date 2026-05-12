package pe.edu.vallegrande.eduSmart.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date; 

@Entity
@Table(name = "Destinos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private String pais;
    
    private String descripcion;
    
    @Column(nullable = false)
    private Double costo;
    
    @Column(nullable = false)
    private Integer dias;
    
    private String imagen;
    
    private Boolean disponible;
    
    @Column(name = "fechaCreacion")
    private Date fechaCreacion;
}
