package tutorials.restfull;

public class OrderNotFoundException extends RuntimeException {
    OrderNotFoundException(Long id) { super("Cloud not find employee " + id); }
}
