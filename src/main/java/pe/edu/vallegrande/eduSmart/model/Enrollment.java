package pe.edu.vallegrande.eduSmart.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String course;
    private LocalDate date;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}