package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//utility classes
public class FileManager {
    public static List<Employee> readEmployees(){
        List<Employee> employeeList = new ArrayList<>();

        try{
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String row;

            bufferedReader.readLine(); //read the header line so we can skip it
            while((row = bufferedReader.readLine()) != null){
                String[] brokenUpRow = row.split("\\|");

                int id = Integer.parseInt(brokenUpRow[0]); //change to an integer
                String name = brokenUpRow[1];
                float hoursWorked = Float.parseFloat(brokenUpRow[2]);
                double payRate = Double.parseDouble(brokenUpRow[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);

                employeeList.add(employee);
            }
        }
        catch(IOException ex){
            System.out.println("Could not read the file. Check the file try again.");
        }
        catch(Exception ex){
            System.out.println("Could not read data from the file. Check the format.");
        }
        return employeeList;
    }

    public static void writeEmployee(Employee employee){
        try{
            FileWriter fileWriter = new FileWriter("src/main/resources/employees.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line = String.format("%d|%s|%.2f|%.2f",
                    employee.getId(),
                    employee.getName(),
                    employee.getHoursWorked()
                    ,employee.getPayRate());

            bufferedWriter.newLine();
            bufferedWriter.write(line);

            bufferedWriter.close();

            System.out.println("Write complete!");
        }
        catch(IOException ex){
            System.out.println("Could not write to the file.");
        }
        catch(Exception ex){
            System.out.println("Error when handling the data.");
        }
    }
}
