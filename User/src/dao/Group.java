package dao;

import data.User;

public class Group {
    public User[] users;
    public int size;

    public Group(int capacity) {
        users = new User[capacity];
        size = 0;
    }

    public boolean addUser(User user) {
        if (size < users.length) {
            users[size] = user;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteUser(User user) {
        for (int i = 0; i < size; i++) {
            if (users[i].equals(user)) {
                users[i] = users[size - 1]; //students[i]=null
                //                students[size-1]=null;
                size--;
                return true;
            }
        }

        return false;
    }
}
