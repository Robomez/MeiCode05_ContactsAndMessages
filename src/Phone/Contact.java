package Phone;

public class Contact {
    private String name;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact(int number, String name) {
        this.name = name;
        this.number = number;
    }
}
