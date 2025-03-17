import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WaitingListManager manager = new WaitingListManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWaiting List Manager:");
            System.out.println("1. Add Person");
            System.out.println("2. Serve Person");
            System.out.println("3. Check if a Person is in the List");
            System.out.println("4. Display Waiting List");
            System.out.println("5. Show Waiting List Size");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    manager.addPerson(name);
                    break;
                case 2:
                    System.out.println(manager.servePerson());
                    break;
                case 3:
                    System.out.print("Enter name to check: ");
                    String checkName = scanner.nextLine();
                    System.out.println(checkName + " is in the list: " + manager.isPersonInList(checkName));
                    break;
                case 4:
                    manager.displayWaitingList();
                    break;
                case 5:
                    System.out.println("Waiting list size: " + manager.waitingListSize());
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}

