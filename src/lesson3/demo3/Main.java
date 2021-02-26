package lesson3.demo3;

public class Main {
    public static void main(String[] args) {

        Human human = new Human() {
            @Override
            public void live() {
                System.out.println("kjgjagdjgsad100");
            }
        };
        human.live();

        Calculator calculator = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        calculator.calculate(10, 20); // 30

        Calculator calculator2 = (a, b) -> a - b;

        calculator2.calculate(10, 20); // -10

        Calculator calculator3 = (a, b) -> {
            int res = a * b;
            System.out.println(res);
            return res;
        };

        calculator3.calculate(10, 20);//200


    }
}


abstract class Human {
    private String name;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void live();
}


interface Calculator {
    int calculate(int a, int b);


}
