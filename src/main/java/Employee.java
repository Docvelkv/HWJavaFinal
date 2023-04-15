import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Objects;

class Employee {

    private String firstName;
    private String lastName;
    private String snils;
    private LocalDate dateOfBirth;
    private String department;
    private String position;
    private double salary;

    /**
     * Конструктор, принимающий все аргументы
     * @param firstName Имя
     * @param lastName Фамилия
     * @param snils СНИЛС
     * @param dateOfBirth дата рождения
     * @param department отдел/подразделение
     * @param position должность
     * @param salary зарплата в тысячах единиц
     */
    public Employee(String firstName, String lastName, String snils,
                    LocalDate dateOfBirth, String department,
                    String position, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.snils = snils;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    /**
     * Конструктор, принимающий все аргументы, кроме salary
     * Значение salary определено по умолчанию (50.0)
     * @param firstName Имя
     * @param lastName Фамилия
     * @param snils СНИЛС
     * @param dateOfBirth дата рождения
     * @param department отдел/подразделение
     * @param position должность
     */
    public Employee(String firstName, String lastName, String snils, LocalDate dateOfBirth,
                    String department, String position) {
        this(firstName, lastName, snils, dateOfBirth, department, position, 50.0);
        this.firstName = firstName;
        this.lastName = lastName;
        this.snils = snils;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.position = position;
        salary = 50.0;
    }

    public String getfullInfo() {
        return String.format("""
                        ФИО: %s
                        СНИЛС: %s
                        Дата рождения: %s
                        Отдел: %s
                        Должность: %s
                        Зарплата: %s т.р.""",
                        getFullName(), getSnils(), getDateOfBirth(),
                        getDepartment(), getPosition(), getSalary());
    }

    public String getFullName() {return String.format("%s %s", firstName, lastName);}

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setLastName(String lastName) {this.firstName = lastName;}

    public String getSnils() {return snils;}

    public void setSnils(String str){this.snils = str;}

    public String getDateOfBirth() {
        return this.dateOfBirth.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }

    public void setDateOfBirth(int day, int month, int year) {
        this.dateOfBirth = LocalDate.of(year, month, day);
    }

    public String getDepartment() {return department;}

    public void setDepartment(String department) {this.department = department;}

    public String getPosition() {return position;}

    public void setPosition(String position) {this.position = position;}

    public double getSalary() {return salary;}

    public void setSalary(double salary) {this.salary = salary;}

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return (snils == employee.snils
            || (snils != null && snils.equals(employee.getSnils())));
    }

    @Override
    public int hashCode() {
        return 31 * (snils == null ? 0 : snils.hashCode());
    }

    @Override
    public String toString() {
        return "Сотрудник [" + getFullName() + ", " + getSnils() +
                ", " + getDateOfBirth() + ", " + getDepartment() +
                ", " + getPosition() + ", " + getSalary() + "]";
    }

    public boolean olderThan(Employee e) {
        return dateOfBirth.isBefore(e.dateOfBirth);
    }

    public void upgrade(double salary) {
        this.setSalary(this.salary + salary);
    }
}