package Task1;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // lav en ArrayList af Customer-objekter
        ArrayList<Customer> customers = new ArrayList<>();

        // add nogle kunder til ArrayList'en
        customers.add(new Customer("Morten", "petersen", "morper123", 1));
        customers.add(new Customer("Janne", "Hansen", "jannehans456", 2));
        customers.add(new Customer("Abdi", "Olebijuni", "Ukendt123", 3));

        // hent metoden til at udskrive kunderne
        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        // Gennemfør ArrayList'en og udskriv info om hver kunde
        for (Customer customer : customers) {
            System.out.println("ID: " + customer.getid());
            System.out.println("Navn: " + customer.getfirstName() + " " + customer.getlastName());
            System.out.println("Brugernavn: " + customer.getuserName());
            System.out.println();
        }
    }
}