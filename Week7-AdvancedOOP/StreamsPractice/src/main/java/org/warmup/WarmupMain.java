package org.warmup;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WarmupMain {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "alice", 70000),
                new Employee(2, "Bob", 80000),
                new Employee(3, "Charlie", 90000),
                new Employee(4, "Diana", 75000),
                new Employee(5, "Evan", 88000),
                new Employee(6, "Fiona", 85000),
                new Employee(7, "George", 94000),
                new Employee(8, "Hannah", 72000),
                new Employee(9, "Ian", 78000),
                new Employee(10, "Julia", 81000),
                new Employee(11, "Henrietta", 55000),
                new Employee(12, "Amelia", 67000),
                new Employee(13, "Arthur", 76000),
                new Employee(14, "Bella", 82000),
                new Employee(15, "Benjamin", 58000),
                new Employee(16, "Aaron", 63000)
        );

        //IMPERATIVE
        //Employees with salaries above 70k
        for(Employee employee : employees){
            if(employee.getSalary() > 70_000){
                //System.out.println(employee);
            }
        }

        //DECLARATIVE
        //The part inside the filter is called a lambda
        employees.stream().filter(emp -> emp.getSalary() > 70_000).toList();

        var lessThan50k = employees.stream().filter(x -> x.getSalary() < 60_000).toList();

        //display each employees info without a for loop
        lessThan50k.forEach(x -> System.out.println(x.getName()));

        //compound filters
        //Salaries between 50k and 75k
        var between50and75 = employees.stream()
                .filter(emp -> emp.getSalary() > 50_000 && emp.getSalary() < 75_000)
                .toList();

        //A list of people whose name starts with A
        var startsWithA = employees.stream()
                .filter(emp -> emp.getName().startsWith("A"))
                .toList();

//        Filtering: Use a stream to filter out employees with a salary greater
//        than 80k.

//      Mapping: Convert the stream of employees to a list of just their names.

        var listOfNames = employees.stream()
                .filter(emp -> emp.getSalary() > 75_000)
                .map(Employee::getName)
                .sorted()
                .toList();

        listOfNames.forEach(System.out::println);

//        Sorting: Sort the employees by their salary.

//        CHALLENGE: Get the average salary of all employees.
        //Average only pops up with mapToX
        var averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary) //method reference
                .average();

        //Aggregates (functions that total things up)
        //AVERAGE SUM MIN MAX COUNT

//        CHALLENGE: How many employees names start with A?
          var startsWithLetterA = employees.stream()
                  .filter(x -> x.getName().startsWith("A"))
                  .count();
    }
}
