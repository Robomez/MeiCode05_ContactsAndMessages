package Phone;

import java.util.Scanner;

public interface ContentsStub {
    Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);

    //    Show all list method
    public void showList();

    //    Add a new item method
    public void addItem();

}
