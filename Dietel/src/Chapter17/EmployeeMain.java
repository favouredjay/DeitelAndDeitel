package Chapter17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("John", "Doe", 4990.00, "IT"),
                new Employee("Lucy", "Lace", 3000.00, "Sales"),
                new Employee("Light", "Banks", 3748.00, "IT")};
        List<Employee> list = Arrays.asList(employees);
        list.stream().forEach(System.out::println);

        Predicate<Employee> fourToSixThousand = e -> (e.getSalary() >= 4000.00 && e.getSalary() <= 6000.00);
        list.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .filter(fourToSixThousand)
                .findFirst()
                .get();

        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);
        System.out.println();
        System.out.println();
        list.stream()
                .sorted(lastThenFirst.reversed())
                .forEach(System.out::println);

        System.out.println();
        System.out.println();
        list.stream()
                .map(Employee::getFirstName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        Map<String, List<Employee>> groupedBy = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        groupedBy.forEach((department, employeesInDepartment) -> {
            System.out.println(department);
            employeesInDepartment.forEach(employee -> System.out.println(employee));
        });
    }
}