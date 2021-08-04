package tutorials.restfull;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    List<Employee> all(){
        return repository.findAll();
    }

    @PostMapping("")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }


}
