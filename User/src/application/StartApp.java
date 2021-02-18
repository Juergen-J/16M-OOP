package application;

import dao.Group;
import data.User;

public class StartApp {
    public static void main(String[] args) {
        Group users = new Group(10);

        User user01 = new User();
        User user02 = new User("user", "user", 99, "user", "user");
        User user03 = new User();
        User user04 = new User("Paper", "Rot", 16, "Papperoni", "123465");

        users.addUser(user01);
        users.addUser(user02);
        users.addUser(user03);
        users.addUser(user04);

        System.out.println(users.users[0].getStatus());
    }
}
