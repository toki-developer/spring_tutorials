package tutorials.restfull;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

import java.util.Objects;

public class Employee {

    @Id
    private Long id;
    private String firstname;
    private String lastname;
    private String role;

    Employee(String firstname, String lastname, String role) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
    }

    public String getName() {
        return this.firstname + " " + this.lastname;
    }
    public void setName(String name){
        String[] parts = name.split(" ");
        this.firstname = parts[0];
        this.lastname = parts[1];
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id)
                && Objects.equals(this.firstname, employee.firstname)
                && Objects.equals(this.lastname, employee.lastname)
                && Objects.equals(this.role, employee.role);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstname, this.lastname, this.role);
    }
    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", firstname='" + this.firstname + '\'' + ", lastname='" + this.lastname
                + '\'' + ", role='" + this.role + '\'' + '}';
    }

}
