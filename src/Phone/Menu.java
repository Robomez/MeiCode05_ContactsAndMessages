package Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static int answer;
    Contacts contacts = new Contacts();
    ArrayList<Contact> people = new ArrayList<>();

    public void baseMenu() {

        System.out.println("1. Manage contacts");
        System.out.println("2. Messages");
        System.out.println("3. Quit program");
        answer = scanner.nextInt();
        switch (answer) {
            case 1 -> contactsMenu();
            case 2 -> messagesMenu();
            case 3 -> System.exit(0);
            default -> baseMenu();
        }
    }

    public void contactsMenu() {
        System.out.println("1. Show all contacts");
        System.out.println("2. Add a new contact");
        System.out.println("3. Search for a contact");
        System.out.println("4. Delete a contact");
        System.out.println("5. Go back");
        answer = scanner.nextInt();
        switch (answer) {
//            case 1 -> contacts.showList();
//            case 2 -> contacts.addItem();
            case 5 -> baseMenu();
            default -> contactsMenu();
        }
    }

    public void messagesMenu() {
        System.out.println("1. Show all messages");
        System.out.println("2. Send a new message");
        System.out.println("3. Go back");
        answer = scanner.nextInt();
        switch (answer) {
            case 3 -> baseMenu();
            default -> messagesMenu();
        }
    }
}
