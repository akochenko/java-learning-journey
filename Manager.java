import java.util.Scanner;

public class Manager {
    private Diet diet;
    private Scanner scanner;

    // Default constructor
    public Manager() {
        diet = new Diet();
        scanner = new Scanner(System.in);
        mainMenu();
    }

    // Main menu method
    public void mainMenu() {
        int choice;
        do {
            System.out.println("========================");
            System.out.println("Main Menu");
            System.out.println("========================");
            System.out.println("1. Add Record");
            System.out.println("2. View Record");
            System.out.println("3. View All Records");
            System.out.println("4. Exit");
            System.out.print("Selection: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    addRecord();
                    break;
                case 2:
                    viewRecord();
                    break;
                case 3:
                    viewAllRecords();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    // Method to add a record
    public void addRecord() {
        System.out.println("========================");
        System.out.println("Add Record");
        System.out.println("========================");
        System.out.print("Enter date: ");
        String date = scanner.nextLine();
        System.out.print("Enter weight: ");
        int weight = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Entry entry = new Entry(date, weight);
        diet.addEntry(entry);
    }

    // Method to view a single record
    public void viewRecord() {
        System.out.println("========================");
        System.out.println("View Record");
        System.out.println("========================");
        System.out.print("Enter date: ");
        String date = scanner.nextLine();
        Entry entry = diet.getEntry(date);
        if (entry != null) {
            System.out.println("Date = " + entry.getDate());
            System.out.println("Weight = " + entry.getWeight());
        } else {
            System.out.println("Entry does not exist.");
        }
    }

    // Method to view all records
    public void viewAllRecords() {
        System.out.println("========================");
        System.out.println("View All Records");
        System.out.println("========================");
        diet.viewList();
    }

    // Main method
    public static void main(String[] args) {
        new Manager(); // Instantiate the Manager object
    }
}

