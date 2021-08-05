package tutorials.restfull;

public class EmployeeNotFoundException extends RuntimeException{
    EmployeeNotFoundException(Long id) {
        super("Cloud not find employee " + id);
    }
}
