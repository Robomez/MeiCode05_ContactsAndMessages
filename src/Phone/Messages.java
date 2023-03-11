package Phone;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Messages extends ContentsStub{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void showList() {
        for (Message message: Menu.messages) {
            Contact receiver = message.getMessageContact();
            System.out.println("Sent to: " + receiver.getName() + ", Text: " + message.getMessageText());
        }
        Menu.messagesMenu();
    }

    @Override
    public void addItem() {
        Contact man = null;
        for (int i = 0; i < Menu.people.size(); i++) {
            man = Menu.people.get(i);
            System.out.println((i + 1) + ". Name: "  + man.getName() + ", Phone: " + man.getNumber());
        }
        int number = 0;
            try {
                System.out.println("Number of person you want to text: ");
                try {
                    man = Menu.people.get(scanner.nextInt() - 1);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("You don't have a contact with that number");
                    scanner.next();
                }
            } catch (InputMismatchException e) {
                System.out.println("Number must contain digits only");
                scanner.next();
            }
        System.out.println(man.getName());
        System.out.println("Message text: ");
        String text = scanner.next();
        //todo more than one word
        Menu.messages.add(new Message(man, text));
        Menu.messagesMenu();
    }
}
