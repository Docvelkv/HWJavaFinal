import java.util.Date;

public class Employee {

    static int employeeCounter = 0;

    String firstName;
    String lastName;
    Date dateOfBirth;
    String department;
    String position;
    double salary;

    public Employee(String firstName, String lastName, Date dateOfBirth,
                    String department, String position, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, Date dateOfBirth,
                    String department, String position) {
        this(firstName, lastName, dateOfBirth, department, position, 50.0);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.position = position;
        salary = 50.0;
    }

}