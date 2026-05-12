package pe.edu.vallegrande.eduSmart.controller;

  import org.springframework.web.bind.annotation.*;
  import pe.edu.vallegrande.eduSmart.model.Course;
  import pe.edu.vallegrande.eduSmart.service.CourseService;

  import java.util.List;

@RestController
@RequestMapping("/courses")
@CrossOrigin("*")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping
    public List<Course> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Course create(@RequestBody Course course) {
        return service.save(course);
    }

    @PutMapping("/{id}")
    public Course update(@PathVariable Integer id, @RequestBody Course course) {
        course.setId(id);
        return service.save(course);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}