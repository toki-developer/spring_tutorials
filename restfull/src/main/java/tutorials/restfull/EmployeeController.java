package tutorials.restfull;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    List<Employee> searchAllEmployees(){
        return repository.findAll();
    }

    @PostMapping("")
    Employee addNewEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @GetMapping("/id/{id}")
    Employee searchEmployee(@PathVariable Long id){
        Employee  employee;

            employee = repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
        return employee;
    }

    @PutMapping("/id/{id}")
    Employee editEmployee(@RequestBody Employee newEmployee, @PathVariable Long id){
        return repository.findById(id).map(employee -> {
            employee.setName(newEmployee.getName());
            employee.setRole(newEmployee.getRole());
            return repository.save(employee);
        }).orElseGet(()->{
//            newEmployee.setId(id);
            return repository.save(newEmployee);
        });
    }

    @DeleteMapping("/id/{id}")
    void deleteEmployee(@PathVariable Long id){
        repository.deleteById(id);
    }

}
