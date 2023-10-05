package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    int id;

    public Customer(String firstName, String lastName, String userName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = id;
    }
    

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getuserName() {
        return userName;
    }

    public int getid() {
        return id;
    }
}