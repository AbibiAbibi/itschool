package session8.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class CityList {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("San Francisco");
        cities.add("Miami");

        System.out.print("Enter a city name: ");
        String newCity = scanner.nextLine();

        if (cities.contains(newCity)) {
            System.out.println("This city is already in the list.");
        } else {
            cities.add(newCity);
            System.out.println("City added to the list.");
        }

        System.out.println("Updated City List:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}