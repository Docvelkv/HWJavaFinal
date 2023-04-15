import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1973, 3, 31);
        Employee emp1 = new Employee("Иван", "Иванов",
                "759 958 593 10", date1, "ИнфоТех", "Заведующий", 100);

        LocalDate date2 = LocalDate.of(1993, 5, 10);
        Employee emp2 = new Employee("Сидор", "Сидоров",
                "792 863 308 54", date2, "ИнфоТех", "Разработчик");

        System.out.println(emp1.getfullInfo());
        System.out.println(emp2.getFullName());
        System.out.println(emp1.toString());
        System.out.println(emp1.hashCode());
        System.out.println(emp2.toString());
        System.out.println(emp2.hashCode());
        System.out.printf("Сотрудники эквивалентны? - %s\n", emp1.equals(emp2));
        System.out.printf("Возраст Иванова %d лет. Возраст Сидорова %d лет.\t",
                emp1.ageEmployee(), emp2.ageEmployee());
        System.out.printf("Иванов старше чем Сидоров - %s\n", emp1.olderThan(emp2));
        emp1.upgrade(5);
        emp2.upgrade(15);
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
    }

}