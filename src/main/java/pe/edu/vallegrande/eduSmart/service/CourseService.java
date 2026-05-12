package pe.edu.vallegrande.eduSmart.service;

import pe.edu.vallegrande.eduSmart.model.Course;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.eduSmart.repository.CourseRepository;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public List<Course> getAll() {
        return repository.findAll();
    }

    public Course save(Course course) {
        return repository.save(course);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}