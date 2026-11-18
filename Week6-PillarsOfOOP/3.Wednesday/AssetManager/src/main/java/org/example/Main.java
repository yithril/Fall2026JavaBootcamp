package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        List<Asset> assets = new ArrayList<>();

        House house = new House("mansion", "now", 10000, "123 broadway street", 1, 5000, 2000);
        Vehicle vehicle = new Vehicle("Camry", "now", 10000, "Toyota", 2, 1000);

        assets.add(house);
        assets.add(vehicle);

    }
}