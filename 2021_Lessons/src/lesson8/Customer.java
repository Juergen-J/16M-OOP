package lesson8;

public class Customer {
    private String userID;
    private static int count = 1;

    public Customer() {
        userID = String.valueOf(count);
        count++;
    }

    public String getUserID() {
        return userID;
    }

    @Override
    public String       toString() {
        return "Customer{" +
                "userID='" + userID + '\'' +
                '}';
    }
}

class UserTest {
    public static void main(String[] args) {
        Customer user = new Customer();
        System.out.println(user);
        Customer user2 = new Customer();
        System.out.println(user2);
    }
}
