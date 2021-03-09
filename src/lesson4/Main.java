package lesson4;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new LinkedList<>();

        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));

        System.out.println(users);

    }
}
