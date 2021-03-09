package lesson5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        User user = new User();
//        System.out.println(user.getId());
//
//        User user2 = new User();
//        System.out.println(user2.getId());
//
//        User user3 = new User();
//        System.out.println(user3.getId());


        ArrayList<User> users = new ArrayList<>();
        users.add(new User(2, "kokos"));
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));
        users.set(0, new User());

//        ArrayList<User> users2 = new ArrayList<>();
//        users2.add(new User(211, "kokos"));
//        users2.add(new User(211, "kokos"));
//        users2.add(new User(111, "ananas"));
//        users2.add(new User(311, "banan"));
//        users2.add(new User(311, "banan"));
//        users2.add(new User(511, "tomat"));
//        users2.add(new User(411, "potatos"));
//        users2.add(new User(611, "mango"));
//
//        users.addAll(users2);
//        System.out.println(users);
//
//        System.out.println(users.contains(new User()));
//        users.lastIndexOf(new User());
//        boolean remove = users.remove(new User());
//        users.remove(0);
//        System.out.println(users);
//
//        int i = users.indexOf(new User());
//        System.out.println(i);
//
//        List<User> users1 = users.subList(2, 4);
//
//        System.out.println(users1);
//


//        for (User user : users) {
//            if (user.getId() % 2 == 0) {
//                users.remove(user);
//            }
//        }
//
//        System.out.println(users);

        Iterator<User> iterator = users.iterator();


        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getId() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(users);

    }
}
