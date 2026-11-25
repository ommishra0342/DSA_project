
import java.util.*;

public class SimplePhoneDirectory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        HashMap<String, String> phone = new HashMap<>();

        int choice;

        do {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String number = sc.nextLine();

                    if (!phone.containsKey(name)) {
                        names.add(name);
                    }

                    phone.put(name, number);
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    System.out.println("Phone Directory:");
                    for (String n : names) {
                        System.out.println(n + " : " + phone.get(n));
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();

                    if (phone.containsKey(search)) {
                        System.out.println("Contact Found!");
                        System.out.println(search + " : " + phone.get(search));
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to delete: ");
                    String del = sc.nextLine();

                    if (phone.containsKey(del)) {
                        phone.remove(del);
                        names.remove(del);
                        System.out.println("Contact deleted!");
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Phone Directory...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
