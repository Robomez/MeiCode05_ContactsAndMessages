package Phone;

public class Messages extends ContentsStub{
    @Override
    public void showList() {
        for (Message message: Menu.messages) {
            Contact receiver = message.getMessageContact();
            System.out.println("Sent to: " + receiver.getName() + ", Text: " + message.getMessageText());
        }
    }

    @Override
    public void addItem() {

    }
}
