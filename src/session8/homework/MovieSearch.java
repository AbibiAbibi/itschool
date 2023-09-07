package session8.homework;

import java.util.Scanner;

public class MovieSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] movieTitles = {
                "The Godfather",
                "The Dark Knight",
                "Pulp Fiction",
                "Forrest Gump",
                "Inception",
                "The Matrix"
        };

        System.out.println("List of movies:");
        for (String movie : movieTitles) {
            System.out.println(movie);
        }

        System.out.print("Enter a movie name: ");


        String searchTitle = scanner.nextLine();

        int position = linearSearch(movieTitles, searchTitle);

        if (position != -1) {
            System.out.println("The movie '" + searchTitle + "' was found at position " + position);
        } else {
            System.out.println("The movie '" + searchTitle + "' was not found in the list.");
        }
    }

    public static int linearSearch(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }
}