package Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);
    private static int answer;
    public static ArrayList<Contact> people = new ArrayList<>();
    public static ArrayList<Message> messages = new ArrayList<>();

    public static void baseMenu() {

        answer = 0;
        System.out.println("1. Manage contacts");
        System.out.println("2. Messages");
        System.out.println("3. Quit program");
        answer = scanner.nextInt();
//        Todo exception int
        switch (answer) {
            case 1 -> contactsMenu();
            case 2 -> messagesMenu();
            case 3 -> System.exit(0);
            default -> baseMenu();
        }
    }

    public static void contactsMenu() {
        Contacts contacts = new Contacts();
        System.out.println("1. Show all contacts");
        System.out.println("2. Add a new contact");
        System.out.println("3. Search for a contact");
        System.out.println("4. Delete a contact");
        System.out.println("5. Go back");
        answer = scanner.nextInt();
        switch (answer) {
            case 1 -> contacts.showList();
            case 2 -> contacts.addItem();
            case 3 -> contacts.searchContact();
            case 4 -> contacts.deleteContact();
            case 5 -> baseMenu();
            default -> contactsMenu();
        }
    }

    public static void messagesMenu() {
        Messages messages = new Messages();
        System.out.println("1. Show all messages");
        System.out.println("2. Send a new message");
        System.out.println("3. Go back");
        answer = scanner.nextInt();
        switch (answer) {
            case 1 -> messages.showList();
            case 2 -> messages.addItem();
            case 3 -> baseMenu();
            default -> messagesMenu();
        }
    }
}
