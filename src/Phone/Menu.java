package Phone;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
//    public static Scanner scanner = new Scanner(System.in);
    private static int answer = 0;
    public static ArrayList<Contact> people = new ArrayList<>();
    public static ArrayList<Message> messages = new ArrayList<>();

    public static void baseMenu() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("1. Manage contacts");
            System.out.println("2. Messages");
            System.out.println("3. Quit program");
            answer = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Only integers!");
            baseMenu();
        }
        switch (answer) {
            case 1 -> contactsMenu();
            case 2 -> messagesMenu();
            case 3 -> System.exit(0);
            default -> contactsMenu();
        }
    }

    public static void contactsMenu() {
        Scanner scanner = new Scanner(System.in);
        Contacts contacts = new Contacts();
        try {
            System.out.println("1. Show all contacts");
            System.out.println("2. Add a new contact");
            System.out.println("3. Search for a contact");
            System.out.println("4. Delete a contact");
            System.out.println("5. Go back");
            answer = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Only integers!");
            contactsMenu();
        }
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
        Scanner scanner = new Scanner(System.in);
        Messages messages = new Messages();
        try {
            System.out.println("1. Show all messages");
            System.out.println("2. Send a new message");
            System.out.println("3. Go back");
            answer = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Only integers!");
            messagesMenu();
        }
        switch (answer) {
            case 1 -> messages.showList();
            case 2 -> messages.addItem();
            case 3 -> baseMenu();
            default -> messagesMenu();
        }
    }
}
