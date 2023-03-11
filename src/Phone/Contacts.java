package Phone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contacts  extends ContentsStub {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void showList() {
        for (Contact contact: Menu.people) {
            System.out.println("Name: " + contact.getName() + ", Phone: " + contact.getNumber());
        }
        Menu.contactsMenu();
    }

    @Override
    public void addItem() {
        System.out.println("Name: ");
        String name = scanner.next();
        int number;
        while (true) {
            try {
                System.out.println("Phone: ");
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Phone number must contain digits only");
                scanner.next();
            }
        }
        Menu.people.add(new Contact(number, name));
        Menu.contactsMenu();
    }

    public void searchContact() {
        System.out.println("Type in the name:");
        String name = scanner.next();
        int foundCount = 0;
        for (Contact contact: Menu.people) {
            if (contact.getName().contains(name)) {
                System.out.println("Name: " + contact.getName() + ", Phone: " + contact.getNumber());
                foundCount++;
            }
        }
        if (foundCount == 0) {
            System.out.println("Not found");
        }
        Menu.contactsMenu();
    }

    public void deleteContact() {
        Contact man;
        if (Menu.people.size() == 0) {
            System.out.println("No contacts");
            Menu.contactsMenu();
        }
        for (int i = 0; i < Menu.people.size(); i++) {
             man = Menu.people.get(i);
            System.out.println((i + 1) + ". Name: "  + man.getName() + ", Phone: " + man.getNumber());
        }
        int number;
        while (true) {
            try {
                System.out.println("Number of person you want to delete: ");
                number = scanner.nextInt() - 1;
                break;
            } catch (InputMismatchException e) {
                System.out.println("Number must contain digits only");
                scanner.next();
            }
        }
        try {
            System.out.println("Deleting: " + Menu.people.get(number).getName());
        } catch (IndexOutOfBoundsException e) {
                System.out.println("You don't have a contact with that number");
                deleteContact();
        }
        Menu.people.remove(number);
        Menu.contactsMenu();
    }
}
