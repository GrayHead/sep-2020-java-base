package amps.demo3;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<User> users = new ArrayList<>();

//        users.add(new User(2, "kokos"));
//        users.add(new User(1, "ananas"));
//        users.add(new User(3, "banan"));
//        users.add(new User(5, "tomat"));
//        users.add(new User(3, "banan"));
//        users.add(new User(4, "potatos"));
//        users.add(new User(6, "mango"));
//        users.add(new User(1, "ananas"));

        List<User> collect = users.stream()
                .filter(user -> user.getId() > 3)
                .distinct()
                .sorted((o1, o2) -> o1.getId() - o2.getId())
                .collect(Collectors.toList());

        System.out.println(collect);


        Map<Integer, String> collect1 = users.stream()
                .filter(user -> user.getId() > 3)
                .distinct()
                .sorted(Comparator.comparingInt(User::getId))
                .collect(Collectors.toMap(User::getId, User::getName));

        System.out.println(collect1);


//        List<Integer> collect2 = users.stream()
//                .map(User::getId)
//                .collect(Collectors.toList());
//
//        System.out.println(collect2);


        users.forEach(System.out::println);

        Optional<User> first = users.stream().findFirst();
//        System.out.println(first.orElseGet(() -> new User(100500, "ajsgdahdgfs")));
        System.out.println(first.orElse(new User(1006006, "asgdhafdsytyqrwe6215321436214376")));

    }
}
