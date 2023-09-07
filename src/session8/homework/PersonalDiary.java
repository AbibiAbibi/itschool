package session8.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PersonalDiary {

    public static void main(String[] args) {
        ArrayList<String> diaryEntries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Personal Diary Menu:");
            System.out.println("1. Add a new entry");
            System.out.println("2. Edit an existing entry");
            System.out.println("3. Delete an entry");
            System.out.println("4. Display all entries (latest first)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addEntry(diaryEntries, scanner);
                    break;
                case 2:
                    editEntry(diaryEntries, scanner);
                    break;
                case 3:
                    deleteEntry(diaryEntries, scanner);
                    break;
                case 4:
                    displayEntries(diaryEntries);
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static void addEntry(ArrayList<String> diaryEntries, Scanner scanner) {
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        for (String entry : diaryEntries) {
            if (entry.startsWith(date + ":")) {
                System.out.println("An entry for this date already exists.");
                return;
            }
        }

        System.out.print("Enter the diary entry: ");
        String entry = date + ":" + scanner.nextLine();
        diaryEntries.add(entry);

        Collections.sort(diaryEntries, new Comparator<String>() {
            @Override
            public int compare(String entry1, String entry2) {
                return entry2.compareTo(entry1);
            }
        });

        System.out.println("Entry added successfully.");
    }

    private static void editEntry(ArrayList<String> diaryEntries, Scanner scanner) {
        System.out.print("Enter the date of the entry to edit (YYYY-MM-DD): ");
        String dateToEdit = scanner.nextLine();

        int entryIndex = -1;

        for (int i = 0; i < diaryEntries.size(); i++) {
            String entry = diaryEntries.get(i);
            if (entry.startsWith(dateToEdit + ":")) {
                entryIndex = i;
                break;
            }
        }

        if (entryIndex != -1) {
            System.out.print("Enter the new diary entry: ");
            String newEntry = dateToEdit + ":" + scanner.nextLine();
            diaryEntries.set(entryIndex, newEntry);
            System.out.println("Entry edited successfully.");
        } else {
            System.out.println("Entry not found for the given date.");
        }
    }

    private static void deleteEntry(ArrayList<String> diaryEntries, Scanner scanner) {
        System.out.print("Enter the date of the entry to delete (YYYY-MM-DD): ");
        String dateToDelete = scanner.nextLine();

        int entryIndex = -1;

        for (int i = 0; i < diaryEntries.size(); i++) {
            String entry = diaryEntries.get(i);
            if (entry.startsWith(dateToDelete + ":")) {
                entryIndex = i;
                break;
            }
        }

        if (entryIndex != -1) {
            diaryEntries.remove(entryIndex);
            System.out.println("Entry deleted successfully.");
        } else {
            System.out.println("Entry not found for the given date.");
        }
    }

    private static void displayEntries(ArrayList<String> diaryEntries) {
        System.out.println("All Entries (latest first):");
        for (String entry : diaryEntries) {
            String[] parts = entry.split(":", 2);
            System.out.println(parts[0] + ": " + parts[1]);
        }
    }
}
