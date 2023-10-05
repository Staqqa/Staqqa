package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {


    void loadMenuData(String pathname) {

        ArrayList<String> coffeeMenu = new ArrayList<>();
        File file = new File(pathname);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                coffeeMenu.add(scanner.nextLine());
            }
            scanner.close();

            for (String menuItem : coffeeMenu) {
                System.out.println(menuItem);
            }

        } catch (FileNotFoundException e) {

            System.out.println("File not found. Check path and filename");

        }
    }

}
