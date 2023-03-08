package Phone;

import java.io.IOException;
import java.util.InputMismatchException;

public class Contacts implements ContentsStub {

    @Override
    public void showList() {
        for (Contact contact : menu.people) {
            System.out.println("Name: " + contact.getName() + ", Number: " + contact.getNumber());
        }
        System.out.println("Go back - press Enter");
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        menu.contactsMenu();
    }

    @Override
    public void addItem() {
        System.out.println("Name: ");
        String name = scanner.next();
        int number = 0;
        while (true) {
            try {
                System.out.println("Number: ");
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Number must contain digits only");
                scanner.next();
            }
        }
        menu.people.add(new Contact(number, name));
        menu.contactsMenu();
    }

    public void searchContact() {
        System.out.println("Type in the name:");
        String name = scanner.next();
        for (Contact contact: menu.people) {
            if (contact.getName().equals(name)) {
                System.out.println("Name: " + contact.getName() + ", Number: " + contact.getNumber());
            }
        }
        System.out.println("Go back - press Enter");
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        menu.contactsMenu();
    }
}
