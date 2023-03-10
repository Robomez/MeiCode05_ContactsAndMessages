package Phone;

import java.io.IOException;
import java.util.InputMismatchException;

public class Contacts  extends ContentsStub {

    @Override
    public void showList() {
        for (Contact contact: Menu.people) {
            System.out.println("Name: " + contact.getName() + ", Number: " + contact.getNumber());
        }
        System.out.println("Go back - press Enter");
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Menu.contactsMenu();
    }

    @Override
    public void addItem() {
        System.out.println("Name: ");
        String name = Menu.scanner.next();
        int number = 0;
        while (true) {
            try {
                System.out.println("Number: ");
                number = Menu.scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Number must contain digits only");
                Menu.scanner.next();
            }
        }
        Menu.people.add(new Contact(number, name));
        Menu.contactsMenu();
    }

    public void searchContact() {
//        System.out.println("Type in the name:");
//        String name = scanner.next();
//        for (Contact contact: menu.people) {
//            if (contact.getName().equals(name)) {
//                System.out.println("Name: " + contact.getName() + ", Number: " + contact.getNumber());
//            }
//        }
//        System.out.println("Go back - press Enter");
//        try {
//            System.in.read();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        menu.contactsMenu();
    }
}
