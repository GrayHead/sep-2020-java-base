package lesson1;

public class Start {

    public static void main(String[] args) {
//        System.out.println("hello okten");
//
//        int a = 100500;
//        System.out.println(a);
//        double PI = 3.14;
//        System.out.println(PI);
//        String name = "vasya";
//        System.out.println(name);
//        boolean b = true;  // > < >= <= == !=
//        System.out.println(b);
        // + - * / %


        User user = new User();
        user.setId(100);
        System.out.println(user); // id - 0
        int userId = user.getId();
        System.out.println(userId);
        String[] skills = new String[2];
        skills[0] = "java";
        skills[1] = "js";
//        System.out.println(Arrays.toString(skills));
        User user1 = new User(2, "kokos", skills);
        System.out.println(user1);

        Wallet wallet = new Wallet("leather", 10000);
        Wallet wallet2 = new Wallet("bamboo", 20000);

        User userWithWallet = new User(3, "max", skills, wallet2);
        System.out.println(userWithWallet);


        User userWithWallet2 = new User(
                4,
                "olya",
                new String[]{"html", "css"},
                "wood",
                500
        );


    } // end main m
} // end class
