package org.example;

import java.util.List;

public class MainSolution {
    public static void main(String[] args) {
        List<Person> database = PersonRepository.getPeople();

        // 1. Print the full names of all people who live in Texas.
        database.stream()
                .filter(person -> person.getState().equalsIgnoreCase("Texas"))
                .forEach(person -> System.out.println(person.getFullName()));

        // 2. Print the full names of all people who are teachers.
        database.stream()
                .filter(person -> person.getProfession().equalsIgnoreCase("Teacher"))
                .forEach(person -> System.out.println(person.getFullName()));

        // 3. Print the full names of people who earn more than $90,000.
        database.stream()
                .filter(person -> person.getYearlyIncome() > 90000)
                .forEach(person -> System.out.println(person.getFullName()));

        // 4. Print the full names of people who live in Florida and earn less than $60,000.
        database.stream()
                .filter(person -> person.getState().equalsIgnoreCase("Florida") && person.getYearlyIncome() < 60000)
                .forEach(person -> System.out.println(person.getFullName()));

        // 5. Print the full names of doctors who live in California.
        database.stream()
                .filter(person -> person.getProfession().equalsIgnoreCase("Doctor") && person.getState().equalsIgnoreCase("California"))
                .forEach(person -> System.out.println(person.getFullName()));

        // 6. Print the full names of people who do not live in New York.
        database.stream()
                .filter(person -> !person.getState().equalsIgnoreCase("New York"))
                .forEach(person -> System.out.println(person.getFullName()));

        // 7. Print the full names of engineers who earn more than $80,000.
        database.stream()
                .filter(person -> person.getProfession().equalsIgnoreCase("Engineer") && person.getYearlyIncome() > 80000)
                .forEach(person -> System.out.println(person.getFullName()));

        // 8. Print the full names of people who are not teachers and not doctors.
        database.stream()
                .filter(person -> !person.getProfession().equalsIgnoreCase("Teacher") && !person.getProfession().equalsIgnoreCase("Doctor"))
                .forEach(person -> System.out.println(person.getFullName()));

        // 9. Print the full names of people who live in Texas or Florida.
        database.stream()
                .filter(person -> person.getState().equalsIgnoreCase("Texas") || person.getState().equalsIgnoreCase("Florida"))
                .forEach(person -> System.out.println(person.getFullName()));

        // 10. Print the full names of people who earn between $50,000 and $100,000.
        database.stream()
                .filter(person -> person.getYearlyIncome() >= 50000 && person.getYearlyIncome() <= 100000)
                .forEach(person -> System.out.println(person.getFullName()));

        // 11. Count how many people live in Texas.
        long texasCount = database.stream()
                .filter(person -> person.getState().equalsIgnoreCase("Texas"))
                .count();
        System.out.println("People in Texas: " + texasCount);

        // 12. Count how many people are doctors.
        long doctorCount = database.stream()
                .filter(person -> person.getProfession().equalsIgnoreCase("Doctor"))
                .count();
        System.out.println("Doctors: " + doctorCount);

        // 13. Count how many people earn less than $60,000.
        long lowIncomeCount = database.stream()
                .filter(person -> person.getYearlyIncome() < 60000)
                .count();
        System.out.println("People earning < $60k: " + lowIncomeCount);

        // 14. Count how many people are not teachers.
        long notTeacherCount = database.stream()
                .filter(person -> !person.getProfession().equalsIgnoreCase("Teacher"))
                .count();
        System.out.println("People who are not teachers: " + notTeacherCount);

        // 15. Count how many people live in California and earn more than $90,000.
        long caHighEarners = database.stream()
                .filter(person -> person.getState().equalsIgnoreCase("California") && person.getYearlyIncome() > 90000)
                .count();
        System.out.println("California earners > $90k: " + caHighEarners);

        // 16. Find the average income of all people.
        double avgIncome = database.stream()
                .mapToDouble(Person::getYearlyIncome)
                .average()
                .orElse(0);
        System.out.println("Average income: " + avgIncome);

        // 17. Find the average income of teachers.
        double avgTeacherIncome = database.stream()
                .filter(person -> person.getProfession().equalsIgnoreCase("Teacher"))
                .mapToDouble(Person::getYearlyIncome)
                .average()
                .orElse(0);
        System.out.println("Average teacher income: " + avgTeacherIncome);

        // 18. Find the average income of people who live in New York.
        double avgNyIncome = database.stream()
                .filter(person -> person.getState().equalsIgnoreCase("New York"))
                .mapToDouble(Person::getYearlyIncome)
                .average()
                .orElse(0);
        System.out.println("Average NY income: " + avgNyIncome);

        // 19. Find the highest income in the list.
        double maxIncome = database.stream()
                .mapToDouble(Person::getYearlyIncome)
                .max()
                .orElse(0);
        System.out.println("Highest income: " + maxIncome);

        // 20. Find the highest income of anyone who is a doctor.
        double maxDoctorIncome = database.stream()
                .filter(person -> person.getProfession().equalsIgnoreCase("Doctor"))
                .mapToDouble(Person::getYearlyIncome)
                .max()
                .orElse(0);
        System.out.println("Highest doctor income: " + maxDoctorIncome);
    }
}
