package Phone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Contacts contacts = new Contacts();
        ArrayList<Contact> people = new ArrayList<>();

        menu.baseMenu();
    }
}