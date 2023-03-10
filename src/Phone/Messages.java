package Phone;

import java.io.IOException;

public class Messages extends ContentsStub{
    @Override
    public void showList() {
        for (Message message: Menu.messages) {
            Contact receiver = message.getMessageContact();
            System.out.println("Sent to: " + receiver.getName() + ", Text: " + message.getMessageText());
        }
        System.out.println("Go back - press Enter");
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Menu.messagesMenu();
    }

    @Override
    public void addItem() {
        Contact man;
        for (int i = 0; i < Menu.people.size(); i++) {
            man = Menu.people.get(i);
            System.out.println((i + 1) + ". Name: "  + man.getName() + ", Number: " + man.getNumber());
        }
        System.out.println("Number of person you want to text: ");
        man = Menu.people.get(Menu.scanner.nextInt() - 1);
        System.out.println(man.getName());
        System.out.println("Message text: ");
        String text = Menu.scanner.next();
        Menu.messages.add(new Message(man, text));
        Menu.messagesMenu();
    }
}
