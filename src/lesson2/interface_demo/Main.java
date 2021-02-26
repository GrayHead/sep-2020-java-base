package lesson2.interface_demo;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Teacher teacher = new Teacher();
//        Runner[] runners = {user, teacher};
        checRunners(teacher);
        System.out.println(User.x);


    }

    public static void checRunners(Runner runner) {
        runner.doRun();

    }

}
