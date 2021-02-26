package lesson3.demo5;

public class Dog {
    private String type;
    private String name;

    public Dog() {
    }

    public Dog(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
