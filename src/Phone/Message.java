package Phone;

public class Message{
    private Contact messageContact;
    private String messageText;

    public Contact getMessageContact() {
        return messageContact;
    }

    public void setMessageContact(Contact messageContact) {
        this.messageContact = messageContact;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
