package org.example;

public class Main {
    public static void main(String[] args) {
        StudentRoutine studentRoutine = new StudentRoutine();
        OfficeWorkerRoutine officeWorkerRoutine = new OfficeWorkerRoutine();

        studentRoutine.doRoutine();
        officeWorkerRoutine.doRoutine();
    }
}